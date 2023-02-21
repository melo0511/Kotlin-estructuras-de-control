// 3. Condicional Anidada

fun main(){

    var helado = 2000
    var precioT = 0

    print("¿Desea un topping para su helado?\n")

    var respuestaTopping = readLine()!!.toString()

    if(respuestaTopping == "si"){

        print("¿Que topping desea para su helado?\n1. Oreo\n2.KitKat\n3.Chipas\nRespuesta: ")

        var topping = readLine()!!.toInt()

        if(topping == 1){
            precioT = 500
        }else if(topping == 2){
            precioT = 700
        }else if(topping == 3){
            precioT = 900
        }else{
            print("No tenemos ese topping")
        }

    }else{
        print("ok, su helado sin topping\n")
    }

    var precioFinal = helado+precioT
    print("Total: $precioFinal")
}