package com.justdojava.javabasic.hollis_basic_java.com.justdojava.design_principle.ocp.LSP;

public class Square extends RecTangle {

    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(long height) {
        super.setHeight(height);
    }

    @Override
    public long getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(long width) {
        super.setWidth(width);
    }
}
