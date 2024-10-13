package com.kaua.design.patterns.decorator;

class FileDataSource implements DataSource {

    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file: " + filename);
        // Código para escrever dados no arquivo...
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file: " + filename);
        // Código para ler dados do arquivo...
        return "Data from file";
    }
}
