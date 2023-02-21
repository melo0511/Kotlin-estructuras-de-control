// -----Mapas y Arreglos
// Haga un algoritmo de un cajero automático que pida un usuario y contraseña, y que cada usuario tenga un saldo en banco distinto, luego de que el cajero valide que el usuario existe en la base de datos (datos quemados) el usuario podrá retirar, consignar y consultar el dinero que tiene en el banco

fun main(){

val saldoUsuario = arrayOf(800.000,1.000000,500.000,2.500000,1.800000)

val bdUsuario = mapOf(
    "jhon" to 1,
    "carlos" to 2,
    "juan" to 3,
    "pepe" to 4,
    "luis" to 5,
)

print("Ingrese su nombre de usuario\n")
var usuario = readLine()!!.toString()
print("Ingrese su contraseña\n")
var contraseña = readLine()!!.toInt()

//Aqui se defiene el saldo del usuario por medio del indice que coincida con la contraseña
var saldo = saldoUsuario[contraseña-1]

    for ((clave, valor) in bdUsuario) {

        if(clave == usuario && valor == contraseña){
            print("Datos correctos, bienvenido $clave\n")
            print("¿Que accion desea realizar?\n1. Retiro\n2. Consignacion\n3.Consultar saldo\n")

            var accion = readLine()!!.toInt()

            when(accion){

                1 -> {
                    print("Cuanto desea retirar?\nR: ")
                    var retiro = readLine()!!.toDouble()
                    saldo = saldo-retiro
                    print("Saldo restante: $saldo") 
                }

                2 -> {
                    print("Cuanto desea consignar?\nR: ")
                    var consignacion = readLine()!!.toDouble()
                    saldo = saldo+consignacion
                    print("Saldo Nuevo: $saldo")
                }

                3 -> {
                    print("Saldo: $saldo")
                }
                
            }

        }

    }

}