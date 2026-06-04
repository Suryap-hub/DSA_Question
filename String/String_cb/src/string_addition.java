public class string_addition {
    public static void main(String[] args){
        String s1="Hello";
        String s2="World";
        String s3=s1+s2;// concatenation outside the pool


        String s4=s1.concat(s2);// concatenation
        String s5="Name"+s1;// outside the pool
        String s6="Name"+"Age"; //inside the pool
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}
