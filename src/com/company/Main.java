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


        public static void  makeSpisokC ( spisokA,  spisokB ) {
            Iterator<String>itA = spisokA.listIterator();
            Iterator<String>itB = spisokB.listIterator();
            while (itA.hasNext()) {
                System.out.println(itA.next());
                while (itB.hasNext()) {
                    System.out.println(itB.next());


                }
            }


        }
    }
    public static void printList (ArrayList < String > list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
