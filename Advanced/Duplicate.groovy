class Duplicate {
    static void main(String[] args){
        int [] arr=[1,2,3,12,43,12,9,24,4,10,1,2,3]
        //int n=arr.size()
        int count=0
        for(int i=0;i<arr.size();i++){
            for (int j=i+1;j<arr.size();j++){
                if(arr[i]==arr[j]){            
                    arr[j]=0                
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr[i]!=0){
                print (arr[i] + " ")
            }
        }
   }
}