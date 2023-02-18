import Tovaroved.*

import Klient.*

fun main()
{

    val Tovaroveds = Tovaroved(
        "Стул",
        "Стол",
        "Шкаф",
        "дуб",
        "Клён",
        "Кедр",
        "Коричневый",
        "Красный",
        "Зелёный"
    )



    Tovaroveds.zapisi()
    val Klients = Klient(
        "Стул",
        "Стол",
        "Шкаф",
        "дуб",
        "Клён",
        "Кедр",
        "Коричневый",
        "Красный",
        "Зелёный"
        )

    Klients.vibor()
    Tovaroveds.black_list()

}