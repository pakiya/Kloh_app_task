package singh.pk.kolhappdemo.ui.activity.user_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {

    @SerializedName("activityUserStatus")
    @Expose
    private String activityUserStatus;
    @SerializedName("userCounts")
    @Expose
    private UserCounts userCounts;
    @SerializedName("faqUrl")
    @Expose
    private String faqUrl;
    @SerializedName("shareUrl")
    @Expose
    private String shareUrl;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("ownerType")
    @Expose
    private String ownerType;
    @SerializedName("collaboratorsList")
    @Expose
    private Object collaboratorsList;
    @SerializedName("activityId")
    @Expose
    private String activityId;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("activityType")
    @Expose
    private String activityType;
    @SerializedName("paymentType")
    @Expose
    private String paymentType;
    @SerializedName("comingSoon")
    @Expose
    private Boolean comingSoon;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("activityTime")
    @Expose
    private ActivityTime activityTime;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("adminVerified")
    @Expose
    private Boolean adminVerified;
    @SerializedName("baseAmount")
    @Expose
    private Integer baseAmount;
    @SerializedName("facebookUrl")
    @Expose
    private String facebookUrl;
    @SerializedName("tax")
    @Expose
    private Integer tax;
    @SerializedName("taxString")
    @Expose
    private String taxString;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("activityOwner")
    @Expose
    private Boolean activityOwner;
    @SerializedName("ownerName")
    @Expose
    private String ownerName;
    @SerializedName("dynamicImageUrl")
    @Expose
    private String dynamicImageUrl;
    @SerializedName("ownerProfileImageUrl")
    @Expose
    private String ownerProfileImageUrl;
    @SerializedName("distance")
    @Expose
    private Object distance;
    @SerializedName("location")
    @Expose
    private Location location;

    public String getActivityUserStatus() {
        return activityUserStatus;
    }

    public void setActivityUserStatus(String activityUserStatus) {
        this.activityUserStatus = activityUserStatus;
    }

    public UserCounts getUserCounts() {
        return userCounts;
    }

    public void setUserCounts(UserCounts userCounts) {
        this.userCounts = userCounts;
    }

    public String getFaqUrl() {
        return faqUrl;
    }

    public void setFaqUrl(String faqUrl) {
        this.faqUrl = faqUrl;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
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

    public Object getCollaboratorsList() {
        return collaboratorsList;
    }

    public void setCollaboratorsList(Object collaboratorsList) {
        this.collaboratorsList = collaboratorsList;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Boolean getComingSoon() {
        return comingSoon;
    }

    public void setComingSoon(Boolean comingSoon) {
        this.comingSoon = comingSoon;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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

    public Boolean getAdminVerified() {
        return adminVerified;
    }

    public void setAdminVerified(Boolean adminVerified) {
        this.adminVerified = adminVerified;
    }

    public Integer getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Integer baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getTaxString() {
        return taxString;
    }

    public void setTaxString(String taxString) {
        this.taxString = taxString;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getActivityOwner() {
        return activityOwner;
    }

    public void setActivityOwner(Boolean activityOwner) {
        this.activityOwner = activityOwner;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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

    public Object getDistance() {
        return distance;
    }

    public void setDistance(Object distance) {
        this.distance = distance;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
