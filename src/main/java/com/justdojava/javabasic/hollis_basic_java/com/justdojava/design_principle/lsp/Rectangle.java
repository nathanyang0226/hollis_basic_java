package com.justdojava.javabasic.hollis_basic_java.com.justdojava.design_principle.lsp;

public class Rectangle implements Quadrangle {

    private long width;
    private long height;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}