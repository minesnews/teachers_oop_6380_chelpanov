import Teacher_folder.Teacher;
import Teacher_folder.TeacherService;
import Teacher_folder.TeacherServiceGroup;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(5, "Ivanov", "Ivan");
        //System.out.println(teacher.getId());
        TeacherService service = new TeacherService();
        service.create(4, "Petrov", "Petr");
        TeacherServiceGroup group = new TeacherServiceGroup();
        group.addTeacher(1, "Test", "Testovich");
        group.addTeacher(2, "Test2", "Testovich2");
        teacher.getTeacherName();
        System.out.println("\n");
        group.editTeacher(1, "Tester", "Testovicher");
    }
}