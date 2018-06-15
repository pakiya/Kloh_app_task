package singh.pk.kolhappdemo.ui.activity.user_full_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActivityTime {

    @SerializedName("activityDateString")
    @Expose
    private String activityDateString;
    @SerializedName("activityDateStringV1")
    @Expose
    private String activityDateStringV1;
    @SerializedName("timeTuples")
    @Expose
    private List<String> timeTuples = null;

    public String getActivityDateString() {
        return activityDateString;
    }

    public void setActivityDateString(String activityDateString) {
        this.activityDateString = activityDateString;
    }

    public String getActivityDateStringV1() {
        return activityDateStringV1;
    }

    public void setActivityDateStringV1(String activityDateStringV1) {
        this.activityDateStringV1 = activityDateStringV1;
    }


    public List<String> getTimeTuples() {
        return timeTuples;
    }

    public void setTimeTuples(List<String> timeTuples) {
        this.timeTuples = timeTuples;
    }
}
