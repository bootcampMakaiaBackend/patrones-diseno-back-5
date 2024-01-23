package factory;

public class NotificadorPush implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificacion por push");
    }
}
