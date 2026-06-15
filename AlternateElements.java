public class AlternateElements {

    public static void getAlternates(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            if(i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args) {

        AlternateElements obj = new AlternateElements();

        int arr[] = {1, 2, 3, 4, 5, 6};

        obj.getAlternates(arr);

    }
}
