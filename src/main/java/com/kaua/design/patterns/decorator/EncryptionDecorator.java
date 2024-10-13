package com.kaua.design.patterns.decorator;

class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }

    private String encrypt(String data) {
        System.out.println("Encrypting data...");
        // Código de criptografia...
        return data;  // Retornar o dado "criptografado"
    }

    private String decrypt(String data) {
        System.out.println("Decrypting data...");
        // Código de descriptografia...
        return data;  // Retornar o dado "descriptografado"
    }
}
