package org.example;

public class Rationeloperation {
     /*
    Schritt 1: Führe Rechenoperationen mit zwei 'int' Werten aus (Addition, Subtraktion, Multiplikation, Division) und gib die Ergebnisse auf der Konsole aus.
    Schritt 2: Vergleiche 2 'int' Werte auf: größer, kleiner, Gleichheit und gib die Ergebnisse auf der Konsole aus.
    Schritt 3: Wiederhole die Schritte 1 und 2, aber nutze dieses Mal 'float' und 'double' Werte.
     */
    public static void main (String [] args) {
        int a = 20;
        int b = 5;
       // int a = 20, b=5 ;
        int add = a + b;
        int sub = a-b;
        int mul= a*b;
        int div =a/b;
        System.out.println("die rechenoperation\rsind"+"\t"+ add + "\n" + sub +"\n" + mul +"\n" + div);
        System.out.println(3+4);
       // test String methode
        String bonjour = "bonjour\rMalek sava aujourdhuil";
        System.out.println(bonjour.indexOf("k"));
        System.out.println(bonjour);
        String txt = "Hello\bWorld!";
        System.out.println(txt);
        // Comparision
        System.out.println(Math.max(a,b));
        if (a<b){
            System.out.println("b biger then a");
        }
        else if (a>b) {
            System.out.println("a biger then b");
        }
        else System.out.println("a equals b");
       // double and float comparision
        double x = 0.5;
        double y =0.5;
        double add2 = x + y;
        double sub2 = x-y;
        double mul2= x*y;
       double div2 =x/y;
        System.out.println("die rechenoperation\rsind"+"\t"+ add2 + "\t" + sub2 +"\t" + mul2 +"\t" + div2);
        if (x<y){
            System.out.println("y biger then x");
        }
        else if (x>y) {
            System.out.println("y biger then x");
        }
        else System.out.println("x equals y");
    }
}
