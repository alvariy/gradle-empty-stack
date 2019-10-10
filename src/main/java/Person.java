public class Person{

    private String name;
    private Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void willCall(String message)
    {
        mobile.call(message);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


}
