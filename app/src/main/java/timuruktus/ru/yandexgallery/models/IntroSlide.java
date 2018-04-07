package timuruktus.ru.yandexgallery.models;


public class IntroSlide {

    private boolean canMoveBack = false;
    private boolean canMoveForward = false;
    private String text;
    private String title;
    private int icon;

    public IntroSlide(boolean canMoveBack, boolean canMoveForward, String text, String title, int icon) {
        this.canMoveBack = canMoveBack;
        this.canMoveForward = canMoveForward;
        this.text = text;
        this.title = title;
        this.icon = icon;
    }

    public IntroSlide() {
    }

    public boolean isCanMoveBack() {
        return canMoveBack;
    }

    public void setCanMoveBack(boolean canMoveBack) {
        this.canMoveBack = canMoveBack;
    }

    public boolean isCanMoveForward() {
        return canMoveForward;
    }

    public void setCanMoveForward(boolean canMoveForward) {
        this.canMoveForward = canMoveForward;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
