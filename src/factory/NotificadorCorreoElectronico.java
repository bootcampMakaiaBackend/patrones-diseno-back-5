package factory;

public class NotificadorCorreoElectronico implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificacion por correo electronico");
    }
}
