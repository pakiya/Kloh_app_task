package singh.pk.kolhappdemo.ui.activity.user_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserCounts {

    @SerializedName("membersCount")
    @Expose
    private Integer membersCount;
    @SerializedName("requestsCount")
    @Expose
    private Object requestsCount;

    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public Object getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(Object requestsCount) {
        this.requestsCount = requestsCount;
    }


}
