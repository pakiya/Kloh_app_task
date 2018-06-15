package singh.pk.kolhappdemo.ui.activity.user_full_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SimilarExperience {

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("ownerProfileImageUrl")
    @Expose
    private String ownerProfileImageUrl;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("activityTime")
    @Expose
    private ActivityTime activityTime;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ownerName")
    @Expose
    private String ownerName;
    @SerializedName("activityId")
    @Expose
    private String activityId;
    @SerializedName("location")
    @Expose
    private Location location;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwnerProfileImageUrl() {
        return ownerProfileImageUrl;
    }

    public void setOwnerProfileImageUrl(String ownerProfileImageUrl) {
        this.ownerProfileImageUrl = ownerProfileImageUrl;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public ActivityTime getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(ActivityTime activityTime) {
        this.activityTime = activityTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
