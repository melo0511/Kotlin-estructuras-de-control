// 6. while

fun main(){
var respuesta = "si"
var contador = 0

    while(respuesta == "si"){
        print("Ingrese el nombre")
        var nombre = readLine()!!.toString()
        print("$nombre fue agregado exitosamente")
        contador++

        print("¿Desea agregar mas personas a la lista, Responda si o no")
        respuesta = readLine()!!.toString()
    }

    print("Cantidad de personas en la lista: $contador")
}