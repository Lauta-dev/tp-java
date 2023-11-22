package tp.tp.State;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

public class Tecnico {
  public String Notificacion(String servicioReporado, String descIncidente, String tipoInicdente) {
    String datos = String.format("Servicio: %s\nDescipcion: %s\nTipo de incidente: %s",
        servicioReporado,
        descIncidente,
        tipoInicdente);

    Timer timer = new Timer();

    AtomicBoolean tareaCompletada = new AtomicBoolean(false);
    LocalDateTime fecha = LocalDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' hh:mm:ss");

    StringBuilder b = new StringBuilder();

    timer.schedule(new TimerTask() {
      public void run() {
        tareaCompletada.set(true);
        b.append("datos");
      }

    }, 3000);

    try {
      Thread.sleep(4000);
      timer.cancel();

    } catch (Exception e) {
      System.err.println(e);
    }

    if (tareaCompletada.get()) {
      String a = String.format("Su incidente: %s, se arreglo el %s.",
          servicioReporado,
          fecha.format(f));
      return a;
    }

    return datos;

  }

}
