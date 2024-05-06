/**
 * The Guest class represents a guest, extending the Person class.
 */
public class Guest extends Person {

    /** The nationality of the guest. */
    private String nationality;

    /**
     * Constructs a guest with specified attributes.
     *
     * @param name        The name of the guest.
     * @param identifier  The identifier of the guest.
     * @param nationality The nationality of the guest.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }

    /**
     * Constructs a guest with specified nationality.
     *
     * @param nationality The nationality of the guest.
     */
    public Guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets the nationality of the guest.
     *
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     *
     * @param nationality The nationality to set for the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
