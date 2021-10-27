package Week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable{
    private int id;
    private String name;
    private double gpa;
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if(gpa == s.gpa){
            if(name.equals(s.name)){
                return id-s.id;
            }else{
                return name.compareTo(s.name);
            }
        }else{
            if(s.gpa > gpa)
                return 1;
            else
                return -1;
        }
    }
}

public class JavaSort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);
        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}
