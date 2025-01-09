//Day99/100: LeetCode 2469. Convert the Temperature
public class day99 {
    public static double[] convertTemperature(double celsius) {
        double ans[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32;
        ans[0] = kelvin;
        ans[1] = fahrenheit;
        return ans;
    }
    public static void main(String[] args) {
        double celsius = 36.50;
        double res[] = convertTemperature(celsius);
        System.out.print("[ ");
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println("]");
    }
}