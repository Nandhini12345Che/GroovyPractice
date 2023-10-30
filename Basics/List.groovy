class List{
static void main(String[] args){
 //defining the original lis 
def inputList = [7,4,9,10,17]
//Creating empty list for storage
def outputList = []
// Iterating the list to individual list using closure
inputList.each { item ->
    outputList << [item]
}
// printing statemnet 
println "Input List: $inputList"
println "Output List: $outputList"
}}