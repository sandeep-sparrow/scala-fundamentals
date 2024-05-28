import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName: String,
               @BeanProperty val lastName: String,
               @BeanProperty val title: String){

    require(firstName.nonEmpty, "First Name Cannot be Empty")
    require(lastName.nonEmpty, "Last Name Cannot be Empty")
    require(title.nonEmpty, "Title Cannot be Empty")

    if(title.contains("Manager") || title.contains("Associate"))
        throw new IllegalArgumentException("Title cannot be Manager or Associate")

    def this(firstName: String, lastName: String){
        this(firstName, lastName, "Programmer")
    }

    def fullName() = {
        s"$firstName $lastName"
    }

    def changeTitle(newTitle: String)
        = new Employee(firstName, lastName, newTitle)

    // to avoid immutablity and flexibility
    def copy(firstName: String = this.firstName, 
             lastName: String = this.lastName,
             title: String = this.title) = {
        new Employee(firstName, lastName, title)
    }
}

class Department(val name: String)

class Manager(firstName: String,
              lastName: String,
              title: String,
              val department: Department) extends Employee(firstName, lastName, title){

}
