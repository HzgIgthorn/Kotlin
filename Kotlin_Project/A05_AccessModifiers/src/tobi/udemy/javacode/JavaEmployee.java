package tobi.udemy.javacode;

public class JavaEmployee {

    private String firstname;
    private boolean fullTime;

    public JavaEmployee(String firstname) {
        this.firstname = firstname;
        this.fullTime = true;
    }

    public JavaEmployee(String firstname, boolean fullTime) {
        this.firstname = firstname;
        this.fullTime = fullTime;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
