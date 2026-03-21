public class Employee {
  String name;
  int salary;

  void work() {

  }
}

class Developer extends Employee {
   String programmingLanguage;
   Developer(){
       name="Ishkhan";
       salary=400000;
       programmingLanguage="Java";
   }
   @Override
    void work() {
       System.out.println("Developer's datas");
       System.out.println("Name: "+name);
       System.out.println("Salary: "+salary);
       System.out.println("Language of programming: " + programmingLanguage);
   }
}

class Manager extends Employee {
    int teamSize;
    Manager() {
        name="Gegham";
        salary=600000;
        teamSize=7;
    }

    @Override
    void work() {
        System.out.println("Manager's datas");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Quantity of team members: " + teamSize);
    }
}
