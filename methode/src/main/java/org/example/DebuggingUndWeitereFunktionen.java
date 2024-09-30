package org.example;
/*
    Prüfe und verstehe Dein Programm. Dann erweitere es.

    Schritt 1: Debugge Dein Programm: gehe jede Zeile Deines Programms Schritt für Schritt durch.
    Schritt 2: Erweitere die 'add'-Methode, um auch Gleitkommazahlen (double) zu unterstützen. (Recherchiere dazu, wie eine Java-Methode verschiedene Parameter-/Rückgabetypen unterstützen kann)
    Schritt 3: Schreibe eine weitere Methode namens 'subtract', die zwei int-Parameter entgegennimmt und die Differenz der beiden Zahlen zurückgibt.
    Schritt 4: Schreibe eine weitere Methode namens 'makePositive', die positive Zahlen einfach zurückgibt und negative Zahlen zu positiven Zahlen umwandelt. (bei Argument '5' wird '5' zurückgegeben, aber bei Argument '-28' wird '28' zurückgegeben)
     */
public class DebuggingUndWeitereFunktionen {
    public static void main(String[] args){
        System.out.println(Add1(0.5,0.6));
        System.out.println(Add(6,8));
        System.out.println(sub(10,8));
        System.out.println(sub1(0.10,0.4));
        System.out.println(makePositive(9));
}
public static int Add ( int a , int b) {
    return a +b;

}

public static double Add1(double a , double b){
        return a+b;
}

public static int sub(int a,int b){
        return a-b;
}
public static double sub1(double a,double b){
        return a-b;
    }

public static int makePositive(int a){
        if (a<0){
            return -a;
        }
            else
                return a;

}
}
