package tp.tp.State;

public class TecnicoSeleccionadoTemplate {
  private int id;
  private String nombre;

  public TecnicoSeleccionadoTemplate(int id, String nombre) {
    this.nombre = nombre;
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getId() {
    return this.id;
  }

}
