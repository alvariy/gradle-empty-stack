public class Android extends Mobile {


    @Override
    public void call(String message) {
        System.out.println("<Android>Message :" + message);
    }

    @Override
    public void checkMessageLimit() {
        System.out.println("<Android> Message cannot be sent");
    }

//    @Override
//    public void call(String message)
//    {
//        System.out.println("<Android>Message :" + message);
//    }

}
