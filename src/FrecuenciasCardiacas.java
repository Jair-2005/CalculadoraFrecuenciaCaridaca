import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int año;

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int año) {
        setNombre(nombre);
        setApellido(apellido);
        setMes(mes);
        setDia(dia);
        setAño(año);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }


    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }


    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }


    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }


    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}