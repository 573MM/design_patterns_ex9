package Lab9.q4;

public class CoffeePot implements Colleague{
    
    @Override
    public void execute(Mediator alarm) {
        System.out.println("I am coffe pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }

}
