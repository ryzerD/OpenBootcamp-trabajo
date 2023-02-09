import java.util.Scanner;

class primeraparte {

  public static void main(String[] args) {
    int numeroif = 5;
    if (numeroif > 0) {
      System.out.println("Es mayor");
    } else if (numeroif < 0) {
      System.out.println("Es menor");
    } else {
      System.out.println("Es 0");
    }
    int numeroWhile = 0;
    while (numeroWhile < 3) {
      System.out.println(numeroWhile + "While");
      numeroWhile++;
    }
    int dowhile = 1;
    do {
      System.out.println(dowhile + "DoWhile");
      dowhile++;
    } while (dowhile < 0);
    for (int i = 0; i <= 3; i++) {
      System.out.println(i + "for");
    }
    System.out.println("Escriba un numero del 0 al 3 para elegir su estacion");
    System.out.println("0.Verano \n");
    System.out.println("1.Invierno \n");
    System.out.println("2.Primavera \n");
    System.out.println("3.otono \n");
    Scanner escaner = new Scanner(System.in);
    int estacion = escaner.nextInt();
    switch (estacion) {
      case 0:
        System.out.println("Verano");
        break;
      case 1:
        System.out.println("Invierno");
        break;
      case 2:
        System.out.println("Primavera");
        break;
      case 3:
        System.out.println("otono");
        break;
      default:
        System.out.println("Inserte un valor valido");
        break;
    }
  }
}
