/**
 * Created by admin on 2016.06.08.
 */
public class Vadovas extends Darbuotojas {
    private static Vadovas instance = null;

    protected Vadovas() {
    }

    public static Vadovas getInstance() {
        if(instance == null) {
            instance = new Vadovas();
        }
        return instance;
    }
}
