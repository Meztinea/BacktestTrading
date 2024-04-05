package ModeladoObjetos;

import java.time.LocalDateTime;

/**
 *
 * @author Raquel Martínez
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
    private LocalDateTime fechaHoraEntradaOperacion; // Fecha Hora cuando se inicia el trade/operación
    private LocalDateTime fechaHoraCierreOperacion; // Cuando el  trade/operación se cierra en stop o profit

    // Tiempos transcurridos
    private int tiempoSenalEntrada; // Tiempo que tardó desde la señal hasta tocar precio de entrada 
    private int tiempoOperacion; // Tiempo desde que inicia la operacion hasta el stop o profit 


}
