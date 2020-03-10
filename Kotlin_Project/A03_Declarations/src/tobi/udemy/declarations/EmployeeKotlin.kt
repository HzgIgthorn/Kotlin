package tobi.udemy.declarations

class EmployeeKotlin(var name: String, val id : Int) {

    override fun equals(other: Any?): Boolean {
        if(other is EmployeeKotlin){
            return name == other.name && id == other.id
        }
        return false
    }

    override fun toString(): String {
        return "EmployeeKotlin(name='$name', id=$id)"
    }
}