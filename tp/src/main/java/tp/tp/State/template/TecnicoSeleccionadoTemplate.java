package tp.tp.State.template;

public class TecnicoSeleccionadoTemplate {
  private int id;
  private String nombre;
  private boolean disponibilidad;

  public TecnicoSeleccionadoTemplate(int id, String nombre, boolean disponibilidad) {
    this.nombre = nombre;
    this.id = id;
    this.disponibilidad = disponibilidad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getId() {
    return this.id;
  }

  public boolean getDisponibilidad() {
    return this.disponibilidad;
  }

}
