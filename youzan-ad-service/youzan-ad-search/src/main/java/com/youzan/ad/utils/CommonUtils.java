package com.youzan.ad.utils;

import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by baimugudu on 2019/4/2
 */
public class CommonUtils {

    public static <K,V> V getVlaue(K key, Map<K,V> map,
                                   Supplier<V> supplier){
        return map.computeIfAbsent(key,
               k -> supplier.get() );

    }
 }
