package singh.pk.kolhappdemo.ui.activity.user_details;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import singh.pk.kolhappdemo.R;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.KholApiPojo;
import singh.pk.kolhappdemo.ui.activity.user_details.pojo.Result;

public class UserInfoAdapter extends RecyclerView.Adapter<UserInfoAdapter.ViewHolder> {

    public List<Result> userInfoList = new ArrayList<>(0);

    MainActivity mainActivity;

    @Inject
    public UserInfoAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    public void updateList(KholApiPojo kholApiPojo){
//        userInfoList.clear();
        for (int i = 0; i<kholApiPojo.getResponse().getResults().size(); i++){
            userInfoList.add(kholApiPojo.getResponse().getResults().get(i));
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_info, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(userInfoList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return userInfoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Views
        @BindView(R.id.user_image) ImageView userImage;
        @BindView(R.id.header_text) TextView headerText;
        @BindView(R.id.user_image_icon) ImageView userProfileIcon;
        @BindView(R.id.sort_detail_text) TextView sortDetailTxt;
        @BindView(R.id.work_detail_text) TextView workDetailTxt;
        @BindView(R.id.info_image_icon) ImageView infoImageIcon;
        @BindView(R.id.user_item_list_relative_layout)
        RelativeLayout userFullDetail;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);


        }

        public void bind(final Result kholApiPojo, int position) {


            Picasso.get().load(kholApiPojo.getImageUrl())
                    .placeholder(R.drawable.ic_image_black_24dp).into(userImage);
            Picasso.get().load(kholApiPojo.getOwnerProfileImageUrl())
                    .placeholder(R.drawable.ic_person_black_24dp).into(userProfileIcon);
            headerText.setText(kholApiPojo.getTitle());
            sortDetailTxt.setText(kholApiPojo.getSummary());
            workDetailTxt.setText(kholApiPojo.getOwnerType());

            userFullDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainActivity.openAllUserDetails(kholApiPojo);
                }
            });
        }
    }
}
