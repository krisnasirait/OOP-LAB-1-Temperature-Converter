import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);//input scanner
        boolean menuLoop = true;

        System.out.println("" +
                ",--------.                                                       ,--.                            \n" +
                "'--.  .--'  ,---.  ,--,--,--.  ,---.   ,---.  ,--.--.  ,--,--. ,-'  '-. ,--.,--. ,--.--.  ,---.  \n" +
                "   |  |    | .-. : |        | | .-. | | .-. : |  .--' ' ,-.  | '-.  .-' |  ||  | |  .--' | .-. : \n" +
                "   |  |    \\   --.|  |  |  | | '-' ' \\   --.|  |    \\ '-' |   |  |   '  ''  ' |  |    \\   --. \n" +
                "   `--'     `----' `--`--`--' |  |-'   `----' `--'     `--`--'   `--'    `----'  `--'     `----' \n" +
                "                              `--'                ");

        System.out.println("-----------------");
        System.out.println("Input Data");
        System.out.println("-----------------");


        System.out.print("Suhu Dalam Celcius : ");
        double celcius = input.nextDouble();//input celcius
        DegreeProcessing degreeProcessing = new DegreeProcessing(celcius);

       while(true){
           System.out.println("\nOpsi");
           System.out.println("---");
           System.out.println("1. Lihat data konversi");
           System.out.println("2. Edit data konversi");
           System.out.println("3. Exit");
           System.out.print("Pilih : ");
           int choice = input.nextInt();//option input

           switch (choice){
               case 1:
                   System.out.println("Suhu Dalam Celcius \t: " + degreeProcessing.celcius + " \u2103");
                   System.out.println("Dalam Fahrenheit \t: " + degreeProcessing.fahrenheit + " \u2109");
                   System.out.println("Dalam Reamur \t\t: " + degreeProcessing.reamur + " \u00B0R");
                   System.out.println("Dalam Kelvin \t\t: " + degreeProcessing.kelvin + " \u212A");

                   break;

               case 2:
                   System.out.println("\nInput Data");
                   System.out.println("-----------------");


                   System.out.print("Suhu Dalam Celcius : ");
                   double edtCelcius = input.nextDouble();

                   DegreeProcessing edtDegree = new DegreeProcessing(edtCelcius);

                   System.out.println("Suhu Dalam Celcius \t: " + edtDegree.celcius + " \u2103");
                   System.out.println("Dalam Fahrenheit \t: " + edtDegree.fahrenheit + " \u2109");
                   System.out.println("Dalam Reamur \t\t: " + edtDegree.reamur + " \u00B0R");
                   System.out.println("Dalam Kelvin \t\t: " + edtDegree.kelvin + " \u212A");
                   break;

               case 3:
                   System.exit(0);

           }
           if(choice > 3){
               System.out.println("Opsi tidak ada. Mohon masukkan opsi yang tersedia");
           }
       }
    }


}
