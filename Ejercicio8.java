import java.security.Permissions;

public class Ejercicio8 {

  public static void main(String[] args) {
    persona Persona = new persona();
    Persona.setEdad(10);
    Persona.setNombre("DAVID");
    Persona.setTelefono("315");
    System.out.println(
      Persona.getNombre() + Persona.getEdad() + Persona.getTelefono()
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
