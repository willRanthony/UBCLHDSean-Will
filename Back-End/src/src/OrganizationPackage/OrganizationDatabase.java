package OrganizationPackage;

import java.util.HashMap;

public class OrganizationDatabase {

    private HashMap<String, Organization> database;

    /**
     * REP INVARIANT
     * A database representing all of the Organization in the website
     * Organization can exists only once in the database
     * Organization are assigned key values based on their username, as every username must be unique
     **/
    public OrganizationDatabase() {}

    /**
     * Get the number of Organization in the database
     * @return the number of Organization in the database
     */
    public int getSize() {
        return this.database.size();
    }

    /**
     * Get a Organization from the database
     * @param name  the username of the Organization being looked for
     * @return the Organization whose username is
     */
    public Organization getOrganization(String name) throws NoSuchOrganizationException {
        if (!this.existingOrganization(name)) {
            return this.database.get(name);
        }
        throw new NoSuchOrganizationException("User does not EXIST");
    }

    /**
     * Determines if the Organization is present in the database by name
     * @param name  the name of the Organization being looked for
     * @return true if the Organization exists, false if it does not
     */
    public boolean existingOrganization(String name) {
        if (this.database.get(name) == null) {
            return false;
        }
        return true;
    }

    /**
     * Add a Organization to the database of Organization
     * @param org  the Organization to be added
     * @return true if the Organization was added to the database, false if the Organization already exists
     */
    public boolean addOrganization(Organization org) {
        if (!this.existingOrganization(org.getName())) {
            this.database.put(org.getName(), org);
            return true;
        }
        return false;
    }

    /**
     * Remove a Organization from the database of Organization
     * @param org  the Organization to be removed
     * @return true if the Organization was added to the database, false if the Organization did not exist
     */
    public boolean removeOrganization (Organization org) {
        if (this.existingOrganization(org.getName())) {
            this.database.remove(org);
            return true;
        }
        return false;
    }

    /**
     * Checks to see if the username being passed already exists in the database
     * @param requestedName is the username to be checked for validity
     * @return true if the username does not already exist in the database, false if it already exists
     *
    public boolean usernameCheck(String requestedUame) {
        return (!this.database.keySet().contains(requestedUsername));
    }
    **/



}