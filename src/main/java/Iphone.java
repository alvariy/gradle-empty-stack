public class Iphone extends Mobile{

//    private int messageLimit = 5;

    @Override
    public void call(String message) {
        if(message.length() <= getMessageLimit()) {
            System.out.println("<Iphone>Message :" + message);
        }
        else
        {
            printMessageLimit();
        }
    }

    @Override
    public void printMessageLimit() {
        System.out.println("<Iphone> Message cannot be sent");
    }

    //    @Override
//    public void call(String message)
//    {
//        System.out.println("<Iphone>Message :" + message);
//    }


}
