public class Main9 {
    public static void main(String[] args) {
        int[] tab = {1, 3, 5, 7, 9};

        for(int element : tab) {
            if(element == 5) {
                continue;
            }
            System.out.println(element);
        }


    }
}
