
// Crear una lista de números enteros y determinar si todos los elementos son pares

fun main(){

val numeros1 = arrayListOf(1,2,3,4,5,6,7,8,9,10)
val numeros2 = arrayListOf(2,4,6,8,10)
val repetidos = mutableListOf<Int>()

    numeros1.forEach{elementL1 ->

        numeros2.forEach{elementL2 ->

            if(elementL1 == elementL2){
                repetidos.add(elementL1)
            }

        }

    }

    print("Los numeros que se repiten son: $repetidos")

}