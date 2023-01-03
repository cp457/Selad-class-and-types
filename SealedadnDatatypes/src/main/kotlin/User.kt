import kotlin.math.log

fun main(){
    val checkData1 = Email (" 1", " datauser1@hotmail.it", " datauser1")
    val checkData2 = Email (" 2", " datauser2@hotmail.it", " datauser2")
    val checkData3 = Email (" 3", " datauser3@hotmail.it", " datauser3")
    val checkData4 = Facebook (" 4", " datauser4@hotmail.it", " datauser4")
    val checkData5 = Facebook (" 5", " datauser5@hotmail.it", " datauser5")
    val checkData6 = Facebook (" 6", " datauser6@hotmail.it", " datauser6")
    val checkData7 = Google (" 7", " datauser7@hotmail.it", " datauser7")
    val checkData8 = Google (" 8", " datauser8@hotmail.it", " datauser8")
    val checkData9 = Google (" 9", " datauser9@hotmail.it", " datauser9")
    data(checkData1)
    data(checkData2)
    data(checkData3)
    data(checkData4)
    data(checkData5)
    data(checkData6)
    data(checkData7)
    data(checkData8)
    data(checkData9)
}

    fun data(user: User) = when(user){
        is Email -> println("Data check: ${user}")
        is Facebook -> println("Data check: ${user}")
        is Google -> println("Data check: ${user}")

    }

    sealed class User(open val id: String, open val email: String, open val password: String ) {}







