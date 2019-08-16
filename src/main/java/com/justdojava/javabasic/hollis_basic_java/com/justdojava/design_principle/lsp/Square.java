package com.justdojava.javabasic.hollis_basic_java.com.justdojava.design_principle.lsp;

public class Square implements Quadrangle {

    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }
}
