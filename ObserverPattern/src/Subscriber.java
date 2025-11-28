public class Subscriber implements SubscriberObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String news) {
        System.out.println("Subscriber " + name + " received news: " + news);
    }

    @Override
    public String toString() {
        return name;
    }
    
}
