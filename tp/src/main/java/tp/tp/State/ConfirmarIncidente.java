package tp.tp.State;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConfirmarIncidente extends Estado {

  @Override
  public void actuar(Inicio main) {
    Resumen(main);

    System.out.println(" ");

    String tiempoEstimado = "20 minutos";

    String aceptar = "Y/S";
    String rechazar = "N";

    String tiempoRestanteFormato = String.format("Tiempo estimado de resolución: %s", tiempoEstimado);

    String decision = String.format("Aceptar: %s, Rechazar %s", aceptar, rechazar);

    System.out.println(tiempoRestanteFormato);
    System.out.println(decision);

    String pregunta = Pregunta();
    main.setconfirmarIncidente(pregunta);

    if (pregunta.equals("Y") || pregunta.equals("S")) {
      String a = new Tecnico().Notificacion(
          main.getServicioAReportar(),
          main.getDescripcionDelIncidente(),
          main.getTipoIncidente());

      System.out.println(a);

      return;
    }

    else if (pregunta.equals("N")) {
      System.out.println("OK");
      return;
    }

    System.out.println("Algún valor se ingreso de manera incorrecta");
  }

  public static String Pregunta() {
    Scanner scanner = new Scanner(System.in);
    String decision = scanner.nextLine().toUpperCase();

    return decision;

  }

  // Resumen de lo que el usuario ingreso
  public static void Resumen(Inicio main) {
    String[] leyendas = {
        "Razón social:          ",
        "CUIT:                  ",
        "Servicio reportado:    ",
        "Descripcion:           ",
        "Tipo de incidente:     "
    };

    String[] resumen = {
        main.getRazonSocial(),
        main.getCuit(),
        main.getServicioAReportar(),
        main.getDescripcionDelIncidente(),
        main.getTipoIncidente() };

    System.out.println("Resumen");

    for (int i = 0; i < resumen.length; i++) {
      String format = String.format("%s %s", leyendas[i], resumen[i]);
      System.out.println(format);
    }
  };

}
