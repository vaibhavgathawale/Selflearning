package NEW2024;

public class EachElementCountArrray {
    public static void main(String[] args) {


        int arr[] = {50, 40, 56, 5, 80, 65, 45, 10,10};

        int distinct = 0 ;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if(arr[i]==arr[j])
                {
                    distinct++;
                }
            }
            System.out.println(arr[i]+"--"+distinct);

            distinct = 0;

        }



    }
}
