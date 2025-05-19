public class MessageService implements Message{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);

    }
}
