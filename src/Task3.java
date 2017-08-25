public class Task3 {
    public static void main(String[] args) {
        CheckInput input = new CheckInput();
        boolean isCrossing = true;
        System.out.print("Please enter the X coordinate of the first point of the first segment : ");
        float x11 = input.GetFloat();
        System.out.print("Please enter the Y coordinate of the first point of the first segment : ");
        float y11 = input.GetFloat();
        System.out.print("Please enter the X coordinate of the second point of the first segment : ");
        float x12 = input.GetFloat();
        System.out.print("Please enter the Y coordinate of the second point of the first segment : ");
        float y12 = input.GetFloat();
        System.out.print("Please enter the X coordinate of the first point of the second segment : ");
        float x21 = input.GetFloat();
        System.out.print("Please enter the Y coordinate of the first point of the second segment : ");
        float y21 = input.GetFloat();
        System.out.print("Please enter the X coordinate of the second point of the second segment : ");
        float x22 = input.GetFloat();
        System.out.print("Please enter the Y coordinate of the second point of the second segment : ");
        float y22 = input.GetFloat();
        float a1 = 0, a2 = 0, b1 = 0, b2 = 0, d = 0, c1 = 0, c2 = 0, xCross = 0, yCross = 0;
        a1 = y11 - y12;	b1 = x12 - x11;
        a2 = y21 - y22;	b2 = x22 - x21;
        d = a1 * b2 - a2 * b1;
        if ( d != 0 ) {	c1 = y12 * x11 - x12 * y11; 
        c2 = y22 * x21 - x22 * y21;
        xCross = (b1 * c2 - b2 * c1) / d;
        yCross = (a2 * c1 - a1 * c2) / d;
        if (((x11<=xCross)&&(x12>=xCross)&&(x21<=xCross)&&(x22 >=xCross))||((y11<=yCross)&&(y12>=yCross)&&(y21<=yCross) &&(y22>=yCross))) {isCrossing = true;}
        else {isCrossing = false;}
         }	
        else {isCrossing = false;}
        if (isCrossing) {System.out.println("The segments intersect in point (" + xCross + "," + yCross + ")");}
        else {System.out.println("Segments do not intersect");}
    }
}