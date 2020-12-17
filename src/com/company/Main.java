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
        printList(spisokA);
        System.out.println("-----------------------------------");
        System.out.println("Список Б : ");
        printList(spisokB);
        System.out.println("-----------------------------------");
        System.out.println("Список Б revers : ");
        Collections.reverse(spisokB);
        printList(spisokB);
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
      printList(spisokC);




    }
    public static void printList (ArrayList < String > list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }




}
