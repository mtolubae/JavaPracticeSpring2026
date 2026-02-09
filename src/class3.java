import java.util.Scanner;

public class class3 {
    public static void main(String args[]){
        //3rd part - interact with user
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько студентов хочушь добавить? ");
        int n = scan.nextInt();scan.nextLine();
        StudentUtils su = new StudentUtils(n);

        for(int i=0;i<n;i++){
            System.out.println("Введи имя");
            String name = scan.nextLine();
            Student s = new Student(name);
            su.addStudent(s);
        }
        su.printStudents();
    }
}

class Student{
    //1st part
    private String name;
    private double gpa;

    public Student(){}
    public Student(String name){
        this.name = name;
        this.gpa = 0;
    }

    public void displayInfo() {
        System.out.println("Student: " + name);
    }
    public boolean isExcellent(){
        if(gpa >=3.5) return true;
        else return false;
    }

    public String getName(){return this.name;}

    public String toString(){
        displayInfo();
        return "";
    }
}
class StudentUtils{
    //2nd part
    Student[] list;
    int freeIndex=0;

    public StudentUtils(int n){
        list = new Student[n];
    }

    public void addStudent(Student s){
        if(s.getName() == null || s.getName() == ""){
            System.out.println("Имя пустое");
            return;
        }
        if(freeIndex == list.length){
            System.out.println("Мест нет");return;
        }
        list[freeIndex] = s;
        freeIndex++;
    }

    public void printStudents(){
        for (Student s:list){
            System.out.println(s);
        }
    }
}


