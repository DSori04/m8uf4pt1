public class guest extends person {
    // Variable to store guest nationality
    String nationality;

    // Getter method for retrieving the guest's nationality
    public String getNationality() {
        return nationality;
    }

    // Setter method for updating the guest's nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Constructor with parameter to initialize guest nationality
    public guest(String nationality) {
        this.nationality = nationality;
    }

    // Default constructor for the Guest class
    public guest() {
    }
}
