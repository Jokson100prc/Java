package person;

public class Person {

    String firstName;
    String lastName;
    int dayBirth;
    int monthBirth;
    int yearBirth;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person( String lastName, String firstName, int dayBirth, int monthBirth, int yearBirth){
        this(firstName, lastName);
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }

    public String toString(){

        String dstr = "" + dayBirth;
        String mstr = "" + monthBirth;

        if(dayBirth < 10){
            dstr = "0" + dayBirth;
        }
        if(monthBirth < 10){
            mstr = "0" + monthBirth;
        }
        return firstName + " " + lastName + ", " + dstr + "." + mstr + "." + yearBirth;
    }
}