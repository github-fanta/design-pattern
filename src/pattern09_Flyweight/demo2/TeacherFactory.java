package pattern09_Flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
    private Map<String, Teacher> pool = new HashMap<>();
    public Teacher getTeacher(String number) {
        Teacher teacher = pool.get(number);
        if (teacher == null) {
            teacher = new Teacher();
            teacher.setNumber(number);

            pool.put(number, teacher);
        }
        return teacher;
    }
}
