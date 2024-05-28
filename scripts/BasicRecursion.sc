def factorial(n: Int): BigInt = {
  if(n == 0 || n == 1) 1
  else n * factorial(n - 1)
}

println(factorial(100))
