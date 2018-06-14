package singh.pk.kolhappdemo.ui.activity.user_details.di;

import dagger.Module;
import dagger.Provides;
import singh.pk.kolhappdemo.ui.activity.user_details.MainActivity;

@Module
public class MainModule {

    MainActivity mainActivity;

    public MainModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    public MainActivity getMainActivity(){
        return mainActivity;
    }
}
