package chapter5;

class Student{
    int rollNo;
    String name;
}

public class M2_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 3119;
        s1.name = "Kaushal";

        System.out.println(s1.name);


        Student s2 = new Student();
        s2.rollNo= 3120;
        s2.name ="Drishti";

        System.out.println(s2.name);
    }
}
