// 7. for 
// Haga un algoritmo que solicite n números e indique si son positivos o negativos, también debe indicar si tiene uno o
// más de 2 dígitos

fun main(){
    print("¿Cuanto veces desea repetir el proceso?")
    var cantidad = readLine()!!.toInt()

    for(i in 0 until cantidad){
        print("Ingrese el numero 1")
        var n1 = readLine()!!.toInt()
        print("Ingrese el numero 2")
        var n2 = readLine()!!.toInt()
        var suma = n1+n2
        print("Suma: $suma")

        when{
            suma >= 10 ->{
                print("La suma es posiva y es de 2 o mas digitos")                
            }

            suma <=0 ->{
                print("La suma es negativa,")
                if(suma<= -10){
                    print("es de dos o mas digitos")
                }else{
                    print("es de un solo digito")
                }
            }
            
            else ->{
                print("La suma es positiva y es de un solo digito")
            }
        }

    }
}