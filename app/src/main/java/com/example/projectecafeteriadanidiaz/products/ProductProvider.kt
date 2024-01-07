package com.example.projectecafeteriadanidiaz.products

class ProductProvider {
    companion object{

        fun getBegudaProducts(): List<Product> {
            return products.filter { it.type.equals("beguda", ignoreCase = true) }
        }

        fun getMenjarProducts(): List<Product> {
            return products.filter { it.type.equals("menjar", ignoreCase = true) }
        }
        val products = listOf(
            Product(
                name = "Cafè Americà",
                desc = "Desperta els teus sentits amb el nostre cafè fort.",
                type = "beguda",
                price = 2000.50F,
                photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNqn_NKNCSJQgqw0GQa7c6obvnjFsFvzNyeKA7SzNB5tWXFyRxzSflDG1BeA6HgvBoanM&usqp=CAU"
            ),
            Product(
                name = "Latte Caramel",
                desc = "Espresso suau amb llet vaporitzada i caramel.",
                type = "beguda",
                price = 4.00F,
                photo = "https://www.gastrolabweb.com/u/fotografias/m/2021/11/4/f685x385-21156_58849_5050.jpg"
            ),
            Product(
                name = "Té Verd",
                desc = "Té verd gelat refrescant amb llimona.",
                type = "beguda",
                price = 3.50F,
                photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrd98Ls7jY7cwgkxgZcGit2BVJ17TRmXq5tp6T3BqAFMGByBFKzsRIEXwnr6IR9929FPs&usqp=CAU"
            ),
            Product(
                name = "Cappuccino Clàssic",
                desc = "Espresso, llet vaporitzada i escuma de llet.",
                type = "beguda",
                price = 3.75F,
                photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkSQLVdlBCLgMvDAIzDJCBpdsUWX2FVSPWm0eJOaPMJq69ICAJIzze2PaYx81KEdJ3oDI&usqp=CAU"
            ),
            Product(
                name = "Mocca Fosc",
                desc = "Xocolata calenta, espresso i nata muntada.",
                type = "beguda",
                price = 4.25F,
                photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4f5c1f5dsTeI_vplt-jqRBjjcgiiYeSVfrtwo3WE9ybv_5I7KUKpl8GFtJEcFuM7ErM4&usqp=CAU"
            ),
            Product(
                name = "Batut de Fruites Tropicals",
                desc = "Mescla fresca de fruites tropicals i iogurt.",
                type = "beguda",
                price = 4.50F,
                photo = "https://www.recetasnestle.com.mx/sites/default/files/srh_recipes/056d2839c6829352aa2f7eff43543453.jpg"
            ),
            Product(
                name = "Aigua Infusa amb Fruites",
                desc = "Aigua refrescant amb notes de fruites fresques.",
                type = "beguda",
                price = 2.00F,
                photo = "https://static.vecteezy.com/system/resources/previews/000/812/278/large_2x/infused-water-mix-of-strawberry-watermelon-and-kiwi-photo.jpg"
            ),
            Product(
                name = "Croissant de pernil i formatge",
                desc = "Deliciós croissant farcit de pernil i formatge.",
                type = "menjar",
                price = 3.50F,
                photo = "https://mejorconsalud.as.com/wp-content/uploads/2015/07/croissants-de-jam%C3%B3n-y-queso.jpg"
            ),
            Product(
                name = "Entrepà de gall dindi i Alvocat",
                desc = "Pa integral amb pernil dindi, alvocat i amanida.",
                type = "menjar",
                price = 5.00F,
                photo = "https://polvillo.es/wp-content/uploads/2016/02/Viena-premium-con-pavo-con-pistacho-y-trufa-negramanzanaaguacate-y-mostaza-a-la-miel.jpg"
            ),
            Product(
                name = "Donut de Vainilla",
                desc = "Clàssic donut esponjós amb vainilla.",
                type = "menjar",
                price = 2.25F,
                photo = "https://bavette.es/wp-content/uploads/berlinas-caramelo-copia.jpg"
            ),
            Product(
                name = "Amanida Caprese",
                desc = "Tomàquet, mozzarella i alfabrega fresca.",
                type = "menjar",
                price = 4.75F,
                photo = "https://i.blogs.es/5ca73e/ensalada-caprese-rehacer-pakus-dap/840_560.jpg"
            ),
            Product(
                name = "Bagel amb Salmó Fumat",
                desc = "Bagel amb formatge cremós, salmó fumat i ceba.",
                type = "menjar",
                price = 6.50F,
                photo = "https://martiko.com/wp-content/uploads/2022/05/Bagel-de-salmon-nature-Martiko-2-1200x900.jpg"
            ),
            Product(
                name = "Muffin de Nabius",
                desc = "Muffin esponjós amb nabius frescos.",
                type = "menjar",
                price = 2.75F,
                photo = "https://es.cravingsjournal.com/wp-content/uploads/2021/06/muffins-de-ara%CC%81ndanos-XL-10.jpg"
            ),
            Product(
                name = "Empanada d'Espinacs i Formatge Feta",
                desc = "Pasta fullada farcida d'espinacs i formatge feta.",
                type = "menjar",
                price = 3.25F,
                photo = "https://i.ytimg.com/vi/5bG8dUJk3rM/maxresdefault.jpg"
            )
        )

    }
}