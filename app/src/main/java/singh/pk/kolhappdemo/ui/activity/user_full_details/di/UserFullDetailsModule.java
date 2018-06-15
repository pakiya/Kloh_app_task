package singh.pk.kolhappdemo.ui.activity.user_full_details.di;

import dagger.Module;
import dagger.Provides;
import singh.pk.kolhappdemo.ui.activity.user_full_details.UserFullDetails;

@Module
public class UserFullDetailsModule {

    UserFullDetails userFullDetails;

    public UserFullDetailsModule(UserFullDetails userFullDetails) {
        this.userFullDetails = userFullDetails;
    }

    @Provides
    public UserFullDetails getUserFullDetails() {
        return userFullDetails;
    }
}
