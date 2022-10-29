package Class20MethodOverloading;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher mathteacher=new MathTeacher("Gulcan", 18, 16);
        mathteacher.teach();

        PianoTeacher pt=new PianoTeacher(
                "James", 25, 6, "Grand"
        );
        pt.teach();
    }
}
