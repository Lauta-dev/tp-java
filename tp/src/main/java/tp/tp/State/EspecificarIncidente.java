package tp.tp.State;

import java.util.Scanner;

public class EspecificarIncidente extends Estado {

  @Override
  public void actuar(Inicio main) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cual servicio desea reportar");

    System.out.println("Servicio");
    String servicio = scanner.nextLine();

    System.out.println("Descripción del incidente");
    String descipcion = scanner.nextLine();

    System.out.println("Tipo de incidente");
    String tipoIncidente = scanner.nextLine();

    // Verifica que todas las variables tengan un valor
    boolean evaluarValores = servicio != null && !servicio.isEmpty() &&
        descipcion != null && !descipcion.isEmpty() &&
        tipoIncidente != null && !tipoIncidente.isEmpty();

    main.setServicioAReportar(servicio);
    main.setDescripcionDelIncidente(descipcion);
    main.setTipoIncidente(tipoIncidente);

    if (evaluarValores) {
      main.cambiarEstado(new ConfirmarIncidente());
      return;
    }

    System.out.println("Algún campo falta");
    scanner.close();

  }

}
