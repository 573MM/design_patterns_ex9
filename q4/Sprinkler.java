package Lab9.q4;

public class Sprinkler implements Colleague{
    @Override
    public void execute(Mediator alarm) {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }
}
