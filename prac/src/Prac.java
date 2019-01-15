public class Prac {
    private static final String INVALID_VALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println("hello");
        //  printMegaBytesAndKiloBytes(-1);
        //   boolean dog = bark(true,-1);
        //  System.out.println(dog);
       // areEqualByThreeDecimalPlaces(3.12523,3123.21212);
        //boolean equal = hasEqualSum(1,-1,0);
       // boolean teen = hasTeen(22,23,34);
      //  String opt = getDurationString(65,5);
       // System.out.println(opt);
       // System.out.println(getDurationString(3945));

      //  System.out.println(area(-1.0,4.0));
      //  pprintYearsAndDays(1051200);
      //  IntEqualityPrinter(1,2,3);
        isCatPlaying(false,10);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
        }
    }
    public static boolean bark (boolean barking,int hourOfDay) {
        if (hourOfDay <0 ){
            return false ;
        }else if (barking && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        }else if (barking &&((hourOfDay < 0) || (hourOfDay > 23))){
            return  false;
        }            else {
            return false;
        }

    }

    public static boolean areEqualByThreeDecimalPlaces (double one,double two) {
        int a = (int)(one*1000);
        int b = (int)(two*1000);

        if (a==b){
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum (int one,int two, int three){
        if ((one + two)==three ){
            return true;
        }
        return false;
    }

    public static boolean hasTeen (int one,int two, int three) {
        if ((one <13) || (one > 19)) {
            if ((two < 13) ||(two > 19)) {
                if ((three < 13) ||(three > 19)) {
                    return false;
                }
            }
        }
            return true;
        }

        public static String getDurationString(int minutes,int seconds){
        if ((minutes <0) ||(seconds <00) ||(seconds>59)){
                return INVALID_VALID_MESSAGE;
            }

            int hours=minutes/60;
            int remaningMunutes = minutes%60;

            String hrString = hours + "h";
            if (hours < 10) {
                hrString = "0" + hrString;
            }

            String minString = remaningMunutes + "m";
            if (remaningMunutes < 10) {
                minString = "0" + minString;
            }

            String secString = seconds + "s";
            if (seconds < 10) {
                secString = "0" + secString;
            }
            return hrString +  " " + minString + " " + secString;

        }

        public static String getDurationString(int seconds){
        if (seconds <0){
            return INVALID_VALID_MESSAGE;
        }
            int minutes = seconds/60;
        int remseconds = seconds%60;

        return getDurationString(minutes,remseconds);
        }

        ///calculating area
    public static double area (double radius) {
        if (radius < 0 ) {
            return -1;
        }
       // double pi = 3.14159;
        return (radius*radius*3.14159);
    }

    public static double area (double x,double y) {
        if ((x <0) || (y <0 )) {
            return -1;
        }
        return (x*y);
    }

    ///minutes to year and days calculator

    public static void pprintYearsAndDays (long minutes) {
        if ( minutes < 0 ) {
            System.out.println("Invalid Values");
        }else {
            long years = minutes/525600;
            long days = (((minutes%525600)/60/24));
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void IntEqualityPrinter (int a,int b,int c ){
        if ((a < 0)|| (b < 0) ||(c < 0)) {
            System.out.println("Invalid Values");
        } else if ((a==b) && (a==c) && (b==c)) {
            System.out.println("All numbers are equal");
        } else if ((a!=b) && (a!=c) && (b!=c)) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer ,int temperature ) {


        if (summer == true){
            if ((temperature >=25) && (temperature <=45)) {
                return true;
            }else {
               return false;
            }
        }else   {
            if ((temperature >= 25) && (temperature <=35)) {
                return true;
            }else {
                return false;
            }
        }

    }
}

