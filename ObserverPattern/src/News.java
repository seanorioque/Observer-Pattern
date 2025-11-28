import java.util.ArrayList;
import java.util.List;

public class News implements NewsAgencySubject {
    private String[] newsName = new String[] { "Politics", "Sports", "Entertainment", "Technology" };
    private String currentNews;
    private List<SubscriberObserver> subscriberList;

    public News() {
        this.subscriberList = new ArrayList<>(); // Initialize the list
    }

    public void setNewsCategory() {
        int randomIndex = (int)(Math.random() * newsName.length);
        this.currentNews = newsName[randomIndex];
        notifyClients(); // Automatically notify when news changes
    }

    public String getNewsCategory() {
        return currentNews;
    }

    @Override
    public void attach(SubscriberObserver subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(SubscriberObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifyClients() {
        for(SubscriberObserver subscriber : subscriberList) {
            subscriber.update("News Flash: " + currentNews + "!");
        }
        return currentNews;
    }
}