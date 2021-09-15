import java.util.Date;

public class ImmutablePack {
    private final Date date;
    private final Student student;


    public ImmutablePack(Date date, Student student) {
        this.date = new Date(date.getTime());
        this.student = new Student(student.getName(), student.getGroup(), student.getAge());
    }

    public final Date getDate() {
        return new Date(date.getTime());
    }

    public final Student getStudent() {
        return new Student(student.getName(), student.getGroup(), student.getAge());
    }
}
