package User_folder;

public interface UserController<T extends User> {
    public T create(int id, String name, String lastname);
}
