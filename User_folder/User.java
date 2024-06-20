package User_folder;

public class User {
    private int id;
    private String username;
    private String lastname;

    public User(int id, String username, String lastname) {
        this.id = id;
        this.username = username;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String username) {
        this.username = username;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
