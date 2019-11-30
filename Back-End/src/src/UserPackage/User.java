package UserPackage;
import OrganizationPackage.Organization;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private String name;
    private String password;
    private final LocalDateTime dateCreated;
    private LocalDateTime lastLogIn;
    private boolean active;
    private List<String> organizations;


    /**
     * REP INVARIANT
     * The username of the account is immutable
     * The creation date of the account in immutable
     * The account is set to active upon creation
     * The account can be activated or deactivated
     *
     * @param username      the string representing the username of the user
     * @param name          the preferred name of the user
     * @param password      the string representing the password of the user
     */

    public User(String                username,
                String                name,
                String                password) {

        this.username = username;
        this.name = name;
        this.password = password;
        this.dateCreated = LocalDateTime.now();
        this.lastLogIn = LocalDateTime.now();
        this.active = true;
        this.organizations = new ArrayList<String>();
    }

    /**
     * Returns the string representing the username of the User
     * @return this.username
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the string representing the name of the User
     * @return this.name
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Returns the string representing the password of the User
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
     * @param name String representing the new preferred name of the User
     * @return void
     **/
    public void setName(String name) {
        this.name = name;
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

    /**
     * Checks if the organization is already a part of the User's list of organizations
     * @return void
     **/
    public boolean checkOrganzation(Organization org) {
        return this.organizations.contains(org.getName());
    }

    /**
     * Adds the organization to the User's list of organizations
     * @return void
     **/
    public void joinOrganzation(Organization org) {
        this.organizations.add(org.getName());
    }

    /**
     * Removes the organization from the User's list of organizations
     * @return void
     **/
    public void leaveOrganzation(Organization org) {
        this.organizations.remove(org.getName());
    }

    public boolean equals(User other) {
        return ((this.username.equals(other.getUsername())) &&
                (this.password.equals(other.getPassword())) &&
                (this.dateCreated.equals(other.getDateCreated())) &&
                (this.lastLogIn.equals(other.getUsername())) &&
                (this.active == other.active));
    }
}