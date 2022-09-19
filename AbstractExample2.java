package Abstraction;

class AbstractExample2 extends AbstractExample1 {

    @Override
    void use() {
        System.out.println("String 1");
    }

    public static void main(String[] args) {
        AbstractExample2 obj = new AbstractExample2();
        obj.use();
    }
}
