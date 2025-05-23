import java.io.*;

//interface declared
interface testInterface{

    //public,static and final
    final int a = 10;
    int b = 5;
    int c = 8;

    //public and abstract
    void display();
    void method1();
    void method2();
}

//class implementing interface
class Testclass implements testInterface{

    //implementing the capabilites
    //interface
    public void display(){
        System.out.println("This a interface example");
    }
    public void method1(){
        System.out.println("This a interface example");
    }
    public void method2(){
        System.out.println("This a interface example");
    }
}

class Interface{
    public static void main(String[] args) {
        Testclass t = new Testclass();
        t.display();
        t.method1();
        t.method2();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}
