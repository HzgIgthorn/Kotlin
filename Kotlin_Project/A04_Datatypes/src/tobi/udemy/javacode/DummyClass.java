package tobi.udemy.javacode;

public class DummyClass {

    public String isVacationTime(boolean onVacation){
        return (onVacation)?"Im Urlaub":"Beim Arbeiten";
    }

    public void printLnInt(int[] array){
        System.out.println();
        boolean notFirst = true;
        for(int i = 0; i < array.length; i++){
            if(notFirst){
                System.out.print(array[i]);
                notFirst = false;
            }
            else
                System.out.print(", "+array[i]);
        }
    }


}
