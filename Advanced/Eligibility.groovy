class Eligibility {
    static void main(String[] args){
        // defining Age
        int age;  
        //importing values from user 
        Scanner input = new Scanner(System.in);                      

        System.out.print("Please enter your age: ");
        age = input.nextInt();                      
        if(age>=18){
            println("You are eligible.");
        }
        else{

            println("You are   not eligible");
        }
    }
}