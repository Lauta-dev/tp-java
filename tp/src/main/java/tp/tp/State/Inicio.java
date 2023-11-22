package tp.tp.State;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Inicio {

  // Cliente
  private String razonSocial;
  private String cuit;
  private String confimarIncidente;

  private String servicioAReportar;
  private String descripcionDelIncidente;
  private String tipoIncidente;

  // Operador
  private String nombreDelTecnico;

  // Tecnico
  private boolean problemaResuelto;

  // ----

  private Estado estado;

  public Inicio() {
    this.estado = new Validar();
  }

  public void actuar() {
    this.estado.actuar(this);
  }

  public void cambiarEstado(Estado estado) {
    this.estado = estado;
  }

  // razonSocial
  public String getRazonSocial() {
    return this.razonSocial;
  }

  // cuil
  public String getCuit() {
    return this.cuit;
  }

  // Getter cuit y razon social
  public void setRazonCuit(String razonsocial, String cuit) {
    this.razonSocial = razonsocial;
    this.cuit = cuit;
  }

  // Confirmar incidente
  public String getConfirmarIncidente() {
    return this.confimarIncidente;
  }

  public void setconfirmarIncidente(String confirmarIncidente) {
    this.confimarIncidente = confirmarIncidente;
  }

  // Servicio A Reportar
  public String getServicioAReportar() {
    return servicioAReportar;
  }

  public void setServicioAReportar(String servicioAReportar) {
    this.servicioAReportar = servicioAReportar;
  }

  // Descripcion Del Incidente
  public String getDescripcionDelIncidente() {
    return descripcionDelIncidente;
  }

  public void setDescripcionDelIncidente(String descripcionDelIncidente) {
    this.descripcionDelIncidente = descripcionDelIncidente;
  }

  // Tipo De Incidente
  public String getTipoIncidente() {
    return tipoIncidente;
  }

  public void setTipoIncidente(String tipoIncidente) {
    this.tipoIncidente = tipoIncidente;
  }

  // Nombre Del Tecnico
  public String getNombreDelTecnico() {
    return nombreDelTecnico;
  }

  public void setNombreDelTecnico(String nombreDelTecnico) {
    this.nombreDelTecnico = nombreDelTecnico;
  }

  // Problema resuelto
  public boolean esProblemaResuelto() {
    return problemaResuelto;
  }

  public void setProblemaResuelto(boolean problemaResuelto) {
    this.problemaResuelto = problemaResuelto;
  }
}
