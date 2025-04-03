class Stringcomp{
          public static void main(String[] args){
               String s1="HELLQ";
               String s2="HELLO";
               String s3="HELLO";
               String s4="TONIGHT";
               System.out.println("length of s4 is "+s4.length());
               System.out.println(s4.equalsIgnoreCase("tonight"));
               System.out.println(s4.charAt(2));
               System.out.println(s1.equals(s2));
               System.out.println(s2.equals(s3));
               System.out.println(s2==s3);
System.out.println(s1.compareTo(s2));
      System.out.println(s1.compareTo(s3));
      System.out.println(s2.compareTo(s1));
              
                 }
}