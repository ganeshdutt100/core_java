public class code6 {
    public static void main(String[] args) {
        int a = 12;
//    dataType[]refname  = {}
//    dataType refname[]  = {}
        int sum = 0;
        int arr[] = {12,34,23,78,90,56,34};
//        System.out.println(arr[0] + " , " + arr[1]);
        for(int i =0;  i < arr.length; i++){
//            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);



//        for(int i = 0; i<arr.length; i++){
////             sum += arr[i];
//        }
//        System.out.println(sum);
    }
}
