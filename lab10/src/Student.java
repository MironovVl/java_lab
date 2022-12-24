public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private String group;
    private String specialty;

    public Student(String firstName, String lastName, String specialty, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
        this.specialty=specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}
