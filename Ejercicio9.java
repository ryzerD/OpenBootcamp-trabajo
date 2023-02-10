public class Ejercicio9 {

  public static void main(String[] args) {
    cliente clientes = new cliente();
    clientes.setEdad(5);
    clientes.setNombre("Camilo");
    clientes.setTelefono("315");
    clientes.setCredito(3);
    System.out.println(
      clientes.getNombre() +
      clientes.getEdad() +
      clientes.getTelefono() +
      clientes.getCredito()
    );

    trabajador trabajadores = new trabajador();
    trabajadores.setEdad(5);
    trabajadores.setNombre("Camilo");
    trabajadores.setTelefono("315");
    trabajadores.setSalario(3000);

    System.out.println(
      trabajadores.getNombre() +
      trabajadores.getEdad() +
      trabajadores.getTelefono() +
      trabajadores.getSalario()
    );
  }
}

class persona {

  private int edad;
  private String nombre;
  private String telefono;

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}

class cliente extends persona {

  double credito;

  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }
}

class trabajador extends persona {

  double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
