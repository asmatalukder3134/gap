package com.gap;

public class A {

}
abstract class InterviewBit{
    public abstract void printMessage();
 }
 class ScalarAcademy extends InterviewBit{
    public void printMessage(){
        System.out.println("Welcome to Scalar Academy By InterviewBit");
    }
 }
 class ScalarTopics extends ScalarAcademy{
    public void printMessage(){
        System.out.println("Welcome to Scalar Topics By Scalar Academy");
    }
 
//public class Ma{
//	//public static void main(String[] args) {
// 	    InterviewBit ib = new ScalarTopics();
// 	   // ib.printMessage();
//	}
}

