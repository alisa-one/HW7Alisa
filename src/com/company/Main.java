package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> spisokA = new ArrayList<>();
        while (spisokA.size() < 5) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку в список А: ");
            String stroka = in.nextLine();
            spisokA.add(stroka);

        }

        ArrayList<String> spisokB = new ArrayList<>();
        while (spisokB.size() < 5) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку в список В: ");
            String stroka = in.nextLine();
            spisokB.add(stroka);

        }
        System.out.println("------------------------------------");
        System.out.println("Список А : ");
        printListA(spisokA);
        System.out.println("-----------------------------------");
        System.out.println("Список Б : ");
        printListB(spisokB);
        System.out.println("-----------------------------------");
        System.out.println("Список Б revers : ");
        Collections.reverse(spisokB);
        printListB(spisokB);
        System.out.println("-----------------------------------");

        ArrayList<String> spisokC = new ArrayList<>();

        Comparator<String>comparator =(o1, o2) -> {
            Integer i1 =o1.length();
            Integer i2 =o2.length();
            return i1.compareTo(i2);

        };
      Iterator<String> iterA =spisokA.iterator();
      Iterator<String> iterB = spisokB.iterator();
      while (iterA.hasNext()&& iterB.hasNext()){
          spisokC.add(iterA.next());
          spisokC.add(iterB.next());
      }
      printListC(spisokC);




    }
    public static void printListA (ArrayList < String > list) {
        Iterator<String> itA = list.iterator();
        while (itA.hasNext()) {
            System.out.println(itA.next());
        }
    }
    public static void printListB (ArrayList < String > list) {
        Iterator<String> itB = list.iterator();
        while (itB.hasNext()) {
            System.out.println(itB.next());
        }
    }
    public static void printListC (ArrayList < String > list) {
        Iterator<String> itC = list.iterator();
        while (itC.hasNext()) {
            System.out.println(itC.next());
        }
    }



}
