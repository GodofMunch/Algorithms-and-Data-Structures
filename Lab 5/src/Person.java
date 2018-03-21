import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {

    private String forename;
    private String surname;
    private Date dob;

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Person(String forename, String surname, Date dob) {
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
    }

    public Person() {
        setForename("");
        setSurname("");
        setDob(new Date());
    }
    public int compareTo(Person other) {
        /*if(surname.compareTo(other.surname)== 0)
            return forename.compareTo(other.forename);

        else if(surname.compareTo(other.surname)==0 &&
                forename.compareTo(other.forename)==0) {
            if(dob.compareTo(other.dob) > 0)
                return other.dob.compareTo(dob);
            else
                return dob.compareTo(other.dob);
        }
        else
            return surname.compareTo(other.surname);*/

        return forename.compareTo(other.forename);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return "\nName : " + forename + " " + surname + ", Date of Birth : " + sdf.format(dob);
    }
}
