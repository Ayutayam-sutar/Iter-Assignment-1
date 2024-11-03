public class question15without {
    public static void main(String[] args) {
        int w=2;
        int g=3;
        int k=1;
        int a=9;
        System.out.println("Before swapping"+" w="+w+","+"g="+g+","+"k="+k+","+"a="+a);
w=w+g+k+a;
a=w-(a+g+k);
k=w-(a+g+k);
g=w-(k+a+g);
w=w-(a+g+k);
System.out.println("After swapping"+" w="+w+","+"g="+g+","+"k="+k+","+"a="+a);
    }
}
