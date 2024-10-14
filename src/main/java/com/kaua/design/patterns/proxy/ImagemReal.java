package com.kaua.design.patterns.proxy;

class ImagemReal implements Imagem {

    private final String nomeArquivo;

    public ImagemReal(final String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarImagemDoDisco();
    }

    private void carregarImagemDoDisco() {
        System.out.println("Carregando imagem: " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem: " + nomeArquivo);
    }
}
