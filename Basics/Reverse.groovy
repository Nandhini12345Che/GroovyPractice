class Reverse{
    static void main(String[] args){       
    //defining array  
    def n='Groovy Program'
    def res=''
    // reversing code
    for(int i=n.size()-1;i>=0;i--){
        res=res+n.charAt(i)
    }
    print('Reverse of string :' +res)
    }
}