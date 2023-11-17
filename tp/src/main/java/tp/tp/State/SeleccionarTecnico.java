package tp.tp.State;

import java.util.List;

import tp.tp.State.utils.LeerJsonTecnicos;

public class SeleccionarTecnico extends Estado {

  @Override
  public void actuar(Inicio main) {
    List<TecnicoSeleccionadoTemplate> listaDeTecnicos = LeerJsonTecnicos.obtenerTecnicos();
    int idPersona = 2;

    listaDeTecnicos.stream()
        .filter(data -> data.getId() == idPersona)
        .map(data -> data.getNombre())
        .forEach(data -> System.out.println(data));
  }
}
