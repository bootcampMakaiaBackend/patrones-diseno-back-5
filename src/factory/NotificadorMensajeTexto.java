package factory;

public class NotificadorMensajeTexto implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificacion por mensaje de texto");

    }
}
