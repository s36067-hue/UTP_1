// TODO: musimy dodac brakujace klasy!
// OK, ja dodam ‘Adder‘, a s35557 doda ‘Subtractor‘.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(8, 3));
    }
}
