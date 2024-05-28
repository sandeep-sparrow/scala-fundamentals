try {
  val sandeep = new Employee("Sandeep", "Prajapati", "Manager");
  println(sandeep.firstName)
  println(sandeep.lastName)
  println(sandeep.title)
  println("Full Name: " + sandeep.fullName)
} catch {
  case iae: IllegalArgumentException => println(iae.getMessage)
  case ex: Exception => println(ex.getMessage)
} finally {
  println("Continuing our scala programming!")
}

val maths = new Department("Maths")
val alan = new Manager("Alan", "Turing", "Mathematician, Logician", maths)
println(alan.department.name)
