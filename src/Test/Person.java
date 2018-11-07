package Test;
/**
*@Date 2018/7/23  17:21
**/
public class Person {

    String name;

    static class Dog {
        String name;
    }

    static class Pack {
        String name;
    }

    void slip(Pack p, Dog d) {
        System.out.println(name + "在" + p.name + "溜" + d.name);
    }

    public static void main(String[] args) {
        Pack p = new Pack();
        p.name = "朝阳公园";
        Dog d = new Dog();
        d.name = "旺财";
        Person pe = new Person();
        pe.name = "小美";
        pe.slip(p, d);
    }

}
