package com.kaua.design.patterns.decorator;

class Main {

    public static void main(String[] args) {
        DataSource source = new FileDataSource("myfile.txt");

        // Adicionando compressão e criptografia com os decorators
        DataSource compressedEncrypted = new CompressionDecorator(new EncryptionDecorator(source));

        // Usando o objeto decorado
        compressedEncrypted.writeData("Important data");
        String result = compressedEncrypted.readData();

        System.out.println("Final result: " + result);
    }
}
