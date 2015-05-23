
package pe.uni.fiis.prestamo.bean;

/**
 * Created by Henry on 22/05/2015.
 */
public class Prestamo {
    private Float monto;
    private Float tasa;
    private String tipoTasa;
    private Integer numeroPeriodos;

    public Float getValorCuota() {
        Float valorCuota = null;
        Float r;

        if ("Mensual".equals(tipoTasa)) {
            valorCuota = ((tasa / 100) * monto) / (1 - (int)Math.pow(new Float(1 + tasa / 100), new Float(-1 * numeroPeriodos)));
        }
        else if ("Anual".equals(tipoTasa)){
            r= -1 +  (float)Math.pow(new Float(1 + tasa/100),new Float(1/12)) ;
            valorCuota = (r * monto) / (1 - (int)Math.pow(new Float(1 + r), new Float(-1 * numeroPeriodos)));

        }
        return valorCuota;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getTasa() {
        return tasa;
    }

    public void setTasa(Float tasa) {
        this.tasa = tasa;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public Integer getNumeroPeriodos() {
        return numeroPeriodos;
    }

    public void setNumeroPeriodos(Integer numeroPeriodos) {
        this.numeroPeriodos = numeroPeriodos;
    }
}

