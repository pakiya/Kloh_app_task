package singh.pk.kolhappdemo.ui.activity.user_details.pojo;

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
    @SerializedName("startTimeStamp")
    @Expose
    private double startTimeStamp;
    @SerializedName("endTimeStamp")
    @Expose
    private double endTimeStamp;
    @SerializedName("registrationEnd")
    @Expose
    private double registrationEnd;
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

    public double getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(Integer startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public double getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(Integer endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public double getRegistrationEnd() {
        return registrationEnd;
    }

    public void setRegistrationEnd(Integer registrationEnd) {
        this.registrationEnd = registrationEnd;
    }

    public List<String> getTimeTuples() {
        return timeTuples;
    }

    public void setTimeTuples(List<String> timeTuples) {
        this.timeTuples = timeTuples;
    }
}
