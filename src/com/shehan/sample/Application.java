package com.shehan.sample;

import sun.management.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args){
        List<String> students=new ArrayList<>();

        students.add("saman");
        students.add("nimal");
        students.add("kamal");
        students.add("bhakthi");
        students.add("layan");
        students.add("kamala");
        System.out.println(students);

        List<String> filtereddata=students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);


        List<Sensor> sensors= new ArrayList<>();

        Sensor sensor1= new Sensor( name )
        {
        }


    }

}
