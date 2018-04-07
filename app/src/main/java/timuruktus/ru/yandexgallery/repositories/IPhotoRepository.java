package timuruktus.ru.yandexgallery.repositories;

import io.reactivex.Observable;
import timuruktus.ru.yandexgallery.business.CachePolicy;
import timuruktus.ru.yandexgallery.models.Photo;

public interface IPhotoRepository {

    Observable<Photo> getNewestPhotosFromWeb(CachePolicy cachePolicy);
    Observable<Photo> getNewestPhotosFromCache();
}
