package timuruktus.ru.yandexgallery.business;

public interface CacheSelector<V> {

    boolean shouldCache(V object);
}
