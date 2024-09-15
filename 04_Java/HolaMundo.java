public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("hola Java");

        String myString = "esto es una cadena de texto";
        myString = "Aquí cambio el valor de la cadena de texto";
        System.out.println(myString);

        int myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt - 1); //imprime la resta no el valor actual 11

        Double myDouble = 7.5;
        System.out.println(myDouble);

        Float myFloat =  9.9f;
        System.out.println(myFloat);

        System.out.println(myDouble + myInt);
        //System.out.println();

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);


        /*  System.out.println(myFloat + 10); -> null pointer exception
        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10); 
            System.out.println("MyFloat es distinto de nulo");
            
        } else {
            System.out.println("MyFloat es nulo");
        } */
    }
}