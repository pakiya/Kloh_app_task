package singh.pk.kolhappdemo.ui.activity.user_full_details.di;

import dagger.Component;
import singh.pk.kolhappdemo.ui.activity.user_full_details.UserFullDetails;

@Component (modules = UserFullDetailsModule.class)
public interface UserFullDetailsComponent {

    void injectUserFullDetailsActivity(UserFullDetails userFullDetails);
}
