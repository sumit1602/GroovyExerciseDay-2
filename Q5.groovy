//Q5. Remove all records from a list whose index is odd
List li =[1,2,3,4,5,6,7]

//li.eachWithIndex{ value, index ->if(index%2!=0) println "$index: $value" }

li.eachWithIndex{ value, index ->if(index%2!=0) li.remove() }
//prints each index and number
