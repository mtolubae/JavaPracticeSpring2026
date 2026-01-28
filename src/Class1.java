public class Class1 {
    public static void main(String[] args){
        int a[];
        int b[] = new int[10];
        int c[] = {1,2,3,4,5};
        //System.out.println(a);
//        for (int i=0; i<c.length;i++)
//        {System.out.println(b[i]);
//        System.out.println(c[i]);}
//int arg=0;
        int x = args.length;
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i:arr){
            System.out.println(i);
        }


    }
}
