package Exercise05;

public class Student {
    public String name;
    public String lastName;
    public double grade;

    public Student(String name, String lastName, double grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String result = String.format("%s %s: %.2f",this.name, this.lastName, this.grade);
        return result;
    }
}
