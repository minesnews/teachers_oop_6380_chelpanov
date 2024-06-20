package Teacher_folder;

import java.util.ArrayList;
import java.util.List;

/**
 * TeacherService
 */
public class TeacherService {

    public Teacher create(int id, String name, String lastname){
        Teacher teacher = new Teacher(id, name, lastname);
        TeacherView tw = new TeacherView();
        tw.viewData(teacher);
        return teacher;
    }
}