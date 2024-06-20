package Teacher_folder;

import User_folder.UserController;

public class TeacherController implements UserController<Teacher> {
    private TeacherService ts = new TeacherService();
    private TeacherServiceGroup tsg = new TeacherServiceGroup();
    public Teacher create(int id, String name, String lastname)
    {
        return ts.create(id, name, lastname);
    }
    public void editTeacher(int id, String name, String lastname){
        tsg.editTeacher(id, name, lastname);
    }

    public void viewTeachers(){
        tsg.viewTeachers();
    }
}
