public class LineCompersionUC3 {
    double coOrdinates (int x1, int x2, int y1, int y2) {
        double lengthFormula = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return lengthFormula;
    }
    public static void main(String[] args) {
        LineCompersionUC3 calculation = new LineCompersionUC3();
        Double lengthOne = calculation.coOrdinates(10, 50, 30, 40);
        System.out.println("LengthOne value is " + lengthOne);
        Double lengthTwo = calculation.coOrdinates(10, 70, 20, 40);
        System.out.println("LengthTwo value is " + lengthTwo);
        int compareValue = lengthOne.compareTo(lengthTwo);
        if (compareValue < 0) {
            System.out.println("LengthTwo is greater than LengthOne");
        }
        else if (compareValue > 0) {
            System.out.println("LengthOne is greater than LengthTwo");
        }
        else {
            System.out.println("LengthOne and LengthTwo are equal");
        }
    }
}
