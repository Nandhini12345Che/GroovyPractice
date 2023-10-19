class Palindrome {
   static void main(String[] args) {
        //Intialization
        String Str = "MALAYALAM";
        String rev = "";
        int length = Str.size();
        for(int i = length - 1; i >= 0; i --) {
                rev= rev + Str.charAt(i);
        }
        // Case in-sensitive

        //to check the condition

        if (Str.equalsIgnoreCase(rev)) {
            //Print the statement
            println(" The Given String is Palindrome..");
        } else {
            //Print the statement
            println(" The Given string is NOT a Palindrome..");
             }
                 }

 

}

