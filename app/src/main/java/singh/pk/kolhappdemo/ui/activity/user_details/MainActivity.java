package singh.pk.kolhappdemo.ui.activity.user_details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.JsonObject;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import singh.pk.kolhappdemo.R;
import singh.pk.kolhappdemo.ui.activity.user_details.di.DaggerMainComponent;
import singh.pk.kolhappdemo.ui.activity.user_details.di.MainComponent;
import singh.pk.kolhappdemo.ui.activity.user_details.di.MainModule;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.Result;
import singh.pk.kolhappdemo.ui.activity.user_full_details.UserFullDetails;

public class MainActivity extends AppCompatActivity implements MainContect.Views {

    @BindView(R.id.user_list) RecyclerView recyclerView;
    @BindView(R.id.progress_bar)
    ProgressBar mPBLoading;

    @Inject
    MainPresenter mainPresenter;

    @Inject
    UserInfoAdapter userInfoAdapter;

    LinearLayoutManager manager;

    boolean pastEvent = false;
    int currentItem, totalItem, scrollOutItem;

    int start = 0;
    int count = 5 ;
    double lat = 12.926031;
    double lon = 77.676246;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DI inject
        ButterKnife.bind(this);

        //DI Dagger inject.
        MainComponent mainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
        mainComponent.injectMainActivity(this);

        initViews();

    }

    private void initViews() {

        manager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(userInfoAdapter);

        fetchData(lat, lon, start, count, true);


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    pastEvent = true;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                currentItem = manager.getChildCount();
                totalItem = manager.getItemCount();
                scrollOutItem = manager.findFirstVisibleItemPosition();

                if (pastEvent && (currentItem + scrollOutItem == totalItem)) {
                    fetchData(lat, lon, totalItem, count, pastEvent);
                    showProgress();
                }
            }
        });


    }

    private void fetchData(double latitude, double longitude, int startItem, int countItem, boolean pastEvenStatus) {

        // TODO: Execution hendel.

        JsonObject locationJSONObject = new JsonObject();
        JsonObject paginationJSONObject = new JsonObject();
        final JsonObject pastEventsJSONObject = new JsonObject();

        locationJSONObject.addProperty("lat", latitude);
        locationJSONObject.addProperty("lon", longitude);

        paginationJSONObject.addProperty("start", startItem);
        paginationJSONObject.addProperty("count", countItem);

        pastEventsJSONObject.addProperty("pastEvents", pastEvenStatus);
        pastEventsJSONObject.add("location", locationJSONObject);
        pastEventsJSONObject.add("pagination", paginationJSONObject);

        // API Call.
        mainPresenter.getUserInfoApiCall(pastEventsJSONObject);

    }

    @Override
    public void showUsernfoResponse(KholApiPojo userInfo) {
        userInfoAdapter.updateList(userInfo);
        pastEvent = false;
        removeProgress();
    }

    @Override
    public void showApiResponseStatus(String status) {
        removeProgress();
        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openAllUserDetails(Result userInfo) {

        //TODO: pass data in object.

        Intent intent = new Intent(MainActivity.this, UserFullDetails.class);
        intent.putExtra("image", userInfo.getOwnerProfileImageUrl());
        intent.putExtra("name", userInfo.getOwnerName());
        intent.putExtra("type", userInfo.getOwnerType());
        intent.putExtra("detail", userInfo.getDescription());
        startActivity(intent);
    }

    public void showProgress() { mPBLoading.setVisibility(View.VISIBLE); }
    public void removeProgress() { mPBLoading.setVisibility(View.GONE); }
}
