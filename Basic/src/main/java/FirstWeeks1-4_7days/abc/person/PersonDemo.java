package person;

public class PersonDemo {
    public static void main(String[] args) {
//        Person member = new Person();

//        member.firstName = "Smith";
//       System.out.println(member.firstName);

        Person member = new Person("John", "Smith", 5, 7,1945);
        System.out.println(member.firstName);
        System.out.println(member.lastName);

//        member.dayBirth = 13;
        System.out.println(member.dayBirth);
        Person wife = new Person("Smith","Megi",19,02,1985);
        System.out.print(wife.firstName + " ");
        System.out.println(wife.lastName);
        System.out.print(wife.dayBirth + ":");
        System.out.print(wife.monthBirth + ":");
        System.out.println(wife.yearBirth);


        System.out.println(member);

    }
}
