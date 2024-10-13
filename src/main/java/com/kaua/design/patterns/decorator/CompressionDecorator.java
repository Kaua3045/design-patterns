package com.kaua.design.patterns.decorator;

class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decompress(data);
    }

    private String compress(String data) {
        System.out.println("Compressing data...");
        // Código de compressão...
        return data;  // Retornar o dado "comprimido"
    }

    private String decompress(String data) {
        System.out.println("Decompressing data...");
        // Código de descompressão...
        return data;  // Retornar o dado "descomprimido"
    }
}
