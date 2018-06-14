package singh.pk.kolhappdemo.ui.activity.user_details;

public class BaseRepositoryMain<T extends BasePresenterMain> {

    T actions;

    public void onAttach(T actions){
        this.actions = actions;
    }

    public T getActions() {
        return actions;
    }
}
