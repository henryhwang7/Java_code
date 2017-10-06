package java_practice;

class Robot{}
class DanceRobot extends Robot {
	DanceRobot() {
		System.out.println("Generateing DanceRobot");
	}
	void dance() {
		System.out.println("Robot is dancing");
	}
}
class SingRobot extends Robot {
	SingRobot() {
		System.out.println("Generating SingRobot");
	}
	void sing() {
		System.out.println("Robot is singing");
	}
}
class DrawRobot extends Robot {
	DrawRobot() {
		System.out.println("Generating DrawRobot");
	}
	void draw() {
		System.out.println("Robot is drawing");
	}
}

public class RobotTest {
	static void action(Robot r) {
		if (r instanceof DanceRobot)
			((DanceRobot)r).dance();
		else if (r instanceof SingRobot)
			((SingRobot)r).sing();
		else if (r instanceof DrawRobot)
			((DrawRobot)r).draw();
		else
			System.out.println("Robot is stopped.");
	}
	public static void main(String arg[]) {
		Robot r = new Robot();
		r = new DanceRobot();
		RobotTest.action(r);
		r = new SingRobot();
		action(r);
		r = new DrawRobot();
		action(r);
		r = new Robot();
		action(r);
	}
}
