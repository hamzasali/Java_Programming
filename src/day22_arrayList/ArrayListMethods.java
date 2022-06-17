package day22_arrayList;


import java.util.ArrayList;

import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //0
        list.add(10);//1
        list.add(20);//2
        list.add(30);//3

        //list.add(5.5);

        System.out.println(list);

        list.add(2, 19);

        System.out.println(list);

        System.out.println(list.get(3));


        System.out.println("---------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get(studentList.size() - 1);

        System.out.println("First Student: " + firstStudent);
        System.out.println("Last Student: " + lastStudent);


    }
}
