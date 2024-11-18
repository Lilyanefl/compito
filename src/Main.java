import java.util.Scanner;

public class Main {
//        public static  int moltiplica(int x, int y){
//            return x * y;
//        }
//        public static  String concatena(String x, int y ){
//            return x + y;
//        }
//        public static String[] inserisciInArray(String[] x, String y){
//            String[] nuovoArray = new String[6];
//            nuovoArray[0] = x[0];
//            nuovoArray[1] = x[1];
//            nuovoArray[2] = y;
//            nuovoArray[3] = x[2];
//            nuovoArray[4] = x[3];
//            nuovoArray[5] = x[4];
//            return nuovoArray;
//
//        }
        public static double perimetroRettangolo(double lato1, double lato2) {
            return 2 * (lato1 + lato2);
        }
        public static int pariDispari(int x){
            if(x % 2 == 0){
                return 0;
            }
            return 1;
        }
    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        if (lato1 + lato2 > lato3 && lato1 + lato3 > lato2 && lato2 + lato3 > lato1) {
            double semiPerimetro = (lato1 + lato2 + lato3) / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
        } else {
            System.out.println("I lati forniti non formano un triangolo valido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del primo lato:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato:");
        double lato2 = scanner.nextDouble();
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        System.out.println("Inserisci numero");
        int numero = scanner.nextInt();
        System.out.println(pariDispari(numero));
        System.out.println("Inserisci la lunghezza del primo lato:");
        double latot1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato:");
        double latot2 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato:");
        double lato3 = scanner.nextDouble();
        double area = areaTriangolo(latot1, latot2, lato3);
        System.out.printf("L'area del triangolo è: %.2f\n", area);
//        System.out.println("Inserisci tre frasi");
//        String x = scanner.nextLine();
//        String y = scanner.nextLine();
//        String z = scanner.nextLine();
//        System.out.println(x + y + z);
//        System.out.println(z + y + x);
//        int z = scanner.nextInt();
//        int x = scanner.nextInt();
//        System.out.println(moltiplica(z, x));
//        String stringa = scanner.next();
//        int num = scanner.nextInt();
//        System.out.println(concatena(stringa, num));
//        String[] arrayStringhe = new String[]{"1", "2", "3", "4", "5"};
//        String y = scanner.next();
//        String[] nuovoArray = new String[6];
//        nuovoArray = inserisciInArray(arrayStringhe, y);
//        System.out.println(nuovoArray[2]);
        }
    }
