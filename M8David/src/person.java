/**
 * The Person class represents a person.
 */
public class person {

    /** Name of the person. */
    private String name;

    /** Identifier of the person. */
    private String identifier;

    /**
     * Constructs a person with specified attributes.
     *
     * @param name       The name of the person.
     * @param identifier The identifier of the person.
     */
    public person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Constructs a person with default attributes.
     */
    public person() {
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The name to set for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the identifier of the person.
     *
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     *
     * @param identifier The identifier to set for the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
