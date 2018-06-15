package singh.pk.kolhappdemo.ui.activity.user_full_details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import singh.pk.kolhappdemo.R;
import singh.pk.kolhappdemo.ui.activity.user_full_details.di.DaggerUserFullDetailsComponent;
import singh.pk.kolhappdemo.ui.activity.user_full_details.di.UserFullDetailsComponent;
import singh.pk.kolhappdemo.ui.activity.user_full_details.di.UserFullDetailsModule;
import singh.pk.kolhappdemo.ui.activity.user_full_details.pojo.UserFullDetailsPojo;

public class UserFullDetails extends AppCompatActivity implements UserFullDetailsContect.Views{

    @BindView(R.id.person_image)
    ImageView imageView;
    @BindView(R.id.person_name_txt)
    TextView userName;
    @BindView(R.id.distance_txt)
    TextView userType;
    @BindView(R.id.status)
    TextView userStatus;
    @BindView(R.id.back_image_view) ImageView backBtn;
    @BindView(R.id.username_top_toolbar) TextView userNameToolBar;

    @Inject
    UserFullDetailsPresenter userFullDetailsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_full_details);

        ButterKnife.bind(this);

        UserFullDetailsComponent userFullDetailsComponent = DaggerUserFullDetailsComponent.builder().userFullDetailsModule(new UserFullDetailsModule(this)).build();
        userFullDetailsComponent.injectUserFullDetailsActivity(this);

        initView();

    }

    private void initView() {

        String activityId = (String) getIntent().getExtras().get("activity_id");
        Log.d("activity_id", activityId);
        userFullDetailsPresenter.getUserDetailsApiCall(activityId);

    }

    @Override
    public void showUserDetails(UserFullDetailsPojo userDetailList) {

        Picasso.get().load(userDetailList.getResponse().getImageUrl()).placeholder(R.drawable.ic_image_black_24dp).into(imageView);
        userName.setText(userDetailList.getResponse().getOwnerName());
        userNameToolBar.setText(userDetailList.getResponse().getOwnerName());
        userType.setText(userDetailList.getResponse().getOwnerType());
        userStatus.setText(userDetailList.getResponse().getOwnerSummary());

    }

    @Override
    public void showApiRequestError(String error) {
        Toast.makeText(this, "Data to fetch!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
