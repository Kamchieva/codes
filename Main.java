//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//   Computer comp = new Computer();
//   comp.i7.start();
//   comp.transfer.start();
//   comp.transfer.shutdown();
//    }
        new Computer() {
            void superComp (){
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}