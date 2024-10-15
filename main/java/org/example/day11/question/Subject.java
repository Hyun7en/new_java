package org.example.day11.question;

public class Subject {
    private String subjectName; //과목명
    private int subjectScore; // 만점

    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectScore=" + subjectScore +
                '}';
    }
}
