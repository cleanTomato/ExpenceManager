
class Expense(private val summ: Int, private val category: String, private val date: String){
    var dd: Int = 0

    constructor(summ: Int, b: String, category: String, date: String, extra:Int): this(summ, category, date){
        dd = extra;


    }

    fun getSumm(): Int{
        return summ
    }

    fun getCategory(): String{
        return category
    }

    fun getDate(): String{
        return date
    }

    fun printDetails(){
        println("Сумма расхода: $summ Категория: $category Дата: $date")
    }
}

class ExpenceManager{
    private val exp_list = mutableListOf<Expense>()

    fun addExpense(expense: Expense) {
        exp_list.add(expense)
    }

    fun printAllExpenses() {
        var s = 0
        println("Сумма ваших расходов:")
        for (expense in exp_list) {
            s += expense.getSumm()
        }
        println(s)
    }

    fun printAllByCategory(info: String){
        var s = 0
        for (expense in exp_list){
            if (expense.getCategory() == info){
                s += expense.getSumm()
            }
        }
        println("Сумма расхода по категории $info: $s")
    }
}

fun main() {
    val expenceList = mutableListOf<Expense>()
    println("Q - выход")
    while (true){
        println("Введите сумму расходов или Q(выход):")
        val ammount = readln()
        if (ammount == "Q"){
            break
        }
        println("Введите категорию:")
        val catg = readln()
        println("Введите дату:")
        val dat = readln()
        val exp = Expense(ammount.toInt(), catg, dat)
        expenceList.add(exp)

    }
    println("Расходы:")
    for (i in expenceList){
        i.printDetails();
    }

}