public class TriangleClassifier{

    public static final String EQUILATERAL_TRIANGLE = "Equilateral Triangle";
    public static final String ISOSCELES_TRIANGLE = "Isosceles Triangle";
    public static final String NOT_TRIANGLE = "Not Triangle";
    public static final String NORMAL_TRIANGLE = "Normal Triangle";

    public static String checkTriangle(int firstSide, int secondSide, int thirdSide){
        boolean isFirstSideEqualSecondSide = firstSide == secondSide;
        boolean isSecondSideEqualThirdSide = secondSide == thirdSide;
        boolean isFirstSideEqualThirdSide = firstSide == thirdSide;
        boolean isEquilateralTriangle = isFirstSideEqualSecondSide && isFirstSideEqualThirdSide;
        boolean isSumTwoSideEqualThirdSide = firstSide + secondSide < thirdSide;
        boolean isSumTwoSideEqualSecondSide = firstSide + thirdSide < secondSide;
        boolean isSumTwoSideEqualFirstSide = secondSide + thirdSide < firstSide;
        if (firstSide <=0 || secondSide <=0 || thirdSide <=0){
            return NOT_TRIANGLE;
        }
        if (isSumTwoSideEqualThirdSide || isSumTwoSideEqualSecondSide || isSumTwoSideEqualFirstSide){
            return NOT_TRIANGLE;
        }
        if (isEquilateralTriangle) {
            return EQUILATERAL_TRIANGLE;
        }
        if (isFirstSideEqualSecondSide || isSecondSideEqualThirdSide || isFirstSideEqualThirdSide) {
            return ISOSCELES_TRIANGLE;
        }
        return NORMAL_TRIANGLE;
    }
}
