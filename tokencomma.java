import java.util.StringTokenizer;

class StringFirst {
    public static void main(String[] args) {
        // String with commas as delimiters
        String inputString = "This statement , is passed directly ,inside the class.";
        
        // Create a StringTokenizer with comma (,) as the delimiter
        StringTokenizer st = new StringTokenizer(inputString, ",");
        
        System.out.println("Tokens extracted from the string using StringTokenizer (separated by commas): ");
        
        // Loop through the tokens and print them
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken().trim()); // trim spaces if any
        }
    }
}
