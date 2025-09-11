fun main (args :Array<String>){
    val nombre = args [0]
    val proceso = ProcessBuilder(nombre)
    proceso.start()
    print("se ha ejecutado $nombre")

}