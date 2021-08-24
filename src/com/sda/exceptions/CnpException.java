package com.sda.exceptions;

// Exception este copilul lui Throwable
public class CnpException extends Exception {

    public CnpException(String message) {
        // apelam constructorul din clasa parinte
        super(message);
    }
}
