package de.ostfalia.ftse.kunde.boundary;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class TestView implements Serializable {

    String hello;

    public TestView() {
        this.hello = "Hello World.";
    }

    public String getHello() {
        System.out.println("GETTER");
        return  hello;
    }

    public void setHello(String hello) {
        System.out.println("SETTER"+ hello);
        this.hello = hello;
    }

    public void meth(){
        System.out.println("METH");
    }
}
