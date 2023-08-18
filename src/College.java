import java.time.LocalDate;

public class College extends EducationCenter{

    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
