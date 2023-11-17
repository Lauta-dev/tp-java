package tp.tp.State;

public class TecnicosTemplate {
  private int id;
  private String nombre;
  private boolean disponibilidad;

  public int getId() {
    return this.id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public boolean getDisponibilidad() {
    return this.disponibilidad;
  }

  @Override
  public String toString() {
    return "id = " + id +
        ", nombre = " + nombre +
        ", disponibilidad = " + disponibilidad + "";
  }

}
