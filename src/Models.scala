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

    override def equals(x: Any): Boolean = {
        if(!x.isInstanceOf[Employee]) false
        else {
            val other = x.asInstanceOf[Employee]
            other.firstName == this.firstName &&
            other.lastName == this.lastName &&
            other.title == this.title
        }
    }

    override def hashCode: Int = {
        var result = 19
        result = 31 * result + firstName.hashCode
        result = 31 * result + lastName.hashCode
        result = 31 * result + title.hashCode
        result
    }

    override def toString = s"Employee($firstName, $lastName, $title)"
}

case class Department(name: String){
    override def toString = s"Department: $name"
}

class Manager(firstName: String,
              lastName: String,
              title: String,
              val department: Department) extends Employee(firstName, lastName, title){

    override def fullName() = s"$firstName $lastName, ${department.name} Manager"

    override def copy(firstName: String = this.firstName, 
                      lastName: String = this.lastName,
                      title: String = this.title) = {
        new Manager(firstName, lastName, title, new Department("Toys"))
    }
}
