package tp.tp.State;

import tp.tp.State._enum.Servicios;

public class Validar extends Estado {
  @Override
  public void actuar(Inicio main) {
    String razonSocial = main.getRazonSocial();
    String cuit = main.getCuit();

    // Valida si todos los campos tienen un valor
    Boolean validar = razonSocial != null && !razonSocial.isEmpty() && cuit != null && !cuit.isEmpty();

    if (validar) {
      System.out.println("TIPOS DE SERVICIOS");
      problemas();

      main.cambiarEstado(new EspecificarIncidente());
      return;
    }

    System.out.println("De los datos para empezar a operar");
  }

  // TIpos de incidentes
  public void problemas() {
    for (Servicios problema : Servicios.values()) {

      System.out.println(problema.toString().toUpperCase());
    }
  }
}
