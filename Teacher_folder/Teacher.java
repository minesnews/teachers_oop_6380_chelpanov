package Teacher_folder;

import User_folder.*;

public class Teacher extends User {
    public Teacher(int id, String name, String lastname){
        super(id, name, lastname);
    }

    public void getTeacherName() {
        System.out.println(getUsername() + " " + getLastname());
    }
}
