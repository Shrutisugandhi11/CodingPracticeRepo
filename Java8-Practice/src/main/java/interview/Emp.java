package interview;

public class Emp {
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Emp(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  this.email;
    }
}
