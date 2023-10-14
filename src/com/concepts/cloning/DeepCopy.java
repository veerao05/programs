package com.concepts.cloning;

class Course1 implements Cloneable
{
    String subject1;

    String subject2;

    String subject3;

    public Course1(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;

        this.subject2 = sub2;

        this.subject3 = sub3;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Student1 implements Cloneable
{
    int id;

    String name;

    Course1 course;

    public Student1(int id, String name, Course1 course)
    {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.

    protected Object clone() throws CloneNotSupportedException
    {
        Student1 student = (Student1) super.clone();

        student.course = (Course1) course.clone();

        return student;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Course science = new Course("Physics", "Chemistry", "Biology");

        Student student1 = new Student(111, "John", science);

        Student student2 = null;

        try {
            //Creating a clone of student1 and assigning it to student2

            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Printing the subject3 of 'student1'

        System.out.println(student1.course.subject3);         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";

        //This change will not be reflected in original student 'student1'

        System.out.println(student1.course.subject3);       //Output : Biology
    }
}