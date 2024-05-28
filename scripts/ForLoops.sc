var result = ""

for ( a <- 1 to 20){
  result = result + a
  if(a < 20) result = result + ","
}

println(result)

val xs = List(1, 2, 3, 4)
var result = List[Int]()

for ( a <- xs){
  result = result :+ (a + 1)
}

println(result)

val result = for( a <- xs) yield (a + 5)
println(result)
