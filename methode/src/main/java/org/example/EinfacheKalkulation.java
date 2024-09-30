package org.example;
/*
  Schreibt eine Java-Methode, die zwei Zahlen als Parameter entgegennimmt und das Ergebnis ihrer Addition zurückgibt.

  Schritt 1: Schreibe eine Methode mit dem Namen 'add', die zwei int-Parameter entgegennimmt und die Summe der beiden Zahlen zurückgibt.
  Schritt 2: Rufe die Methode innerhalb deiner main() Methode auf und gib das Ergebnis auf der Konsole aus.
   */
public class EinfacheKalkulation {
    public static void main(String[] args){
        System.out.println(Add(6,8));

    }
    public static int Add ( int a , int b) {
      return a +b;

    }

}
