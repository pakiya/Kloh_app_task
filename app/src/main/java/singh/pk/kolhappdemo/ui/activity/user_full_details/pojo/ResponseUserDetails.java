package singh.pk.kolhappdemo.ui.activity.user_full_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import singh.pk.kolhappdemo.ui.activity.user_details.pojo.UserCounts;

public class ResponseUserDetails {

    @SerializedName("activityUserStatus")
    @Expose
    private String activityUserStatus;
    @SerializedName("similarExperiences")
    @Expose
    private List<SimilarExperience> similarExperiences = null;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("remainingSlots")
    @Expose
    private Integer remainingSlots;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("ownerSummary")
    @Expose
    private String ownerSummary;
    @SerializedName("categoryIds")
    @Expose
    private List<String> categoryIds = null;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("ownerType")
    @Expose
    private String ownerType;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("dynamicImageUrl")
    @Expose
    private String dynamicImageUrl;
    @SerializedName("ownerProfileImageUrl")
    @Expose
    private String ownerProfileImageUrl;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("baseAmount")
    @Expose
    private Integer baseAmount;
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
    private Location_ location;

    public String getActivityUserStatus() {
        return activityUserStatus;
    }

    public void setActivityUserStatus(String activityUserStatus) {
        this.activityUserStatus = activityUserStatus;
    }



    public List<SimilarExperience> getSimilarExperiences() {
        return similarExperiences;
    }

    public void setSimilarExperiences(List<SimilarExperience> similarExperiences) {
        this.similarExperiences = similarExperiences;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getRemainingSlots() {
        return remainingSlots;
    }

    public void setRemainingSlots(Integer remainingSlots) {
        this.remainingSlots = remainingSlots;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getOwnerSummary() {
        return ownerSummary;
    }

    public void setOwnerSummary(String ownerSummary) {
        this.ownerSummary = ownerSummary;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDynamicImageUrl() {
        return dynamicImageUrl;
    }

    public void setDynamicImageUrl(String dynamicImageUrl) {
        this.dynamicImageUrl = dynamicImageUrl;
    }

    public String getOwnerProfileImageUrl() {
        return ownerProfileImageUrl;
    }

    public void setOwnerProfileImageUrl(String ownerProfileImageUrl) {
        this.ownerProfileImageUrl = ownerProfileImageUrl;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Integer baseAmount) {
        this.baseAmount = baseAmount;
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

    public Location_ getLocation() {
        return location;
    }

    public void setLocation(Location_ location) {
        this.location = location;
    }
}
