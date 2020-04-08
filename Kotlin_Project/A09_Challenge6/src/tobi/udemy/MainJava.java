package tobi.udemy;

public class MainJava {

    public static void main(String[] args) {
        KotlinCodeKt.sayHelloToJava("bla");

        Employer employer = new Employer("Dagobert", "Duck", 1910);
        employer = new Employer(employer.getFirstName(),employer.getLastName(),1911);

        Challenge.INSTANCE.doMath(5,4);

        employer.takesDefault("arg1");

        employer.takesDefault(null);
    }
}

//public class MainJava {
//
//    public static void main(String[] args) {
//        KotlinStuff.sayHelloToJava("bla");
//
//        Employer employer = new Employer("Dagobert", "Duck", 1910);
//        employer.startYear = 1911;
//
//        Challenge.doMath(5,4);
//
//        employer.takesDefault("arg1");
//    }
//}
