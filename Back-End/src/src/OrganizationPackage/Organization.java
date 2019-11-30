package OrganizationPackage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Organization {

    private String name;
    private String password;
    private final LocalDateTime dateCreated;
    private LocalDateTime lastLogIn;
    private boolean active;
    private List<String> tags;

    //Add in a location tag to help determine the hashcode???

    /**
     * REP INVARIANT
     * The username of the account is immutable
     * The creation date of the account in immutable
     * The account is set to active upon creation
     * The account can be activated or deactivated
     *
     * @param name        the string representing the username of the volunteer
     * @param password    the string representing the password of the volunteer
     * @param dateCreated the LocalDateTime representing the datetime of account creation
     * @param lastLogIn   the LocalDateTime representing the datetime that the user last logged in
     * @param tags        the tags associated with the organization
     */

    public Organization(String name,
                        String password,
                        LocalDateTime dateCreated,
                        LocalDateTime lastLogIn,
                        List<String> tags) {

        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.lastLogIn = lastLogIn;
        this.active = true;
        this.tags = new ArrayList<String>(tags);
    }

    /**
     * @param name        the string representing the username of the volunteer
     * @param password    the string representing the password of the volunteer
     * @param dateCreated the LocalDateTime representing the datetime of account creation
     * @param lastLogIn   the LocalDateTime representing the datetime that the user last logged in
     */
    public Organization(String name,
                        String password,
                        LocalDateTime dateCreated,
                        LocalDateTime lastLogIn) {

        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.lastLogIn = lastLogIn;
        this.active = true;
        this.tags = new ArrayList<String>();
    }

    /**                                 NAME                                 **/

    /**
     * Returns the string representing the username of the Volunteer
     *
     * @return this.name
     **/
    public String getName() {
        return this.name;
    }

    /**                                 PASSWORD                                 **/

    /**
     * Returns the string representing the password of the Volunteer
     *
     * @return this.password
     **/
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password String representing the new password
     * @return void
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**                                 DATE CREATED                                 **/

    /**
     * Returns the LocalDateTime representing the time that the user made their account
     *
     * @return this.dateCreated
     **/
    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**                                 LAST LOGIN                                 **/

    /**
     * Returns the LocalDateTime representing the time that the user last logged in
     *
     * @return this.lastLogIn
     **/
    public LocalDateTime getLastLogIn() {
        return this.lastLogIn;
    }

    /**
     * Updates the time that the user last logged in, to be the current time. Will be called on log-in
     *
     * @return void
     **/
    public void updateLastLogin() {
        this.lastLogIn = LocalDateTime.now();
    }

    /**                                 TAGS                                 **/

    /**
     * Updates the time that the user last logged in, to be the current time. Will be called on log-in
     *
     * @return void
     **/
    public List<String> getTags() {
        List<String> list = new ArrayList<String>();
        Collections.copy(tags, list);
        return list;
    }

    /**                                 STATUS                                 **/

    /**
     * Returns the whether the user is active or not
     *
     * @return this.username
     **/
    public boolean isActive() {
        return this.active;
    }

    /**
     * Activates the user
     *
     * @return void
     **/
    public void activate() {
        this.active = true;
    }

    /**
     * Deactivates the user
     *
     * @return void
     **/
    public void deactivate() {
        this.active = false;
    }

    /**                                 GENERAL                                 **/

    public boolean equals(Organization other) {
        return ((this.name.equals(other.getName())) &&
                (this.password.equals(other.getPassword())) &&
                (this.dateCreated.equals(other.getDateCreated())) &&
                (this.lastLogIn.equals(other.getName())) &&
                (this.active == other.active));
    }

}
