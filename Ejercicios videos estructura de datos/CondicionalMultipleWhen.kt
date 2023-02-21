// 4. Condicional multiple con when

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