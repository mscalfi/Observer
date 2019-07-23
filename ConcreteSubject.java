import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String title;
    private String contents;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this));
    }

    public void setNews(String title, String contents) {
        System.out.println("\n\nNews arrived!!");
        this.title = title;
        this.contents = contents;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}
