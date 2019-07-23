public class Test {
    public static void main(String[] args) {
        ConcreteSubject news = new ConcreteSubject();

        ConcreteObserver simpleDisplay = new ConcreteObserver(news);
        news.setNews("Earthquake!!", "Today, Earthquake happens!!");

        ConcreteObserverTwo detailDisplay  = new ConcreteObserverTwo(news);
        news.setNews("Flood!!", "Today, Flood happens!!");

        news.deleteObserver(simpleDisplay);
        news.setNews("Warm", "It is warm today.");
    }
}