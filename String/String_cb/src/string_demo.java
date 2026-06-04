public class string_demo {
    public static void main(String[] args){
        String s1="Hello";// string pool or intern pool
        String s2="Hello"; // string pool or intern pool
        String s3=new String("Hello");// outside of string pool duplicate is allowed
        String s4=new String("Hello");//outside of string pool duplicate is allowed
        System.out.println(s1==s2);// true
        System.out.println(s1==s3);// false
        System.out.println(s3==s4);// false
    }
}
