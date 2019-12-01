package OrganizationPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrganizationDatabase {

    private List<Organization> database;

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
     * Determines if the Organization is present in the database by name
     * @param org  the name of the Organization being looked for
     * @return true if the Organization exists, false if it does not
     */
    public boolean existingOrganization(Organization org) {
        return this.database.contains(org);
    }

    /**
     * Get a Organization from the database
     * @param org the username of the Organization being looked for
     * @return the Organization whose username is
     */
    public Organization getOrganization(Organization org) throws NoSuchOrganizationException {
        for (Organization o :database) {
            if (o.equals(org)) {
                return o;
            }
        }
        throw new NoSuchOrganizationException("Organization does not EXIST");
    }

    /**
     * Add a Organization to the database of Organization
     * @param org  the Organization to be added
     * @return true if the Organization was added to the database, false if the Organization already exists
     */
    public boolean addOrganization(Organization org) {
        if (!this.existingOrganization(org)) {
            this.database.add(org);
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
        if (this.existingOrganization(org)) {
            this.database.remove(org);
            return true;
        }
        return false;
    }

    /**
     * Checks to see if the username being passed already exists in the database
     * @param tags is the list of tags that the user wants to return results for
     * @return a list of Organizations that have tags matching the tags passed
     **/
    public List<Organization> searchTags(List<String> tags) {
        List<Organization> results = new ArrayList<Organization>();
        for (Organization o : this.database) {
            for (String t : tags) {
                if (o.getTags().contains(t)) {
                    results.add(o);
                }
            }
        }
        return results;
    }



}