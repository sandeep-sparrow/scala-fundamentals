val dpt = new Department("IT", 121)
val emp1 = new Employee("Mayur", "Patel", dpt)

println(emp1.firstName)
println(emp1.lastName)
println(emp1.department.name)
println(emp1.department.number)

val dpt1 = new Department("ITSM", 119)
emp1.department = dpt1

println(emp1.firstName)
println(emp1.lastName)
println(emp1.department.name)
println(emp1.department.number)
