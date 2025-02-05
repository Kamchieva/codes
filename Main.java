//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
        for(int i = 0; i < arr.length; i++)
        arr[i].draw();
    }

}
