package singh.pk.kolhappdemo.ui.activity.user_details;

import com.google.gson.JsonObject;


import java.util.List;

import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.Result;

public interface MainContect {

    interface Views {

        void showUsernfoResponse(KholApiPojo userInfo);

        void showApiResponseStatus(String status);

        void openAllUserDetails(Result userInfo);

    }

    interface Actions {

        void getUserInfoApiCall(JsonObject json);

        void getUserInfoResponse(KholApiPojo userInfo);

        void getApiCallResponse(String status);

    }
}
