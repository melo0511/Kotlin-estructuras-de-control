// 2. Condicional Doble

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
