package timuruktus.ru.yandexgallery.presentation.onboarding;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class OnboardingFragment extends MvpAppCompatFragment implements IOnboaringView {

    @InjectPresenter
    OnboardingPresenter presenter;
    public static final String ONBOARDING_ID = "Onboarding Fragment Id";

    public static OnboardingFragment getInstance(){
        return new OnboardingFragment();
    }



}
