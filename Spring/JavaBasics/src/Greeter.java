public class Greeter {

    public void printGreeting(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting =  new HelloWorldGreeting();
        greeter.printGreeting(helloWorldGreeting);

        Greeting greeting = () -> System.out.println("Hello World from lambda");
        greeting.perform();

        //Anonymous inner class
        Greeting innerClassGreeting = new Greeting(){
            @Override
            public void perform() {
                System.out.println("Hello World from inner class");
            }
        };
        innerClassGreeting.perform();

        greeter.printGreeting(greeting);
        greeter.printGreeting(innerClassGreeting);


    }
}
