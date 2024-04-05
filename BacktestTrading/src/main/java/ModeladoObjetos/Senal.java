package ModeladoObjetos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Raquel Martínez
 * 
 * Clase que permite crear objetos de tipo señal que contienen los atributos 
 * necesarios para que el tester de señales pueda analizarlas
 */
public class Senal {
    
    // Datos básicos
    private String moneda; // Criptomoneda 
    private String tipo; // Short o Long 
    private String resultadoOperacion; // GANADORA - PERDEDORA - ACTIVA <--(No ha finalizado) 
    private double precioEntrada; // Precio de entrada 
    private double precioStopLoss; // Precio de pérdidas 
    private double precioTakeProfit; // Precio de ganancias 

    // Porcentajes
    private double porcentajeTakeProfit; // Porcentaje entre el precio de entrada y el profit
    private double porcentajeStopLoss; // Porcentaje entre el precio de entrada y stop loss
    private double porcentajeRecorridoFavor; // En operaciones "PERDEDORAS" indica cuánto recorrió el precio
            // a favor de la operación antes de tocar el stop loss, en "GANADORAS" es el % de profit
    
    // Fechas
    private LocalDateTime fechaHoraSenal; // Fecha Hora cuando se recibe la señal
    private LocalDateTime fechaHoraAperturaOperacion; // Fecha Hora cuando se inicia el trade/operación
    private LocalDateTime fechaHoraCierreOperacion; // Cuando el  trade/operación se cierra en stop o profit

    // Tiempos transcurridos
    private int tiempoSenalEntrada; // Tiempo que tardó desde la señal hasta tocar precio de entrada 
    private int tiempoOperacion; // Tiempo desde que inicia la operacion hasta el stop o profit 

    
    public Senal() {
        
    }
    
    
    // Datos Básicos
    
    
    public void setMoneda(String moneda) {
        this.moneda = moneda.toUpperCase() + "USDT";
    }
    
    public String getMoneda() {
        return this.moneda;
    }
    
    
    public void setTipo() {
        
        if (this.precioEntrada != 0 && this.precioStopLoss != 0) {
            
            if (precioEntrada > precioStopLoss) { // LONG
                this.tipo = "LONG";
            }
            else {
                this.tipo = "SHORT";
            }
        }
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    
    public void setResultadoOp(String resultado) {
        this.resultadoOperacion = resultado;
    }
    
    public String getResultadoOp() {
        return this.resultadoOperacion;
    }
    
    
    public void setPrecioE(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    public double getPrecioE() {
        return this.precioEntrada;
    }
    
    
    public void setPrecioSL(double precioStopLoss) {
        this.precioStopLoss = precioStopLoss;
    }
    
    public double getPrecioSL() {
        return this.precioStopLoss;
    }
    
    
    public void setPrecioTP(double precioTakeProfit) {
        this.precioTakeProfit = precioTakeProfit;
    }
    
    public double getPrecioTP() {
        return this.precioTakeProfit;
    }

    
    // Porcentajes
    
    
    public void setPorcentajeSL(double porcentajeStopLoss) {
        this.porcentajeStopLoss = porcentajeStopLoss;
    }
    
    public double getPorcentajeSL() {
        return this.porcentajeStopLoss;
    }
    
    
    public void setPorcentajeTP(double porcentajeTakeProfit) {
        this.porcentajeTakeProfit = porcentajeTakeProfit;
    }
    
    public double getPorcentajeTP() {
        return this.porcentajeTakeProfit;
    }
    
    
    public void setPorcentajeRecorridoF(double porcentajeRecorridoFavor) {
        this.porcentajeRecorridoFavor = porcentajeRecorridoFavor;
    }
    
    public double getPorcentajeRecorridoF() {
        return this.porcentajeRecorridoFavor;
    }
    
    
    // Fechas
    
    
    public void setFHSenal(String fechaHoraSenal) {
        
        this.fechaHoraSenal = LocalDateTime.parse(fechaHoraSenal, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    
    public LocalDateTime getFHSenal() {
        return this.fechaHoraSenal;
    }
    
    
    public void setFHAperturaOperacion(LocalDateTime fechaHora) {
        this.fechaHoraAperturaOperacion = fechaHora;
    }
    
    public LocalDateTime getFHAperturaOperacion() {
        return this.fechaHoraAperturaOperacion;
    }
    
    
    public void setFHCierreOperacion(LocalDateTime fechaHoraCierre) {
        this.fechaHoraCierreOperacion = fechaHoraCierre;
    }
    
    public LocalDateTime getFHCierreOperacion() {
        return this.fechaHoraCierreOperacion;
    }
    
    
    // Tiempos
    
    
    public void setTiempoSenalEntrada(int minutos) {
        this.tiempoSenalEntrada = minutos;
    }
    
    public int getTiempoSenalEntrada() {
        return this.tiempoSenalEntrada;
    }
    
    
    public void setTiempoOp(int minutos) {
        this.tiempoOperacion = minutos;
    }
    
    public int getTiempoOp() {
        return this.tiempoOperacion;
    }
    
    
}
