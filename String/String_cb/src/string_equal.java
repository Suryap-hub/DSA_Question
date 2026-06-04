public class string_equal {

    public static void main(String[] args){
        String s1="Hello";

        String s3=new String("Hello");
        System.out.println(s1.equals(s3));// true
        System.out.println(s1==s3);
        System.out.println(s1.charAt(0));
    }
}
