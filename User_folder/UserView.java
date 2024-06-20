package User_folder;

import java.util.List;

public interface UserView<T extends User> {
    void viewData(T users);
    void sendOnConsole(List<T> users);
}
