
void main() {

    String texto ="";
    String opcion = "";
    float dato1 = 0;
    float dato2 = 0;
    float resultado = 0;
    while (!opcion.equals("o")) {
        IO.println("\n===== CALCULADORA =====");
        IO.println("1. Suma");
        IO.println("2. Resta");
        IO.println("3. Multiplicación");
        IO.println("4. División");
        IO.println("0. Salir");
        opcion = IO.readln("Ingrese su opcion: ");
        switch (opcion) {
            case "1":

                texto = IO.readln("Ingrese el primer número: ");
                dato1 = Float.parseFloat(texto);

                texto = IO.readln("Ingrese el segundo número: ");
                dato2 = Float.parseFloat(texto);

                resultado = dato1 + dato2;

                IO.println("Resultado: " + resultado);

                break;
            case "2": IO.println("Restar"); break;
            case "3": IO.println("Multiplicar"); break;
            case "4": IO.println("Division"); break;
            case"0": IO.println("Salir"); break;
            default:
                IO.println("Opcion no valida"); break;
        }
    }
}
