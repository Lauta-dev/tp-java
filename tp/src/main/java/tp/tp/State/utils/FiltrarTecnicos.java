package tp.tp.State.utils;

import java.util.List;

import tp.tp.State.template.TecnicoSeleccionadoTemplate;

public class FiltrarTecnicos {
  private static List<TecnicoSeleccionadoTemplate> tecnicos = LeerJsonTecnicos.obtenerTecnicos();

  public static void filtrarTodos() {
    tecnicos.stream()
        .map(data -> formato(data.getId(), data.getNombre(), data.getDisponibilidad()))
        .forEach(data -> System.out.println(data));
  }

  public static void filtrarDisponobles(boolean decision) {
    tecnicos.stream()
        .filter(data -> data.getDisponibilidad() == decision)
        .map(data -> formato(data.getId(), data.getNombre(), data.getDisponibilidad()))
        .forEach(data -> System.out.println(data));
  }

  public static String formato(int id, String nombre, boolean dis) {
    return String.format("ID: %s,      NOMBRE: %s      DISPONIBILIDAD: %s", id, nombre, dis);
  }
}
