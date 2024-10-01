package com.kaua.design.patterns.templatemethod;

class SalesReportGenerator extends ReportGenerator {

    @Override
    protected void fetchData() {
        System.out.println("Fetching sales data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing sales data...");
    }
}
