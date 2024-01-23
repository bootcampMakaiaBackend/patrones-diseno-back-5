package factory;

public class Main {
    public static void main(String[] args) {
        // centralizar la creacion de los objectos... tiene que ser de un mismo tipo
        Notificador notificador = FabricaNotificadora.obtenerNotificador("PUSH");
        Notificador notificadorMensaje = FabricaNotificadora.obtenerNotificador("SMS");
        notificadorMensaje.notificar();
        notificador.notificar();
    }
}