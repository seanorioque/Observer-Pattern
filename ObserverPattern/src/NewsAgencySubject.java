public interface NewsAgencySubject {

    public void attach(SubscriberObserver subscriber);
    public void detach(SubscriberObserver subscriber);
    public String notifyClients();



    
}
