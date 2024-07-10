package javabasics;

public class MethodLoading {

    public static void main(String[] args) {

        MethodLoading m = new MethodLoading();
        m.m1(100);
    }

    public void m1(int a){
        System.out.println(a);
    }

    public void m1(String a){
        System.out.println(a);
    }

    public void m1(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(String a , int b){
        System.out.println(a);
        System.out.println(b);
    }
}
