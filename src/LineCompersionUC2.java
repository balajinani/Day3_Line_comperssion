public class LineComperssionUC2 {
    double coOrdinates (int x1, int x2, int y1, int y2) {
        double lengthFormula = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return lengthFormula;
    }
    public static void main(String[] args) {
        LineComperssionUC2 calculation = new LineComperssionUC2();
        Double lengthOne = calculation.coOrdinates(1, 5, 3, 4);
        Double lengthTwo = calculation.coOrdinates(1, 5, 3, 4);
        if (lengthOne.equals(lengthTwo)) {
            System.out.println("LengthOne and LengthTwo are equal");
        }
        else {
            System.out.println("LengthOne and LengthTwo are not equal");

        }
    }
}
