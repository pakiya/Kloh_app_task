package singh.pk.kolhappdemo.ui.activity.user_details;

import com.google.gson.JsonObject;

import javax.inject.Inject;

import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;

public class MainPresenter extends BasePresenterMain implements MainContect.Actions{

    MainActivity mainActivity;
    MainRepository mainRepository;

    @Inject
    public MainPresenter(MainActivity mainActivity, MainRepository mainRepository) {
        this.mainActivity = mainActivity;
        this.mainRepository = mainRepository;
        mainRepository.onAttach(this);

    }

    @Override
    public void getUserInfoApiCall(JsonObject json) {
        mainRepository.getUserData(json);
    }

    @Override
    public void getUserInfoResponse(KholApiPojo userInfo) {
        mainActivity.showUsernfoResponse(userInfo);
    }

    @Override
    public void getApiCallResponse(String status) {
        mainActivity.showApiResponseStatus(status);
    }
}
