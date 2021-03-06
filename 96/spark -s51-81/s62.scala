Problem Scenario 62 : You have been given below code snippet. 
val a = sc.parallelize(List("dog", "tiger", "lion", "cat", "panther", "eagle"), 2) 
val b = a.map(x => (x.length, x)) 

operationl 

Write a correct code snippet for operation1 which will produce desired output, shown below. 

Array[(Int,String)] = Array((3,xdogx), (5,xtigerx), (4,xlionx), (3,xcatx), (7,xpantherx), (5,xeaglex)) 

================================================================================

Solution : 

scala> b.collect
res2: Array[(Int, String)] = Array((3,dog), (5,tiger), (4,lion), (3,cat), (7,panther), (5,eagle))

b.mapValues("x" + _ + “X”).collect
res1: Array[(Int, String)] = Array((3,xdogX), (5,xtigerX), (4,xlionX), (3,xcatX), (7,xpantherX), (5,xeagleX))

mapValues [Pair] : Takes the values of a RDD that consists of two-component tuples, and applies the provided function to transform each value. Then,it forms new two-component
tuples using the key and the transformed value and stores them in a new RDD. 
