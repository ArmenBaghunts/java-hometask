import javax.xml.namespace.QName;

class Human {
 String name;
    int age;

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Student extends Human {
    int grade=90;
    Student(){
        name="Gevorg";
        age=19;
    }
    @Override
    void displayInfo(){
        System.out.println("Student's Data");
       super.displayInfo();
        System.out.println("Grade: "+grade);
    }
}

class Teacher extends Human {
    String subject="English";
    Teacher() {
        name="Mrs. Naira";
        age=48;
    }
    void displayInfo(){
        System.out.println("Teacher's Data");
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}