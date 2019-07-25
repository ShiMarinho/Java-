/*
 * Class Patient is a concrete class to stored Patients objects
 */
package hospitalManagementSystem;

/**
 *
 * @author ms
 */
public class Patient<E> {

    /*
     * Global variables 
     */
    private final int pid;
    private static int lastPid = 0;
    private String pps;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String city;

    /*
     * Simple Constructor to generate patients without any personal details
     */
    public Patient() {
        pid = ++lastPid;
    }

    /*
     * Main Constructor to generate patients within all personal details
     */
    public Patient(String pps, String firstName, String lastName, String mobileNumber, String email, String city) {

        this.pps = pps;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;
        pid = ++lastPid;
    }

    /*
     * Getters and Setters for the variables of the patient
     */
    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPid() {
        return pid;
    }

    /*
     * toString method to print the patients information
     */
    @Override
    public String toString() {
        return "Patient Details: \n"
                + "Pid: " + pid + "\n"
                + "Name: " + firstName + " " + lastName + "\n"
                + "PPS: " + pps + "\n"
                + "Mobile Number: " + mobileNumber + "\n"
                + "Email: " + email + "\n"
                + "City: " + city + "\n";
    }

}
