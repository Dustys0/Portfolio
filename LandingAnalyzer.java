import java.util.*;

public class LandingAnalyzer {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter landing speed (kts): ");
int speed = sc.nextInt();

System.out.print("Enter vertical speed (ft/min): ");
int vs = sc.nextInt();

System.out.print("Enter nose angle (degrees): ");
double angle = sc.nextDouble();

String result;

if (vs >= -300 && speed >= 110 && speed <= 140 && angle >= 3 && angle <= 6) {
result = "Smooth Landing";
}

else if (vs >= -600 && speed >= 100 && speed <= 150) {
result = "Firm Landing";
}

else if (vs >= -1000) {
result = "Rough Landing";
}

else {
result = "Very Rough / Dangerous Landing";
}

System.out.println("\nResult: " + result);
System.out.println("Analysis:");

boolean issue = false;

if (vs < -600) {
System.out.println("- High vertical speed (hard descent)");
issue = true;
}

else if (vs < -300) {
System.out.println("- Slightly high descent rate");
issue = true;
}

if (speed > 140) {
System.out.println("- Too much speed");
issue = true;
}

else if (speed < 110) {
System.out.println("- Too slow (risk of stall)");
issue = true;
}

if (angle < 3) {
System.out.println("- Low nose angle (insufficient flare)");
issue = true;
}

else if (angle > 6) {
System.out.println("- High nose angle (over flare)");
issue = true;
}
}
}

