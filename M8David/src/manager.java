import java.time.LocalDate;

public class manager extends person {
    // Variables to store manager information
    LocalDate startDate; // Start date of the manager's tenure
    int experience; // Years of experience of the manager

    // Getter method for retrieving the start date of the manager
    public LocalDate getStartDate() {
        return startDate;
    }

    // Setter method for updating the start date of the manager
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // Getter method for retrieving the experience of the manager
    public int getExperience() {
        return experience;
    }

    // Setter method for updating the experience of the manager
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }

    // Constructor with parameters to initialize manager attributes
    public manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }

    // Default constructor for the Manager class
    public manager() {
    }
}
