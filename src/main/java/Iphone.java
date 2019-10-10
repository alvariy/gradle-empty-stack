public class Iphone extends Mobile{


    @Override
    public void call(String message) {
        System.out.println("<Iphone>Message :" + message);
    }

    @Override
    public void checkMessageLimit() {
        System.out.println("<Iphone> Message cannot be sent");
    }

    //    @Override
//    public void call(String message)
//    {
//        System.out.println("<Iphone>Message :" + message);
//    }


}
