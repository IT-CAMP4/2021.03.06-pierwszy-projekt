public class Main5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        boolean logiczna = a == 0;

        if(logiczna) {
            if(b == 0 && a > 0 && a <= 5) {
                System.out.println("A i B wynoszą 0 !!");
            } else {
                System.out.println("Tylko A jest zerem !!");
            }
        } else if(a > -5) {
            System.out.println("A jest większe od 0 !!");
        } else if(a < -2) {
            System.out.println("A jest mniejsze od 0 !!");
        } else {
            System.out.println("Kij wie co to za liczba");
        }

        /*switch (a) {
            case 1:
                System.out.println("A wynosi 1 !!");
                break;
            case 2:
                System.out.println("A wynosi 2 !!");

            case 3:
                System.out.println("A wynosi 3 !!");
                break;
            default:
                System.out.println("Cieżko stwierdzić co to jest A !!");
                break;
        }*/

        System.out.println("Koniec programu !!");
    }
}
