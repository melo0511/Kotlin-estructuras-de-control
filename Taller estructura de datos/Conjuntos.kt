// -----Conjuntos
// Haga un algoritmo que pida el nombre  y notas de un estudiante y que cada una se guarden en un conjunto diferente, pregunte si quiere agregar cada vez mas estudiantes, y al final diga si ganan o pierden la materia

fun main() {

    print("Agregue a los estudiantes y su nota promedio para saber si pasa la materia\n")
    
    val arrayEstudiantes = mutableSetOf<String>()
    val arrayNotas = mutableSetOf<Double>()

    do{

        print("Ingrese el nombre del estudiante:\n")
        var estudiante = readLine()!!.toString()
        var nota = 0.0
        do{
            print("Ingrese la nota del estudiante:\n")
            nota = readLine()!!.toDouble()
            if(nota <0 || nota >5.0){
                print("Ingrese una nota valida\n")
            }
        }while(nota <0 || nota >5.0)

        arrayEstudiantes.add(estudiante)
        arrayNotas.add(nota)

        if(arrayNotas.last() >=3.5){
            print("El estudiante " + arrayEstudiantes.last() + " ganó la materia\n")
        }else{
            print("El estudiante " + arrayEstudiantes.last() + " perdió la materia\n")
        }
        
        print("¿Desea agregar otro estudiante?, si o no\n")
        var opcion = readLine()!!.toString()

    }while(opcion=="si")

    print("Adios")

}