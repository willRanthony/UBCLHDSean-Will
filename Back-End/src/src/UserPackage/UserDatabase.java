package UserPackage;
import java.util.HashMap;

public class UserDatabase {

    private HashMap<String, User> database;

    /**
     * REP INVARIANT
     * A database representing all of the Volunteers in the website
     * Volunteers can exists only once in the database
     * Volunteers are assigned key values based on their username, as every username must be unique
     **/
    public UserDatabase() {}

    /**
     * Get the number of Volunteers in the database
     * @return the number of Volunteers in the database
     */
    public int getSize() {
        return this.database.size();
    }

    /**
     * Get a user from the database
     * @param username  the username of the Volunteer being looked for
     * @return the Volunteer whose username is
     */
    public User getUser(String username) throws NoSuchUserException {
        if (!this.existingUser(username)) {
            return this.database.get(username);
        }
        throw new NoSuchUserException("User does not EXIST");
    }

    /**
     * Determines if the user is present in the database by username
     * @param username  the username of the Volunteer being looked for
     * @return true if the user exists, false if it does not
     */
    public boolean existingUser(String username) {
        if (this.database.get(username) == null) {
            return false;
        }
        return true;
    }

    /**
     * Add a Volunteer to the database of Volunteers
     * @param vol  the Volunteer to be added
     * @return true if the user was added to the database, false if the user already exists
     */
    public boolean addVolunteer(User vol) {
        if (!this.existingUser(vol.getUsername())) {
            this.database.put(vol.getUsername(), vol);
            return true;
        }
        return false;
    }

    /**
     * Remove a Volunteer from the database of Volunteers
     * @param vol  the Volunteer to be removed
     * @return true if the user was added to the database, false if the user did not exist
     */
    public boolean removeVolunteer (User vol) {
        if (this.existingUser(vol.getUsername())) {
            this.database.remove(vol);
            return true;
        }
        return false;
    }

    /**
     * Checks to see if the username being passed already exists in the database
     * @param requestedUsername is the username to be checked for validity
     * @return true if the username does not already exist in the database, false if it already exists
     **/
    public boolean usernameCheck(String requestedUsername) {
        return (!this.database.keySet().contains(requestedUsername));
    }



}