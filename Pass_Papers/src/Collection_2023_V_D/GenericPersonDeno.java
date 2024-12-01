package Collection_2023_V_D;

import java.util.ArrayList;

public class GenericPersonDeno {
    public static void main(String[] args) {
        ArrayList<Student>  students  =  new ArrayList<>();
        students.add(new Student("STD1111", 6));
        students.add(new Student("STD2222", 7));
        students.add(new Student("STD3333", 12));
        students.add(new Student("STD44-44",11));
        students.add(new Student("STD5555", 10));

        ArrayList<Lecturer>  lecturers  =  new  ArrayList<>();
        lecturers.add(new  Lecturer("EHPOO00",   "IT"));
        lecturers.add(new  Lecturer("EHP1111",   "SE"));
        lecturers.add(new  Lecturer("EHP2222",   "CSN"));
        lecturers.add(new  Lecturer("EMP3333",   "EE"));
        lecturers.add(new  Lecturer("EMP4444",  "IS"));

       GenericPerson genericPerson = new GenericPerson();
       genericPerson.displayElements(students);
       genericPerson.displayElements(lecturers);
    }

}
