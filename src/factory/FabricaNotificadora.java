package factory;

public class FabricaNotificadora {

    public static Notificador obtenerNotificador(String  tipo) {
        switch (tipo) {
            case "CORREO":
                return new NotificadorCorreoElectronico();
            case "PUSH":
                return new NotificadorPush();
            case "TXT":
                return new NotificadorMensajeTexto();
            case "CARTA":
                    return new NotificadorCarta();
            default:
                return new NotificadorCorreoElectronico();
        }
    }
}
