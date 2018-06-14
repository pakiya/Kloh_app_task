package singh.pk.kolhappdemo.ui.activity.user_details.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
