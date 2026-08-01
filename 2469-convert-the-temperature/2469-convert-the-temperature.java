class Solution {
    public double[] convertTemperature(double celsius) {
        double val[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        val[0] = kelvin;
        val[1] = fahrenheit;
        return val;
    }
}