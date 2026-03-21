public class Humandemo {
    public static void main(String[] args) {
        Human studentData = new Student();
        Human teacherData = new Teacher();

        studentData.displayInfo();
        System.out.println();
        teacherData.displayInfo();
    }
}
