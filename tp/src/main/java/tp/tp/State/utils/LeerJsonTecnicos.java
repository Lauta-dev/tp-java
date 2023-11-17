package tp.tp.State.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import tp.tp.State.TecnicoSeleccionadoTemplate;
import tp.tp.State.TecnicosTemplate;

public class LeerJsonTecnicos {
  public static List<TecnicoSeleccionadoTemplate> obtenerTecnicos() {
    Path path = Paths.get("").toAbsolutePath();

    String rutaJson = path + "/src/main/java/tp/tp/State/items/tecnicos.json";

    try (BufferedReader br = new BufferedReader(new FileReader(rutaJson))) {
      StringBuilder jsonBuilder = new StringBuilder();

      String linea;
      while ((linea = br.readLine()) != null) {
        jsonBuilder.append(linea);
      }

      Gson gson = new Gson();

      TecnicosTemplate[] tecnicosTemplate = gson.fromJson(jsonBuilder.toString(), TecnicosTemplate[].class);

      List<TecnicosTemplate> lista = Arrays.asList(tecnicosTemplate);

      ArrayList<TecnicoSeleccionadoTemplate> tecnicosLista = new ArrayList<TecnicoSeleccionadoTemplate>();
      List<TecnicoSeleccionadoTemplate> tecnicoDisponibles = tecnicosLista;

      lista.forEach(data -> {
        if (data.getDisponibilidad()) {
          TecnicoSeleccionadoTemplate tec = new TecnicoSeleccionadoTemplate(data.getId(), data.getNombre());
          tecnicoDisponibles.add(tec);
        }
      });

      return tecnicoDisponibles;

    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
