package com.mrigor.voting.util.exception;

/**
 * Created by Игорь on 03.02.2018.
 */
public class ExceptionUtil {
    public static <T> T checkNotFound(T object, int id){
        if(object==null) throw new NotFoundException("Not found entity with id="+id);
        return object;
    }
}
