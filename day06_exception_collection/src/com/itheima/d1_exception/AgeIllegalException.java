package com.itheima.d1_exception;

public class AgeIllegalException extends RuntimeException{

    public AgeIllegalException(){
       super();
    }

    public AgeIllegalException(String message){
        super(message);
    }
}
