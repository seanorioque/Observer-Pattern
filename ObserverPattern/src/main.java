public class main {
    public static void main(String[] args) {
        News newsAgency = new News();

        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");
        Subscriber subscriber3 = new Subscriber("Charlie");

        newsAgency.attach(subscriber1);
        newsAgency.attach(subscriber2);
        newsAgency.attach(subscriber3);

        // When news is set, all subscribers are automatically notified
        newsAgency.setNewsCategory();

        newsAgency.detach(subscriber2);
        
        // Publish another news update
        newsAgency.setNewsCategory();
    }
}