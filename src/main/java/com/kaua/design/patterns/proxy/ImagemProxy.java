package com.kaua.design.patterns.proxy;

class ImagemProxy implements Imagem {

    private ImagemReal imagemReal;
    private final String nomeArquivo;

    public ImagemProxy(final String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nomeArquivo);
        }
        imagemReal.exibir();
    }
}
