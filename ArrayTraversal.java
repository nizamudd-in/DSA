public class ArrayTraversal {
    public static void arrayTraversal(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
     public static void main(String[] args){
        ArrayTraversal obj= new ArrayTraversal();
        int arr[]={1,3,45,6};
        obj.arrayTraversal(arr);
    }
}
