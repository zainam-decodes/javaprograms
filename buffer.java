class StringBuffExample{
           public static void main(String[] ar){
                    StringBuffer sb=new StringBuffer("Hello World");
                    sb.append("Example");
                    System.out.println("modified string is "+sb);
                    System.out.println("capacity of string is "+sb.capacity()); //default 16+11 size of string passed=27
                    System.out.println("reverse of string is "+sb.reverse());
                    System.out.println("replace "+sb.replace(2,5,"appy"));
                    System.out.println("insert "+sb.insert(6,"hi there"));

                      }
}

                          

                   