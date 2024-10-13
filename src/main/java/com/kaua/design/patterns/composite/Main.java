package com.kaua.design.patterns.composite;

class Main {

    public static void main(String[] args) {
        // Criando os arquivos
        File file1 = new File("file1");
        File file2 = new File("file2");

        // Criando os diretórios
        Directory directory1 = new Directory("directory");
        Directory directory2 = new Directory("directory2");

        // Adicionando os arquivos aos diretórios
        directory1.addComponent(file1);
        directory1.addComponent(file2);
        directory2.addComponent(directory1);

        // Exibindo os detalhes
        directory2.showDetails();
    }
}
