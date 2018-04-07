package timuruktus.ru.yandexgallery.models.errors;

public class NoInternetException extends Exception {

    @Override
    public String getMessage() {
        return "There was no internet connection during the operation";
    }
}
