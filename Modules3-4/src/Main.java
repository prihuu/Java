
import java.io.*;

public class Main {

    public static void main(String[] args) {

        //create a student
        Student student = new Student(1, "Daniel", 22);

        //create a course
        Course course = new Course(
                "ICT101",
                "Java Programming",
                "John Smith"
        );

        //create an enrollment
        Enrollment enrollment = new Enrollment(
                student,
                course,
                "10.11.2026"
        );

        //serialize the enrollment
        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("enrollments.ser")
            );

            output.writeObject(enrollment);
            output.close();

            System.out.println("Enrollment saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving enrollment: " + e.getMessage());
        }

        //deserialize the enrollment
        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("enrollments.ser")
            );

            Enrollment loadedEnrollment =
                    (Enrollment) input.readObject();

            input.close();

            //print the deserialized information
            System.out.println("\n- Enrollment Information -");

            System.out.println("Student ID: "
                    + loadedEnrollment.getStudent().getId());

            System.out.println("Student Name: "
                    + loadedEnrollment.getStudent().getName());

            System.out.println("Student Age: "
                    + loadedEnrollment.getStudent().getAge());

            System.out.println("Course Code: "
                    + loadedEnrollment.getCourse().getCourseCode());

            System.out.println("Course Name: "
                    + loadedEnrollment.getCourse().getCourseName());

            System.out.println("Instructor: "
                    + loadedEnrollment.getCourse().getInstructor());

            System.out.println("Enrollment Date: "
                    + loadedEnrollment.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading enrollment: " + e.getMessage());
        }
    }
}
