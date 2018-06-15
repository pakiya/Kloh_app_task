package singh.pk.kolhappdemo.ui.activity.user_full_details;

import java.util.List;

import javax.inject.Inject;

import singh.pk.kolhappdemo.ui.activity.user_full_details.pojo.UserFullDetailsPojo;

public class UserFullDetailsPresenter extends BasePresenterUserFullDetails implements UserFullDetailsContect.Actions {

    UserFullDetails userFullDetails;
    UserFullDetailsRepository userFullDetailsRepository;

    @Inject
    public UserFullDetailsPresenter(UserFullDetails userFullDetails, UserFullDetailsRepository userFullDetailsRepository) {
        this.userFullDetails = userFullDetails;
        this.userFullDetailsRepository = userFullDetailsRepository;
        userFullDetailsRepository.onAttach(this);
    }

    @Override
    public void getUserDetailsApiCall(String activity_id) {
        userFullDetailsRepository.getUserFullDetails(activity_id);
    }

    @Override
    public void getUserDetailsResponse(UserFullDetailsPojo userDetailsInfo) {
        userFullDetails.showUserDetails(userDetailsInfo);
    }

    @Override
    public void getApiReqquestError(String error) {

    }
}
