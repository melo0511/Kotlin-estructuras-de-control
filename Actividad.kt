1. Condicional simple

fun main(){
    print("Ingrese el valor de la compra: \n")
    var compra = readLine()!!.toDouble()
    if(compra >= 100.000){
        var descuento = 0.2
        var compraDescuento = compra-(compra*descuento)
        print("Descuento: " + (descuento*100) +  "%\n")
        print("Compra sin descuento: $compra\n")
        print("Compra con descuento: $compraDescuento")
        
    }
}


2. Condicional Doble

fun main(){
    print("Ingrese el nombre del estudiante\n")
    var nombre = readLine()!!.toString()
    print("Ingrese la materia\n")
    var materia = readLine()!!.toString()
    print("Ingrese la nota 1\n")
    var n1 = readLine()!!.toDouble()
    print("Ingrese la nota 2\n")
    var n2 = readLine()!!.toDouble()
    print("Ingrese la nota 3\n")
    var n3 = readLine()!!.toDouble()
    var prom = (n1+n2+n3)/3

    if(prom >= 3.5){
        print("Promedio $prom \n El estudiante $nombre ganó la materia $materia")
    }else{
        print("Promedio $prom \n El estudiante $nombre perdió la materia $materia")
    }
}


3. Condicional Anidada

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


4. Condicional multiple con when

fun main(){

val bdUsuario = 1004754678
val bdContraseña = 123

var saldo = 800.000

print("Ingrese su numero de usuario\n")
var usuario = readLine()!!.toInt()
print("Ingrese su contraseña\n")
var contraseña = readLine()!!.toInt()

    if(bdUsuario == usuario && bdContraseña == contraseña){
        print("Datos correctos\n")
        print("¿Que accion desea realizar?\n1. Retiro\n2. Consignacion\n3.Consultar saldo")

        var accion = readLine()!!.toInt()

        when(accion){

            1 -> {
                print("Cuanto desea retirar?")
                var retiro = readLine()!!.toDouble()
                saldo = saldo-retiro
                print("Saldo restante: $saldo") 
            }

            2 -> {
                print("Cuanto desea consignar?")
                var consignacion = readLine()!!.toDouble()
                saldo = saldo+consignacion
                print("Saldo Nuevo: $saldo")
            }

            3 -> {
                print("Saldo: $saldo")
            }
            
        }
    }else if(bdUsuario != usuario && bdContraseña == contraseña){
        print("El usuario es incorrecto, intente nuevamente")
    }else if(bdUsuario == usuario && bdContraseña != contraseña)
        print("La contraseña es incorrecta, intente nuevamente")
    else{
        print("Datos incorrectos intente nuevamente")
    }

}

5. do while

fun main(){

    do{
    print("¿Que accion desea realizar?\n1. suma\n2. resta\n3. multiplicacion\n4. division\n5. salir")
    var accion = readLine()!!.toInt()

    print("Ingrese el numero 1\n")
    var n1 = readLine()!!.toDouble()
    print("Ingrese el numero 2\n")
    var n2 = readLine()!!.toDouble()

    when(accion){
        
        1 ->{    
            print("La suma es: ${n1+n2}\n")
        }

        2 ->{
            print("La resta es: ${n1-n2}\n")
        }

        3 ->{
            print("La multiplicacion es: ${n1*n2}\n")
        }

        4 ->{
            if(n2<=0){
                print("No se puede dividir entre numeros iguales o menores a 0\n")
            }else{
                print("La division es: ${n1/n2}\n")
            }
            
        }

        5 ->{
            print("Adios")
        }
    }

    }while(accion!=5)
}

6. while

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

7. for 
Haga un algoritmo que solicite n números e indique si son positivos o negativos, también debe indicar si tiene uno o
más de 2 dígitos

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