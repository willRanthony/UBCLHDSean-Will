package VolunteerPackage;
import java.time.LocalDateTime;

public class Volunteer  {
    private final String username;
    private String password;
    private final LocalDateTime dateCreated;
    private LocalDateTime lastLogIn;
    private boolean active;


    /**
     * REP INVARIANT
     * The username of the account is immutable
     * The creation date of the account in immutable
     * The account is set to active upon creation
     * The account can be activated or deactivated
     *
     * @param username      the string representing the username of the volunteer
     * @param password      the string representing the password of the volunteer
     * @param dateCreated   the LocalDateTime representing the datetime of account creation
     * @param lastLogIn     the LocalDateTime representing the datatime that the user last logged in
     */

    public Volunteer (String                username,
                      String                password,
                      LocalDateTime         dateCreated,
                      LocalDateTime         lastLogIn) {

        this.username = username;
        this.password = password;
        this.dateCreated = dateCreated;
        this.lastLogIn = lastLogIn;
        this.active = true;
    }

    /**
     * Returns the string representing the username of the Volunteer
     * @return this.username
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the string representing the password of the Volunteer
     * @return this.password
     **/
    public String getPassword() {
        return this.password;
    }

    /**
     * Returns the LocalDateTime representing the time that the user made their account
     * @return this.dateCreated
     **/
    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns the LocalDateTime representing the time that the user last logged in
     * @return this.lastLogIn
     **/
    public LocalDateTime getLastLogIn() {
        return this.lastLogIn;
    }

    /**
     * Returns the whether the user is active or not
     * @return this.username
     **/
    public boolean isActive() {
        return this.active;
    }

    /**
     * @param password String representing the new password
     * @return void
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Updates the time that the user last logged in, to be the current time. Will be called on log-in
     * @return void
     **/
    public void updateLastLogin() {
        this.lastLogIn = LocalDateTime.now();
    }

    /**
     * Activates the user
     * @return void
     **/
    public void activate() {
        this.active = true;
    }

    /**
     * Deactivates the user
     * @return void
     **/
    public void deactivate() {
        this.active = false;
    }

    public boolean equals(Volunteer other) {
        return ((this.username.equals(other.getUsername())) &&
                (this.password.equals(other.getPassword())) &&
                (this.dateCreated.equals(other.getDateCreated())) &&
                (this.lastLogIn.equals(other.getUsername())) &&
                (this.active == other.active));
    }
}