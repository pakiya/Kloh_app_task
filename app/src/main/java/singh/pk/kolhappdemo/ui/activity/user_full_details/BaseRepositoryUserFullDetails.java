package singh.pk.kolhappdemo.ui.activity.user_full_details;

public class BaseRepositoryUserFullDetails<T extends BasePresenterUserFullDetails> {

    T actions;

    public void onAttach(T actions){
        this.actions = actions;
    }

    public T getActions() {
        return actions;
    }

}
