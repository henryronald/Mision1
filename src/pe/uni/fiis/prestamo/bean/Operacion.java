package pe.uni.fiis.prestamo.bean;

/**
 * Created by Henry on 22/05/2015.
 */
public class Operacion {
    public static void main(String[] args) {
        Conversion anualMensual=new Conversion("Anual","Mensual",36f);

        Prestamo personal=new Prestamo();
        personal.setMonto(15000f);
        personal.setTasa(anualMensual.getValor());
        personal.setTipoTasa("Anual");
        personal.setNumeroPeriodos(24);

        System.out.println("Valor de Cuota:" + " " + personal.getValorCuota());

    }
}