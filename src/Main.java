public class Main {
    public static void main(String[] args) {
        int amoeba = 1;
        int coint = 1;
        while (coint <= 8) {
            amoeba = amoeba*2;
            coint++;
            System.out.println("Кол во амёб каждые три часа: " + amoeba);
        }
    }
}