package tobi.udemy.declarations;

public class EmployeeJava {

    protected String name;
    protected int id;

    public EmployeeJava(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeJava employee = (EmployeeJava) o;
        return id == employee.id &&
                name.equals(employee.name);
    }
}
