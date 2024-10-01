package com.kaua.design.patterns.templatemethod;

abstract class ReportGenerator {

    public final void generateReport() {
        openFile();
        fetchData();
        formatData();
        writeData();
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening file...");
    }

    private void closeFile() {
        System.out.println("Closing file...");
    }

    protected abstract void fetchData();
    protected abstract void formatData();
    protected abstract void writeData();
}
