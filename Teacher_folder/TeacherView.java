package Teacher_folder;

import java.util.List;
import User_folder.UserView;

public class TeacherView implements UserView<Teacher> {
    public void viewData(Teacher teacher) {
        System.out.println("Id " + teacher.getId() + ": " + teacher.getUsername() + " " + teacher.getLastname());
    }
    public void sendOnConsole(List<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Id: " + teachers.get(i).getId() + ": " + teachers.get(i).getUsername() + " " + teachers.get(i).getLastname()  );
        }
    }
}
