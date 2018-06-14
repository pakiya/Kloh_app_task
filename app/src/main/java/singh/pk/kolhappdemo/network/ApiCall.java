package singh.pk.kolhappdemo.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;

public interface ApiCall {

    @POST("activity/list")
    Call<KholApiPojo> getUserInfo(@Body JsonObject jsonObject);

}
