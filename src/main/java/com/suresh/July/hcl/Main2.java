package com.suresh.July.hcl;

public class Main2 {
    public static void main(String[] args) {

        /*
        String s1 = "java";
        String s2 = new String("java");
        String s3 = s2.intern();
        System.out.println("s1 == s2:"+s1 == s2);
        //o/p:true
        System.out.println("s2 == s3:"+s2 == s3);
        //o/p: true
        System.out.println("s2.equals(s3)"+ s2.equals(s3));
        //true


         */
        String s1 = "java";
        System.out.println("s1:"+s1);
        String s2 = new String("java");
        System.out.println("s2:"+s2);
        System.out.println("s1== s2::::");
        System.out.println("s1== s2::::"+ s1 == s2);
        String s3 = s2.intern();
        System.out.println("s2== s3::::");
        System.out.println(s2==s3);
        System.out.println("s1== s3::::");
        System.out.println(s1==s3);

    }
}
