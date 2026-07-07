public class receiptsIguess {
    public static void main(String[] args) {
        // calculate total owed, assuming 8% tax / 15% tip

        int equ = (38 + 40 + 30);
System.out.println("Subtotal: " + equ);

System.out.println("Tax: " + equ * 0.8);

System.out.println("Tip: " + equ * .15);

System.out.println("Total: " + (equ + (equ * 1.5) + (equ * 0.8)));
    }
}
