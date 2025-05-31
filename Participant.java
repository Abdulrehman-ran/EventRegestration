public class Participant {
    private int id;
    private String name;
    private String email;
    private String phone;

    public Participant(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters...
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone;}
}
