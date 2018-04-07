package timuruktus.ru.yandexgallery.presentation.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.android.SupportFragmentNavigator;
import ru.terrakok.cicerone.commands.Command;
import timuruktus.ru.yandexgallery.R;
import timuruktus.ru.yandexgallery.data.MyApp;
import timuruktus.ru.yandexgallery.presentation.onboarding.OnboardingFragment;

import static timuruktus.ru.yandexgallery.presentation.onboarding.OnboardingFragment.ONBOARDING_ID;

public class MainActivity extends AppCompatActivity {

    private Navigator navigator = new SupportFragmentNavigator(getSupportFragmentManager(),
            R.id.container){
        @Override
        protected Fragment createFragment(String fragmentTag, Object data){
            switch(fragmentTag){
                case(ONBOARDING_ID):
                    return OnboardingFragment.getInstance();
                default:
                    throw new RuntimeException("Unknown screen key!");
            }
        }

        @Override
        protected void setupFragmentTransactionAnimation(Command command, Fragment currentFragment, Fragment nextFragment, FragmentTransaction fragmentTransaction){
            super.setupFragmentTransactionAnimation(command, currentFragment, nextFragment, fragmentTransaction);
//            fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }

        @Override
        protected void showSystemMessage(String message){
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void exit(){
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();
        MyApp.INSTANCE.getNavigatorHolder().setNavigator(navigator);
    }

    @Override
    protected void onPause(){
        super.onPause();
        MyApp.INSTANCE.getNavigatorHolder().removeNavigator();
    }
}
