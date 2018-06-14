package singh.pk.kolhappdemo.ui.activity.user_details.di;

import dagger.Component;
import singh.pk.kolhappdemo.ui.activity.user_details.MainActivity;

@Component (modules = MainModule.class)
public interface MainComponent {

    void injectMainActivity(MainActivity mainActivity);

}
