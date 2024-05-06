/**
 * The Guest class represents a guest, extending the Person class.
 */
public class guest extends person {

    /** The nationality of the guest. */
    private String nationality;

    /**
     * Constructs a guest with a specified nationality.
     *
     * @param nationality The nationality of the guest.
     */
    public guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Constructs a guest with no specified nationality.
     * The nationality should be set using the setter method.
     */
    public guest() {
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
