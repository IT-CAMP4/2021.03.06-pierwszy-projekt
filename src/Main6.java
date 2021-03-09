public class Main6 {
    public static void main(String[] args) {
        /*for(int i = 0; i < 1000; i++) {
            //System.out.println("Iteracja: " + i);
            if(i%2 == 0) {
                System.out.println("Coś");
            } else {
                System.out.println("cos innego !!");
            }
        }*/

        int[] tab = new int[20];

        for(int i = 0; i < 20; i++) {
            tab[i] = i + 1;
        }

        /*for(int element : tab) {
            element = 5;
        }*/

        for(int element : tab) {
            System.out.println(element);
        }

        boolean[][] booleans = new boolean[10][10];

        for(boolean[] elementWPostaciTablicy : booleans) {
            for (boolean element : elementWPostaciTablicy) {
                System.out.println(element);
            }
        }
    }
}
