package com.kaua.design.patterns.decorator;

interface DataSource {

    void writeData(String data);
    String readData();
}
