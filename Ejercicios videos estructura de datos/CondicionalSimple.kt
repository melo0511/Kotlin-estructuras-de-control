// 1. Condicional simple

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