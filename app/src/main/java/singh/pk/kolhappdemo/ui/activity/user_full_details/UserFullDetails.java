package singh.pk.kolhappdemo.ui.activity.user_full_details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import singh.pk.kolhappdemo.R;

public class UserFullDetails extends AppCompatActivity {

    @BindView(R.id.person_image)
    ImageView imageView;
    @BindView(R.id.person_name_txt)
    TextView userName;
    @BindView(R.id.details)
    TextView userDistance;
    @BindView(R.id.distance_txt)
    TextView userType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_full_details);

        ButterKnife.bind(this);

        String imageUrl= (String) getIntent().getExtras().get("image");
        String name= (String) getIntent().getExtras().get("name");
        String type= (String) getIntent().getExtras().get("type");
        String detail= (String) getIntent().getExtras().get("detail");

        Picasso.get().load(imageUrl).placeholder(R.drawable.ic_image_black_24dp).into(imageView);
        userName.setText(name);
        userType.setText(type);
        userDistance.setText(detail);

    }
}
