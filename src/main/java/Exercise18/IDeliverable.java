package Exercise18;

/**
 * Interface para manejar el estado del prestamo de videojuegos y series
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IDeliverable {
    void deliver();

    void giveBack();

    Boolean isDelivered();
}
