public class ConcreteObserver implements  Observer {

    private Subject subject;
    private String title;
    private String contents;

    public ConcreteObserver(Subject subject){
        this.subject = subject;
        subject.addObserver(this    );
    }

    @Override
    public void update(Subject subject) {
        ConcreteSubject subj = (ConcreteSubject) subject;
        this.title = subj.getTitle();
        this.contents = subj.getContents();

        display();
     }

     public void display(){
         System.out.println("[title] : " + title);
     }
}
