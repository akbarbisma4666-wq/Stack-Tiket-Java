public class TiketBioskop {

    // Deklarasi Stack
    static String[] stack = new String[10];
    static int top = -1;

    // Method push()
    static void push(String tiket) {

        // Cek stack penuh
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
            return;
        }

        top++;
        stack[top] = tiket;
    }

    // Method pop()
    static String pop() {

        // Cek stack kosong
        if (isEmpty()) {
            return "Stack kosong!";
        }

        String data = stack[top];
        top--;

        return data;
    }

    // Method peek()
    static String peek() {

        // Cek stack kosong
        if (isEmpty()) {
            return "Stack kosong";
        }

        return stack[top];
    }

    // Method cek kosong
    static boolean isEmpty() {
        return top == -1;
    }

    // Menampilkan isi stack
    static void tampilkanStack() {

        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");

        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }

        System.out.println("=================================");
    }

    // BONUS: Hitung total transaksi
    static void hitungTotal() {

        int total = 0;

        for (int i = 0; i <= top; i++) {

            if (stack[i].contains("50.000")) {
                total += 50000;
            } else if (stack[i].contains("45.000")) {
                total += 45000;
            }
        }

        System.out.println("Total transaksi: Rp" + total);
    }

    // Main Program
    public static void main(String[] args) {

        // Push data tiket
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // Total transaksi
        hitungTotal();

        // Tampilkan isi stack
        tampilkanStack();

        // Tampilkan tiket paling atas
        System.out.println("Tiket terakhir masuk: " + peek());

        // Pop tiket teratas
        System.out.println("Tiket dibatalkan: " + pop());

        // Tampilkan stack setelah pop
        tampilkanStack();
    }
}
