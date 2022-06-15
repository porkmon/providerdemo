package com.provider.example.providerdemo.test;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/31 11:50
 * @Version 1.0
 */
public class ExtentTest {
    public static void main(String[] args) {
        Son son = new Son();
        //System.out.println(son.name);
    }
}
class Father{
    public String name="father";
    Father(){
        out();
    }
    public String getName() {
        return name;
    }


    public void out(){
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Son extends Father{
    public String name="son";
    Son(){
        System.out.println("son:"+super.name);
    }
    public String getName() {

        return name;
    }
    /*@Override
    public void out(){
        System.out.println(name);
    }*/
    public void setName(String name) {
        this.name = name;
    }
}
class Son1 extends Father{
    @Override
    public void out() {
        System.out.println(name);
    }
}