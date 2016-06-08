/**
 * Created by admin on 2016.06.08.
 */
public class Darbuotojas {
    private String vardas;
    private String pavarde;
    private String id;
    private int amzius;
    private String miestas;

    public Darbuotojas() {
    }

    public Darbuotojas(String vardas, String pavarde, String id, int amzius, String miestas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id = id;
        this.amzius = amzius;
        this.miestas = miestas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }
}
