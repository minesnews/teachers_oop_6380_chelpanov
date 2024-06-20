package Teacher_folder;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceGroup {
    List<Teacher> teachers = new ArrayList<Teacher>();

    public void addTeacher(int id, String name, String lastname) {
        TeacherService service = new TeacherService();
        Teacher teach = service.create(id, name, lastname);
        teachers.add(teach);
    }

    public void editTeacher(int id, String name, String lastname)
    {

        for (int i = 0; i < teachers.size(); i++){
            if(teachers.get(i).getId() == id){
                teachers.get(i).setName(name);
                teachers.get(i).setLastname(lastname);
            }
        }
        TeacherView view = new TeacherView();
            view.sendOnConsole(teachers);
    }

    public void viewTeachers(){
        TeacherView view = new TeacherView();
        view.sendOnConsole(teachers);
    }
}
