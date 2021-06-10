
package timer_service;

/**
 *
 * @author aimen
 */
public interface TimerService extends TimeChangeProvider {

    int getMinutes();

    int getHeures();

    int getSecondes();

    int getDixiemeDeSeconde();

}
