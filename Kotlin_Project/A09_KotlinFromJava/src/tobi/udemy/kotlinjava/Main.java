package tobi.udemy.kotlinjava;

import tobi.udemy.kotlinclasses.Car;
import tobi.udemy.kotlinclasses.SingletonObj;
import tobi.udemy.kotlinclasses.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /**
         * Normal wird die automatisch generierte Classe von File.kt immer FileKt genannt.
         * Mit der Annotation @file können wir diesen Classennamen aber bewusst setzen
         */
        StaticCar.topLevel();

        String str = "Das ist das Haus vom Nicolaus";

        /**
         * Erweiterungsfunktionen werden wie normale Toplevel Funktionen aufgerufen
         */
        StaticCar.printK(str);

        Car car = new Car("gelb", "Trabant", 1989, true);
        car.setColor("lila");
        System.out.println(car);

        System.out.println(car.year);

        Car.carComp();
        System.out.println("CONSTANTE = " + Car.CONSTANTE);
        System.out.println("isAuto = " + Car.isAuto);

        car.printMe("bla");

        SingletonObj.doSomething();

        try{
            StaticCar.doIO();
        }catch (IOException e){
            System.out.println(e.toString());
        }

        StaticCar.defaultArgs("Die Zahl ist");
    }
}
