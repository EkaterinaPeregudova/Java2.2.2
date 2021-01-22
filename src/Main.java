public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(64, 162);

        System.out.print(bmi);
    }
}
