// 5. do while

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