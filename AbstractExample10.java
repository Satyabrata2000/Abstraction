package Abstraction;

public class AbstractExample10 {

    public static void main(String[] args) {

        AbstractExample7 obj;
        obj = new AbstractExample8();
        System.out.println("Rate of interest is " + obj.getRateOfInterest() + "%");
        obj = new AbstractExample9();
        System.out.println("Rate of intereste is " + obj.getRateOfInterest() + "%");
    }
}
