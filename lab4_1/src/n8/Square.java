package n8;

public class Square extends n8.Rectangle {
    Square() {

    }

    Square(double size) {
        length = size;
        width = size;
    }

    Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    @Override
    public String toString() {
        return"Square{" +
                "size=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }
}
