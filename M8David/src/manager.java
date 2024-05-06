import java.time.LocalDate;

/**
 * The Manager class represents a manager, extending the Person class.
 */
public class manager extends person {

    /** Start date of the manager's tenure. */
    private LocalDate startDate;

    /** Years of experience of the manager. */
    private int experience;

    /**
     * Constructs a manager with specified attributes.
     *
     * @param name       The name of the manager.
     * @param identifier The identifier of the manager.
     * @param startDate  The start date of the manager's tenure.
     * @param experience The years of experience of the manager.
     */
    public manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }

    /**
     * Constructs a manager with specified attributes.
     *
     * @param startDate  The start date of the manager's tenure.
     * @param experience The years of experience of the manager.
     */
    public manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }

    /**
     * Constructs a manager with default attributes.
     */
    public manager() {
    }

    /**
     * Gets the start date of the manager's tenure.
     *
     * @return The start date of the manager's tenure.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the manager's tenure.
     *
     * @param startDate The start date to set for the manager's tenure.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the years of experience of the manager.
     *
     * @return The years of experience of the manager.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the years of experience of the manager.
     *
     * @param experience The years of experience to set for the manager.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
