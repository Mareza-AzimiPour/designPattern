package behavioral.observable;

public class ObserverTest {
    public static void main(String[] args) {

        MyTopic topic = new MyTopic();

        Observer number1 = new MyTopicSubscription("object1");
        Observer number2 = new MyTopicSubscription("object2");
        Observer number3 = new MyTopicSubscription("object3");

        topic.register(number1);
        topic.register(number2);
        topic.register(number3);

        number1.setSubject(topic);
        number2.setSubject(topic);
        number3.setSubject(topic);

        number1.update();

        topic.postMessage("new message");//or topic.subscribe(message)
    }
}
