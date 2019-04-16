package com.luoye.portal.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {

    private static Gson gson=null;

    static {
        GsonBuilder gsonBuilder  = new GsonBuilder();
        gson=gsonBuilder.create();
    }

    public static String toJson(Object o){
        return gson.toJson(o);
    }

    public static <T> T fromJson(Class<T> clazz, String str){
        return gson.fromJson(str,clazz);
    }
}
