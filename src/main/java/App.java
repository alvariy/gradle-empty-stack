/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
//    public String getGreeting() {
//        return "Hello world.";
//    }

    public static void main(String[] args) {

//        Android android = new Android();
//        android.setName("Android Phone");
//        android.setBrand("samsung");
//        android.setColor("Blue");
//        android.setMessageLimit(5);
//        android.describe();
//        android.setMessageLimit(5);

        Iphone iphone = new Iphone();
        iphone.setMessageLimit(5);
        iphone.call("Helloooo");

//        Android iphone = new Android();
//        iphone.setMessageLimit(5);
//        iphone.call("Hello");

        Person tao = new Person(iphone);
        tao.willCall("Helloasdas");

//        Person tao = new Person();

//        System.out.println("name :"+ android.getName() + ", color :" + android.getColor() + ", brand :" + android.getBrand());






//        System.out.println(new App().getGreeting());
    }
}
