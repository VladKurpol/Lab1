package Lab1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Faculty.list.add("KGKL");
        Faculty.list.add("RDAG");
        Faculty.list.add("SDAM");
        Faculty.list.add("LGD");

        Subjects.subject.add("Literature");
        Subjects.subject.add("Аstronomy");
        Subjects.subject.add("Physic");
        Subjects.subject.add("Math");
        Subjects.subject.add("English");

        Teachers.teacher.add("Warren  Foster");
        Teachers.teacher.add("Russell Griffith");
        Teachers.teacher.add("David  Banks");
        Teachers.teacher.add("Berenice  Osborne");
        Teachers.teacher.add("Merry  Foster");


        ArrayList<Students> Student = new ArrayList<>();
        //Students Student = new Students();

//        session.add(new Session(5,2,4));
//        session.add(new Session(2,1,2));
//        session.add(new Session(5,1,1));
//        session.add(new Session(4,4,0));
//        session.add(new Session(5,3,3));
//
//        Student.add(new Students("Alex Rotar",1,2,1,session));
//        Student.add(new Students("Mark Kendi",4,3,4,session));

        Student.add(new Students());
        Student.get(0).Input();

        System.out.println(Student);
    }

}
