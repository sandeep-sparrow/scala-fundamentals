try {
  val sandeep = new Employee("Sandeep", "Prajapati", "Manager");
} catch {
  case iae: IllegalArgumentException => println(iae.getMessage)
  case ex: Exception => println(ex.getMessage)
} finally {
  println("Continuing our scala programming!")
}

val maths = new Department("Maths")
val alan: Manager = new Manager("Alan", "Turing", "Mathematician, Logician", maths)
println(alan.department.name)

val alanEmployee: Employee = alan

def extractFirstName(e: Employee) = e.firstName

println(extractFirstName(alanEmployee))
println(alan.fullName)
println(alanEmployee.fullName)

val alanNewJob = alan.copy(title="Supreme Encryption Specialist")
println(alanNewJob.department.name)

// EQUALS, TOSTRING, HASHCODE
val ada = new Employee("Ada", "Lovelace")
println(ada.firstName)

val newAda = ada.copy(lastName = "Byron, Countess of Lovelace")
println(newAda.lastName)

val anotherAda = new Employee("Ada", "Byron, Countess of Lovelace")
println(newAda.equals(anotherAda))
println(newAda == anotherAda) //true
println(newAda != anotherAda) //false

// check for references
println(newAda eq anotherAda) //false
val evenAnotherAda = anotherAda
println(anotherAda eq evenAnotherAda) //true

println(newAda.hashCode == anotherAda.hashCode) // true
println(ada.hashCode != anotherAda.hashCode) // true

println(ada.toString)
println(newAda.toString)
println(anotherAda.toString)

val departmentToy1 = Department("Toys");
val departmentToy2 = Department("Toys");
println(departmentToy1.toString)
println(departmentToy2.toString)
println(departmentToy1 == departmentToy2)
println(departmentToy1 eq departmentToy2)
println(departmentToy1.hashCode == departmentToy2.hashCode)

// Pattern Matching
val name = departmentToy1 match {
  case Department(n) => n
  case _ => "unknown"
}

println(name)
