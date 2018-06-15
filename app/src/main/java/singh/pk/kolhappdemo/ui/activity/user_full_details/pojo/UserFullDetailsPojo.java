package singh.pk.kolhappdemo.ui.activity.user_full_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserFullDetailsPojo {

    @SerializedName("response")
    @Expose
    private ResponseUserDetails response;

    public ResponseUserDetails getResponse() {
        return response;
    }

    public void setResponse(ResponseUserDetails responseUserDetails) {
        this.response = responseUserDetails;
    }
}
