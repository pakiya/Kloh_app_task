package singh.pk.kolhappdemo.ui.activity.user_full_details;

import android.content.Context;

import com.fatboyindustrial.gsonjodatime.DateTimeConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.joda.time.DateTime;

import java.io.File;

import javax.inject.Inject;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import singh.pk.kolhappdemo.BuildConfig;
import singh.pk.kolhappdemo.network.ApiCall;
import singh.pk.kolhappdemo.ui.activity.user_full_details.pojo.UserFullDetailsPojo;

public class UserFullDetailsRepository extends BaseRepositoryUserFullDetails<UserFullDetailsPresenter> {

    UserFullDetails userFullDetails;
    Retrofit retrofit;
    ApiCall apiCall;

    @Inject
    public UserFullDetailsRepository(UserFullDetails userFullDetails) {
        this.userFullDetails = userFullDetails;
        retrofitInstance();
        apiCall = retrofit.create(ApiCall.class);
    }

    private void retrofitInstance() {
        OkHttpClient okHttpClient = okHttpClient(loggingInterceptor(), cache(cacheFile(userFullDetails)));
        retrofit = retrofit(okHttpClient, gson());
    }

    public Retrofit retrofit (OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl(BuildConfig.KOLH_API_CALL_BASE_URL)
                .build();
    }

    public Gson gson () {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
        return gsonBuilder.create();
    }

    public HttpLoggingInterceptor loggingInterceptor () {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
//                Log.e(NetworkModule.class.getSimpleName(), message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    public Cache cache (File cacheFile) {
        return new Cache(cacheFile, 10*1000 * 1000); //10MB Cache
    }

    public File cacheFile(Context context) {
        return new File(context.getCacheDir(), "okhttp_cache");
    }

    public OkHttpClient okHttpClient(HttpLoggingInterceptor loggingInterceptor, Cache cache) {
        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .cache(cache)
                .build();
    }


    public void getUserFullDetails(String activity) {

        Call<UserFullDetailsPojo> call = apiCall.getUserFullDetails(activity);
        call.enqueue(new Callback<UserFullDetailsPojo>() {
            @Override
            public void onResponse(Call<UserFullDetailsPojo> call, Response<UserFullDetailsPojo> response) {
                if (response.code() == 200) {
                    UserFullDetailsPojo userFullDetailsPojo = response.body();
                    getActions().getUserDetailsResponse(userFullDetailsPojo);
                } else {
                    getActions().getApiReqquestError("Data to fetch!");
                }
            }

            @Override
            public void onFailure(Call<UserFullDetailsPojo> call, Throwable t) {
                getActions().getApiReqquestError(t.getMessage());
            }
        });

    }
}
