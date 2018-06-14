package singh.pk.kolhappdemo.ui.activity.user_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
