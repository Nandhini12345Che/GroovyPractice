class Duplicate {
    static void main(String[] args){
        int [] arr=[1,2,3,12,0,43,12,9,24,4,10,2,3]
        //int n=arr.size()
        int count=0
        for(int i=0;i<arr.size();i++){
            for (int j=i+1;j<arr.size();j++){
                if(arr[i]==arr[j]){            
                    arr[j]=' '               
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr[i]!=' '){
                print (arr[i] + " ")
            }
        }
   }
}