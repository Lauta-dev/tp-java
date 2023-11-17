package tp.tp.State;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Inicio {
  private String razonSocial;
  private String cuit;

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

  /* Getter's */

  // razonSocial
  public String getRazonSocial() {
    return this.razonSocial;
  }

  // cuil
  public String getCuit() {
    return this.cuit;
  }

  /* Setter's */

  // razonSocial
  public void setRazonSocial(String razonsocial, String cuit) {
    this.razonSocial = razonsocial;
    this.cuit = cuit;
  }
}
