
void main() {
    IO.println(String.format("INVENTARIO LICORERIA"));
    IO.println(String.format("seleccione opcion"));
    float dato1 = 40;
    float dato2 = 60;

    IO.println("Calculadora");
    String texto = IO.readln("Ingrese el primer valor: ");
    dato1 = Integer.parseInt(texto);
    texto = IO.readln("Ingrese el segundo valor: ");
    dato2 = Integer.parseInt(texto);
    float resultado = 0;
    resultado = dato1 + dato2;
    IO.println(String.format("El resultado de %s + %s = %s", dato1, dato2, resultado));
    String opcion ="";
    while (!Objects.equals(opcion, "0")) {
        IO.println("1. Suma\n2.Resta\n3.Multiplicacion\n4Division\n0.Salir");
        opcion = IO.readln("Ingrese su opcion: ");
        IO.println(opcion);
        switch (opcion) {
            case "1": IO.println("Sumar"); break;
            case "2": IO.println("Restar"); break;
            default: {};
        }
    }
}
