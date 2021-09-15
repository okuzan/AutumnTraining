import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int age;

    public Student(String nameS, String groupS, int ageS) {
        name = nameS;
        ;
        group = groupS;
        age = ageS;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && name.equals(student.name) && Objects.equals(group, student.group);
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof Student) {
            Student s = (Student) o;
            return this.age == s.age && this.name.equals(s.name) && this.name.equals(s.name);
        } else return false;
    }

    @Override
    public int hashCode() {
        return (31 * age + ((name == null) ? 0 : name.hashCode())
                + ((name == null) ? 0 : name.hashCode())
                + ((group == null) ? 0 : group.hashCode())
        );
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }
}
