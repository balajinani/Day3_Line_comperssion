public class LineCopersionUC1 {
    double coOrdinates (int x1, int x2, int y1, int y2) {
        double lengthOfLine = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return lengthOfLine;
    }
    public static void main(String[] args) {
        LineCopersionUC1 calculation = new LineCopersionUC1();
        double length = calculation.coOrdinates(1, 5, 3, 4);
        System.out.println("Distance between two point is : " + length);
    }
}
