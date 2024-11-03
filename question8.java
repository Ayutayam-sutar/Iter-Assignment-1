public class question8 {
    
    public static void main(String[]args){
         int a=23;
         int b=32;
         System.out.println("before swapping "+a+","+b);
         b=a+b;
         a=b-a;
         b=b-a;
         System.out.println("After swapping "+a+","+b);

    }
}
