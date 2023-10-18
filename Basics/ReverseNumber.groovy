class ReverseNumber {
    // defining function
     static def Reverse() {
        int num=4567
    int rev=0
    while(num !=0){
        int digit=num %10;
        rev=rev *10 + digit
        num=num/10
    }
    print(rev)
     }
   static void main(String[] args) {
    //function call
    Reverse()
   } 
   
}