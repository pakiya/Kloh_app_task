package singh.pk.kolhappdemo.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;
import singh.pk.kolhappdemo.ui.activity.user_full_details.pojo.UserFullDetailsPojo;

public interface ApiCall {

    @POST("activity/list")
    Call<KholApiPojo> getUserInfo(@Body JsonObject jsonObject);

    @GET("activity/{activityId}")
    Call<UserFullDetailsPojo> getUserFullDetails(@Path("activityId") String activityId);

}
