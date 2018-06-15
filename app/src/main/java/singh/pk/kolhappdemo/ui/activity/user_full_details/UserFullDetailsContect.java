package singh.pk.kolhappdemo.ui.activity.user_full_details;

import java.util.List;

import singh.pk.kolhappdemo.ui.activity.user_full_details.pojo.UserFullDetailsPojo;

public interface UserFullDetailsContect {

    interface Views {

        void showUserDetails(UserFullDetailsPojo userDetailList);

        void showApiRequestError(String error);

    }

    interface Actions {

        void getUserDetailsApiCall(String activity_id);

        void getUserDetailsResponse(UserFullDetailsPojo userDetailsInfo);

        void getApiReqquestError(String error);

    }
}
