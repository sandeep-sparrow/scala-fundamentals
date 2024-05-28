// methods
def add(x: Int, y: Int) = x + y // inferred return type...

println(add(6, 7))

def numberStatus(n: Int) = {
  if(n < 10) "Less than 10"
  else if (n > 10) "Greater than 10"
  else "It is 10!"
}

println(numberStatus(15))
