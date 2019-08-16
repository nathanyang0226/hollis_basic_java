package com.justdojava.javabasic.hollis_basic_java.com.justdojava.design_principle.ocp;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

  public Double getDiscountPrice(){
        return super.getPrice()*0.61;
  }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }
}
