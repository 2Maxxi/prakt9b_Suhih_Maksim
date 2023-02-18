package Tovaroved


open class Tovaroved( var nazvanie1:String, var nazvanie2:String,var nazvanie3:String,var material1:String,var material2:String, var material3:String, var collor1: String,var collor2: String, var collor3: String) {


   open fun zapisi () {
        println("Введите название 1-го товара")
        nazvanie1 = readln()!!.toString()
        println("Введите материал 1-го товара")
        material1 = readln()!!.toString()
        println("Введите цвет 1-го товара")
        collor1  = readln()!!.toString()
        println("Введите название 2-го товара")
        nazvanie2 = readln()!!.toString()
        println("Введите материал 2-го товара")
        material2 = readln()!!.toString()
        println("Введите цвет 2-го товара")
        collor2  = readln()!!.toString()
        println("Введите название 3-го товара")
        nazvanie3 = readln()!!.toString()
        println("Введите материал 3-го товара")
        material3 = readln()!!.toString()
        println("Введите цвет 3-го товара")
        collor3  = readln()!!.toString()

    }

    open fun black_list ()
    {
        var a = 0
        try {
            println("Хотите добавить покупателя в чёрный список\nнажмите 1 для добавления в чёрный список \nнажмите 0 если не хотите")
            a = readln()!!.toInt()
            if (a==1)
            {
                println("покупатель добавлен в чёрный список")
            }
            else
            {
                println("покупатель не в чёрном списке")
            }
        }
        catch (e:Exception)
        {
            println("Неверный ввод")
        }
    }

}