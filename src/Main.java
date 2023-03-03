import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String arrayNames[] = {"Marek", "Ola", "Tomek", "Wojtek"};
        String name = "";
        for (String s : arrayNames) {
            name = name + " " + s;
        }
        System.out.println(name);
        String s1 = "Hello";
        //String s3="Hello";
        String s2 = "He";
        String s3 = s2 + "llo";
        System.out.println("s3: " + s3);
        if (s1 == s3) {
            System.out.println("S1 taki sam jak S3");
        } else {
            System.out.println("S1 ronze do s3");
        }
        if (s1.equals(s3)) {
            System.out.println("Equals -> S1 taki sam jak S3");
        } else {
            System.out.println("Equals -> S1 ronze do s3");
        }
        System.out.println(s3.length());
        System.out.println(s3.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s3.toUpperCase());
        String s4 = "";
        System.out.println("Dlugosc s4 wynosi " + s4.length());
        String s5 = null;
//        System.out.println("Dlugosc s5 wynosi " + s5.length());
        String str = "   Hello Word    ";
        System.out.println("|" + str + "|");
        System.out.println("|" + str.trim() + "|");
        System.out.println("|" + str.stripLeading() + "|");
        System.out.println("|" + str.stripTrailing() + "|");
        String strKasia = "Raz dwa trzy cztery. Raz dwa.";
        int index = strKasia.lastIndexOf("Raz");
        System.out.println("Ostatnie wystapienie Raz: " + index);
        String strInfo = "Info";
        System.out.println(strInfo.repeat(5));
        System.out.println("Ola".concat(" ma kota.").length());
        String zmienna = "Ola ma kota".repeat(3);
        System.out.println(zmienna);
        String zmieniony1 = zmienna.replaceAll("Ola", "Kasia");
        String zmieniony2 = zmieniony1.replaceFirst("Kasia", "Monika");
        System.out.println(zmieniony1);
        System.out.println(zmieniony2);
        System.out.println(zmieniony2.indexOf("Kasia"));
        System.out.println(zmieniony2.lastIndexOf("Kasia"));
        System.out.println(zmieniony2.substring(zmieniony2.indexOf("Kasia"), zmieniony2.length()));
        System.out.println(zmieniony2.substring(zmieniony2.indexOf("Kasia")));
        char arr[] = zmienna.toCharArray();
        System.out.println("Liczba znaków: " + arr.length);
        String arrString[] = zmienna.split(" ");
        for (String s : arrString) {
            System.out.println(s);
        }
        String arrNames[]={"Maciek", "Robert", "Wiola", "Honorata", "Beata"};
        StringBuilder   stringBuilder = new StringBuilder();
        for (String s:arrNames) {
            stringBuilder.append(s).append(" ");
        }
        System.out.println(stringBuilder.toString());


    }
}
