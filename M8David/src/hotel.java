/**
 * The Hotel class represents a hotel.
 */
public class hotel {

    /** Name of the hotel. */
    private String name;

    /** Address of the hotel. */
    private String address;

    /** Website of the hotel. */
    private String web;

    /** Manager object associated with the hotel. */
    private manager manager;

    /**
     * Constructs a hotel with default attributes.
     */
    public hotel() {
    }

    /**
     * Constructs a hotel with specified attributes.
     *
     * @param name    The name of the hotel.
     * @param address The address of the hotel.
     * @param web     The website of the hotel.
     * @param manager The manager associated with the hotel.
     */
    public hotel(String name, String address, String web, manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }

    /**
     * Gets the name of the hotel.
     *
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     *
     * @param name The name to set for the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the hotel.
     *
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the hotel.
     *
     * @param address The address to set for the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the website of the hotel.
     *
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the website of the hotel.
     *
     * @param web The website to set for the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Gets the manager associated with the hotel.
     *
     * @return The manager associated with the hotel.
     */
    public manager getManager() {
        return manager;
    }

    /**
     * Sets the manager associated with the hotel.
     *
     * @param manager The manager to set for the hotel.
     */
    public void setManager(manager manager) {
        this.manager = manager;
    }
}
