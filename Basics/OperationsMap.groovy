class OperationsMap{
    static Void main (String[] arg){
      def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"] 
      //creating map
      mp.put("TopicID","1")
     println(mp)  
      // inserting 
     println(mp.get("TopicName"))
     println(mp.get("Topic"))
      //values
     println(mp.values())
      //contain key
     println(mp.containsKey("TopicName"))
      //Minus function 
       def minusMap=mp.minus(["TopicName" : "Maps"])
      println(minusMap)
      //findall 
      // mp.findAll({it.value=="Map"}.key=="TopicName")
      // inserting dublicate value 
      mp.put("TopicID","1") 
    println(mp) 

      
    }
}
