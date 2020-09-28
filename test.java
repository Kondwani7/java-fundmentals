//import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        System.out.println("Hello world"); 
        //Lines of code
        System.out.println("first line of code");  
        System.out.println("More lines of code");
        /* input data
        Scanner testVar = new Scanner(System.in);
        System.out.println(testVar.nextLine());
        */
        
        //data types
        int myAge = 10* 2;
        String myName = "Kondwani";
        double temp = 30.5;
        char group = 'z';
        System.out.println(myAge);
        System.out.println(myName);

        //prefix
        int x = 24;
        System.out.println(x);
        System.out.println(++x);

        //post fix

        int y = 17;
        System.out.println(y);
        System.out.println(y++);

        //compound statement
        double litersPerCup = 0.25;
        int cups = 5;
        int person =6;

        person *= litersPerCup * cups;
        int totalLitersConsumed = person;
        System.out.println(totalLitersConsumed);

        //conditionals
        int houseMates = 4;
        if(houseMates <3){
            System.out.println("Rent is too expensive");
        } else if(houseMates <5){
            System.out.println("Thats chilled");
        }else{
            System.out.println("Too many people");
        }

        // logical operators have And: &&, Or: ||, exclusive Or: ^; negation:!

        //Switch statement

        int favCourse = 4;

        switch(favCourse){
            case 1:
                System.out.println("Business Law");
                break;
            case 2:
                System.out.println("International Business A");
                break;
            case 3:
                System.out.println("Organisational Behaviour");
                break;
            case 4:
                System.out.println("New Venture Management");
        }

        //while loop

        int planets = 9;
        while (planets <=9){
            System.out.println(planets);
            planets++;
        }

        //do while loop

        int chargers = 2;
        do{
            System.out.println(chargers);
            System.out.println("times 2 =");
            chargers *= 2;
        }while (chargers<10);

        //for loop
        for (Double i = 1.5; i <=50.0; i*=2){
            System.out.println(i);
        }

        //Arrays
        Double[] sneakerPrices = new Double[4];
        sneakerPrices[0] = 350.0;
        sneakerPrices[1] = 500.0;
        sneakerPrices[2] = 750.0;
        sneakerPrices[3] = 1000.0;

        int totalSneakersCost = 0;

        for( int index=0; index < sneakerPrices.length; index++){
            totalSneakersCost += sneakerPrices[index];
        }
        System.out.println(totalSneakersCost);

        int [] cash = new int[4];
        cash[0] = 10;
        cash[1] = 15;
        cash[2] = 1300;
        cash[3] = 200;

        int totalCash = 0;

        for (int index =0; index < cash.length; index++){
            totalCash += cash[index];
        }System.out.println(totalCash);

        //methods
    }
}


