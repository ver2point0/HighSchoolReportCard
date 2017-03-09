package com.ver2point0.android.highschoolreportcard;

public class ReportCard {

    private static final String SCHOOL_NAME = "Acme";
    private String studentFirstName;
    private String studentLastName;
    private int gradeLevel;
    private String[] courseNames;
    private int[] courseGrades;
    private String[] courseLetterGrades;

    // Default constructor
    public ReportCard() {
        studentFirstName = "Jane";
        studentLastName = "Doe";
        gradeLevel = 11;
        courseNames = new String[]{"Math", "Science", "History", "English",};
        courseGrades = new int[] {98, 88, 77, 50};
        courseLetterGrades = new String[] {getCourseLetterGrade(courseGrades[0]), getCourseLetterGrade(courseGrades[1]),
                getCourseLetterGrade(courseGrades[2]), getCourseLetterGrade(courseGrades[3])};
    }

    // Custom constructor
    public ReportCard(String first, String last, int level, String c1, String c2, String c3, String c4, int c1g, int c2g, int c3g, int c4g) {
        studentFirstName = first;
        studentLastName = last;
        gradeLevel = level;
        courseNames = new String[] {c1, c2, c3, c4};
        courseGrades = new int[] {c1g, c2g, c3g, c4g};
        courseLetterGrades = new String[] {getCourseLetterGrade(courseGrades[0]), getCourseLetterGrade(courseGrades[1]),
                getCourseLetterGrade(courseGrades[2]), getCourseLetterGrade(courseGrades[3]),};
    }

    @Override
    public String toString() {

        return "School Name: " + SCHOOL_NAME + "\n" +
                "Student Name: " + getStudentFirstName() + " " + getStudentLastName() + "\n" +
                "Grade Level: " + getGradeLevel() + "\n" +
                "Course One: " + courseNames[0] + " grade: " + courseGrades[0] + " letter grade: " + getCourseLetterGrade(courseGrades[0]) + "\n" +
                "Course One: " + courseNames[1] + " grade: " + courseGrades[1] + " letter grade: " + getCourseLetterGrade(courseGrades[1]) + "\n" +
                "Course One: " + courseNames[2] + " grade: " + courseGrades[2] + " letter grade: " + getCourseLetterGrade(courseGrades[2]) + "\n" +
                "Course One: " + courseNames[3] + " grade: " + courseGrades[3] + " letter grade: " + getCourseLetterGrade(courseGrades[3]);
    }

    public void setStudentFirstName(String first) {
        studentFirstName = first;
    }

    public void setStudentLastName(String last) {
        studentLastName = last;
    }

    public void setGradeLevel(int grade) {
        gradeLevel = grade;
    }

    private String getStudentFirstName() {
        return studentFirstName;
    }

    private String getStudentLastName() {
        return studentLastName;
    }

    private int getGradeLevel() {
        return gradeLevel;
    }

    private String getCourseLetterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
