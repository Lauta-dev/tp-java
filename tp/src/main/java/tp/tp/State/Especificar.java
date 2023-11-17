package tp.tp.State;

import java.util.Scanner;

public class Especificar extends Estado {

  @Override
  public void actuar(Inicio main) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cual servicio desea reportar");

    System.out.println("Servicio");
    String servicio = scanner.nextLine();

    System.out.println("Descripción del problema");
    String descipcion = scanner.nextLine();

    System.out.println("Tipo de incidente");
    String tipoIncidente = scanner.nextLine();

    boolean evaluarValores = servicio != null && !servicio.isEmpty() &&
        descipcion != null && !descipcion.isEmpty() &&
        tipoIncidente != null && !tipoIncidente.isEmpty();
    scanner.close();

    if (evaluarValores) {
      main.cambiarEstado(new SeleccionarTecnico());

      return;
    }

    System.out.println("Algún campo falta");

  }

}
