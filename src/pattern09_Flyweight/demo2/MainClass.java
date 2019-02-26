package pattern09_Flyweight.demo2;

public class MainClass {
    public static void main(String[] args) {
        TeacherFactory teacherPool = new TeacherFactory();
        Teacher teacher1 = teacherPool.getTeacher("0012002");
        Teacher teacher2 = teacherPool.getTeacher("0012003");
        Teacher teacher3 = teacherPool.getTeacher("0012002");
        System.out.println((teacher1 == teacher2) + " " + (teacher1 == teacher3));
    }
}
