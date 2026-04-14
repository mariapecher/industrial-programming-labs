package lecture2;
import java.util.Scanner;

public class Excercise1 {
    public static void isPointInside(double centerX, double centerY, double radius, double pointX, double pointY) {
        double dx = pointX - centerX;
        double dy = pointY - centerY;

        if (dx * dx + dy * dy <= radius * radius)
        {System.out.printf("Точка с координатами (%.1f; %.1f) находится в круге с центром в точке (%.1f; %.1f) и радиусом %.1f",pointX,pointY, centerX, centerY, radius);}
        else {System.out.printf("Точка с координатами (%.1f; %.1f) не находится в круге с центром в точке (%.1f; %.1f) и радиусом %.1f",pointX,pointY, centerX, centerY, radius);}

    }
}
