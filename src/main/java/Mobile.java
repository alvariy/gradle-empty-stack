public abstract class Mobile {
    private String name;
    private String color;
    private String brand;
    private int messageLimit = 5;

    public void call(String message) {
        System.out.println("Message :" + message);
        if( message.length() > messageLimit )
        {
            printMessageLimit();
        }
    }

    public void describe()
    {
        System.out.println("name :"+ name + ", color :" + color + ", brand :" + brand);
    }

    public void printMessageLimit()
    {
        System.out.println("Message cannot be sent");
    }

    public int getMessageLimit() {
        return messageLimit;
    }

    public void setMessageLimit(int messageLimit) {
        this.messageLimit = messageLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



//    public void main (String args[])
//    {
//
//    }

}
