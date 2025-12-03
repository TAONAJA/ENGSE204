public class EnrollmentSystem {
    private static class Course {
        private String courseId;
        private String courseName;
        public Course(String courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }
        public String getCourseInfo() {
            return "[" + courseId + "]: " + courseName;
        }
    }
    private static class Student {
        private String studentName;
        private Course enrolledCourse;
        public Student(String studentName, Course enrolledCourse) {
            this.studentName = studentName;
            this.enrolledCourse = enrolledCourse;
        }
        public void displayEnrollment() {
            System.out.println("Student: " + studentName);
            System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
        }
    }
    public static void main(String[] args) {
        Course course1 = new Course("ENGE174", "Object Oriented Programming");
        Student student1 = new Student("Somsak Jaidee", course1);
        student1.displayEnrollment();
        System.out.println("\n");
        Course course2 = new Course("GEN101", "Physical Education");
        Student student2 = new Student("Suda Makmee", course2);
        student2.displayEnrollment();
        System.out.println("\n");
        Course course3 = new Course("MATH101", "Calculus I");
        Student student3 = new Student("Piti Yindee", course3);
        student3.displayEnrollment();
    }
}