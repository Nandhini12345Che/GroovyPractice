class SetMap2{
    static void main(String[] args){
 //defining set    
Set CarSet = ["BMW", "I10", "INNOVA"]
//defining map
def CarMap = [
    "a" : "BMW",

    "b" : "I10",

    "c" : "INNOVA"
]
println("Original Set: $CarSet")

println("Original Map: $CarMap")

 

// fetching elements in a Set

def foundInSet = CarSet.contains("apple")

println("Is 'BMW' in the Set? $foundInSet")

 

// fetching elements in a Map

def foundInMap = CarMap["a"]
println("Value for key 'a' in Map: $foundInMap")

// Adding elements to a Set

CarSet << "date"
println("Set after adding 'date': $CarSet")

// Adding elements to a Map
CarMap["d"] = "date"
println("Map after adding 'date': $CarMap")
// Removing elements from a Set
CarSet.remove("banana")
println("Set after removing 'banana': $CarSet")

// Removing elements from a Map

CarMap.remove("b")
println("Map after removing key 'b': $CarMap")
    }

}
