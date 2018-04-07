package timuruktus.ru.yandexgallery.business;

import timuruktus.ru.yandexgallery.business.CacheSelector;


/**
 * CachePolicy class defines how repository should work with data
 * from "data" layer (web, some other input)
 */
public class CachePolicy {

    //How many object should be cached when the data returned
    private int cacheObjectsCount;
    private Policy policy = Policy.CACHE_ALL;
    private CacheSelector cacheSelector;

    public CachePolicy(int cacheObjectsCount, Policy policy, CacheSelector cacheSelector) {
        this.cacheObjectsCount = cacheObjectsCount;
        this.policy = policy;
        this.cacheSelector = cacheSelector;
    }

    public CachePolicy() {
    }

    public int getCacheObjectsCount() {
        return cacheObjectsCount;
    }

    public void setCacheObjectsCount(int cacheObjectsCount) {
        this.cacheObjectsCount = cacheObjectsCount;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public CacheSelector getCacheSelector() {
        return cacheSelector;
    }

    public void setCacheSelector(CacheSelector cacheSelector) {
        this.cacheSelector = cacheSelector;
    }

    /**
     * Policy enum defines the ways to cache objects
     */
    enum Policy{
        //Repository will not cache any objects in persistent storage
        NO_CACHE,
        //Repository will cache all objects in persistent storage
        CACHE_ALL,
        //Repository will cache several first objects in persistent storage
        CACHE_SEVERAL,
        //Repository will cache objects by custom logic in persistent storage
        //using CacheSelector class
        CACHE_BY_LOGIC
    }
}
