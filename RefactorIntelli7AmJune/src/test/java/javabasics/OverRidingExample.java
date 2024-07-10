package javabasics;

public class OverRidingExample extends Sample{

    public static void main(String[] args) {
        Sample ride = new Sample();
        ride.m1();
    }

    public void m1(){
        System.out.println("or");
    }
}
