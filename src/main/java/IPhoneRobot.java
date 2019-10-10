public class IPhoneRobot {

    private Iphone iphone;

    public IPhoneRobot(Iphone iphone) {
        this.iphone = iphone;
    }

    public void willCall(String message)
    {
        iphone.call(message);
    }

}
