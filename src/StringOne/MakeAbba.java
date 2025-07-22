package StringOne;
/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"*/

public class MakeAbba {
    public static void main(String[] args){
        MakeAbba makeAbba = new MakeAbba();
        System.out.println(makeAbba.makeAbba("Hi","Bye"));
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
}
