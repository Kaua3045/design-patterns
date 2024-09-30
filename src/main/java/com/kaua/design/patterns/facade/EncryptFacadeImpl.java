package com.kaua.design.patterns.facade;

class EncryptFacadeImpl implements EncryptFacade {

    @Override
    public String encrypt(String message) {
        return "1234" + message;
    }
}
