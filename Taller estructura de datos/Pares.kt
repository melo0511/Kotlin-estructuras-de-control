// -----Pares
// Recorrer una lista de números enteros y en una lista guardar los números pares y en otra lista los números impares, sumar el total de los números pares e impares y guardarlos en una variable par

fun main(){

    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)

    var pares = mutableListOf<Int>()
    var impares = mutableListOf<Int>()
    
    numeros.forEach{element ->
        if(element % 2 == 0){
            pares.add(element)
        }else{
            impares.add(element)
        }   
    }

    print("Numeros pares: $pares \n")
    print("Numeros impares: $impares\n\n")

    var sumaPares = 0
    var sumaImpares = 0

    pares.forEach{element->
        sumaPares+=element
    }

    impares.forEach{element->
        sumaImpares+=element
    }

    var par = Pair(0,0)
    par = sumaPares to sumaImpares

    print("La suma de numeros pares es: " + par.component1()+"\n")
    print("La suma de numeros impares es: "+ par.component2()+"\n")

}