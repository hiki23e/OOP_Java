package HW_1;

public class Sparrow extends Animal {
    public Sparrow(String name, String color) {
        super(name, color,2);
    }

    public Sparrow(String name) {
        this(name, null);
    }
    @Override
    public void speak() {
        System.out.println("Чик-чирик!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Воробей проснулся");
    }

    private void findFood() {
        System.out.println("Воробей ищет еду");
    }

    private void eat() {
        System.out.println("Воробей ест");
    }

    public void toPlay() {
        System.out.println("Воробей играется");
    }

    public void goToSleep() {
        System.out.println("Воробей уснул");
    }

    @Override
    public void swim() {
        System.out.println("Воробей: Я не умею плвать!");
    }

    @Override
    public void toGo() {
        System.out.println("Воробей: Я плохо бегаю!");
    }
}
