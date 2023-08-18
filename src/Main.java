import javax.sound.sampled.FloatControl;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //1 EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
        //2 Абстракт класска School , University, College деген саб класстарды тузунуз.
        //3 Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()
        // деген 2 метод тузунуз.
        //3 Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент
        // кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
        //4 Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
        //5 Main класста 1 метод тузунуз.
        //1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты
        // жана окуганыны канча жыл болгону тууралу маа

        School school1 = new School("Aitiev","Aksy",LocalDate.of(1990,3,6));
        School school2 = new School("Bokonbaev","Kerben",LocalDate.of(2000,4,2));
        School school3 = new School("Sebat","Bishkek", LocalDate.of(1999,4,1));

        Universityi universityi1 = new Universityi("Manas","Bishkek",LocalDate.of(2005,6,7));
        Universityi universityi2 = new Universityi("AUSA","Bishkek",LocalDate.of(1998,6,4));
        Universityi universityi3 = new Universityi("KTMU","Bishkek",LocalDate.of(1998,11,25));

        Student student1 = new Student("Nurles","Subanbaev", LocalDate.of(2000,1,1),school1);
        Student student2 = new Student("Narmat","Kushnazarov",LocalDate.of(1999,11,1),universityi1);
        Student student3 = new Student("Adilet","Mamyrbekov",LocalDate.of(1889,12,7),universityi2);
        Student student4 = new Student("Myrza","Asanov",LocalDate.of(1999,2,6),universityi3);
        Student student5 = new Student("Mars","Ibraev",LocalDate.of(2000,3,7),school1);
        Student student6 = new Student("Erosh","kalbaev",LocalDate.of(1999,5,8),school2);
        Student student7 = new Student("Kana","Kadyrov",LocalDate.of(2004,2,6),school3);
        Student student8 = new Student("Shamy","kadyrbekov",LocalDate.of(2007,3,5),universityi1);
        Student student9 = new Student("Joke","Anarbaev",LocalDate.of(1778,3,8),universityi2);
        Student student10 = new Student("Jolaman","Almazbekov",LocalDate.of(1999,5,7),universityi3);
        Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        for (Student s:students) {
            System.out.println(s);
        }

    }
}