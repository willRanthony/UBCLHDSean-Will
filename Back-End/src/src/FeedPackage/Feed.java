package FeedPackage;

import OrganizationPackage.Organization;
import UserPackage.User;

import java.util.ArrayList;
import java.util.List;

public class Feed{

    private List<Post> feed;
    private User user;

    public Feed(User user, int max) {
        this.user = user;
        feed = updateFeed(max);
    }

    public List<Post> updateFeed (int maxElements) {
        List<Post> allposts = new ArrayList<Post>();
        for (Organization o : this.user.getOrganizations()) {
            allposts.addAll(o.getPosts());
        }
        List<Post> feed = new ArrayList<Post>();
        List<Post> checked = new ArrayList<Post>();
        for (Post inner : allposts) {
            Post mostRecent = inner;
            for (Post outer : allposts) {
                if ((mostRecent.getDatePosted().isAfter(outer.getDatePosted())) && (!checked.contains(outer))) {
                    mostRecent = outer;
                }
            }
            feed.add(mostRecent);
            checked.add(mostRecent);
        }
        return feed;
    }

}
