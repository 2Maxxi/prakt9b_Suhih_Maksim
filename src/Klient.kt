
import Tovaroved.*


class Klient ( Anazvanie1:String, Anazvanie2:String,Anazvanie3:String, Amaterial1:String, Amaterial2:String,  Amaterial3:String,  Acollor1: String, Acollor2: String,  Acollor3: String): Tovaroved (Anazvanie1, Anazvanie2, Anazvanie3, Amaterial1, Amaterial2,  Amaterial3,  Acollor1, Acollor2,  Acollor3)
{

    fun vibor ()
    {
        var a =0
        while(a!=1)
        {
            try{
                println("Товар №1:\nесли выбрали этот товар нажмите 1, если хотите перейти к следующему нажмите 0\n Название:$nazvanie1\tматериал:$material1\tЦвет:$collor1")
                a = readLine()!!.toInt()
                if (a ==1)
                {
                    println("товар успешно приобретён")
                    break
                }
                else {
                    println("Товар №2:\nесли выбрали этот товар нажмите 1, если хотите перейти к следующему нажмите 0\n Название:$nazvanie2\tматериал:$material2\tЦвет:$collor2")
                    a = readLine()!!.toInt()
                    if (a == 1) {
                        println("товар успешно приобретён")
                        break
                    } else {
                        println("Товар №3:\nесли выбрали этот товар нажмите 1, если хотите перейти к следующему нажмите 0\n Название:$nazvanie3\tматериал:$material3\tЦвет:$collor3")
                        a = readLine()!!.toInt()
                        if (a == 1) {
                            println("товар успешно приобретён")
                            break
                        }
                    }
                }
            }
            catch (e:Exception) {

                println("Неверный ввод")
                a = 0
            }
        }



    }


}