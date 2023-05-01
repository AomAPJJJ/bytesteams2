package bytesteams2;

public class LAB1 {
    public static void main(String[] args) {
        Circle c = new Circle();
            RedShapeDecorator redCircle = new RedShapeDecorator(c);
            RedShapeDecorator redRectangle = new RedShapeDecorator(c);
            redCircle.draw();
            redRectangle.draw();

    }
}
