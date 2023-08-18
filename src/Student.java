import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private String surName;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;
    private int year;

    public Student(String name, String surName, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surName = surName;
        this.year = Period.between(dateOfStart,LocalDate.now()).getYears();
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", educationCenter=" + educationCenter +
                ", year=" + year +
                '}';
    }
}