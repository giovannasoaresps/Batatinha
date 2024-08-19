package js.modeloexemplo.modeloexemplo;


import java.time.LocalDate;

public class Pagamento {
  private float valor;
  private LocalDate data;

  @Override
  public String toString() {
    return "Pagamento{" +
      "valor=" + valor +
      ", data=" + data +
      '}';
  }

  public Pagamento(float valor, LocalDate now) {
    this.valor = valor;
  }

  public Pagamento(LocalDate data) {
    this.data = data;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }
}
