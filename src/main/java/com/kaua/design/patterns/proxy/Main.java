package com.kaua.design.patterns.proxy;

class Main {

    public static void main(String[] args) {
        Imagem imagem1 = new ImagemProxy("imagem1.jpg");
        Imagem imagem2 = new ImagemProxy("imagem2.jpg");

        // A imagem real é carregada apenas quando necessário
        imagem1.exibir(); // Carregando e exibindo imagem1
        imagem1.exibir(); // Apenas exibindo imagem1
        imagem2.exibir(); // Carregando e exibindo imagem2
    }
}
