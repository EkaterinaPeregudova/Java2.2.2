public class BmiService {
    public float calculate(float weight, int growth) {
        float bmi = weight / (growth * growth) * 10000;
        return bmi;
    }

}
