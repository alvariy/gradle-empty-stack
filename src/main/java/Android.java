public class Android extends Mobile {


    @Override
    public void call(String message) {
        if(message.length() <= getMessageLimit()) {
            System.out.println("<Android>Message :" + message);
        }
        else
        {
            printMessageLimit();
        }
    }

    @Override
    public void printMessageLimit() {
        System.out.println("<Android> Message cannot be sent");
    }

//    @Override
//    public void call(String message)
//    {
//        System.out.println("<Android>Message :" + message);
//    }

}
