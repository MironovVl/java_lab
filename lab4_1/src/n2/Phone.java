package n2;

public class Phone {
    private long number;
    private String model;
    private double weight;

    Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(long number, String model) {
        this.number = number;
        this.model = model;
        weight = 0;
    }

    public Phone() {
        number = 0;
        model = "default";
        weight = 0;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String nameCall) {
        System.out.println("Звонит " + nameCall);
    }

    public void receiveCall(String nameCall, long numberCall) {
        System.out.println("Звонит " + nameCall + " - " + numberCall);
    }

    public void sendMessage(int[] list) {
        for (int l : list) {
            System.out.println("Отправить сообщение на номер " + l);
        }
    }

    public long getNumber() {
        return number;
    }
}
