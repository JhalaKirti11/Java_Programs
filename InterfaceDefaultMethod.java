interface Alarm {
	default String alarmTurnOn() {
		return "turn alarm on.";
	}

	default String alarmTurnOff() {
		return "turn off alarm";
	}
}

interface Vehicle {
	default String alarmTurnOn() {
		return "turn vehicle alarm on";
	}

	default String alarmTurnOff() {
		return "turn vehicle alarm off";
	}
}

class car implements Vehicle, Alarm {
	public String alarmTurnOn() {
		return Vehicle.super.alarmTurnOn() + " && " + Alarm.super.alarmTurnOn();
	}

	public String alarmTurnOff() {
		return Vehicle.super.alarmTurnOff() + " && " + Alarm.super.alarmTurnOff();
	}
}

public class InterfaceDefaultMethod {
	public static void main(String[] arg) {
		car ob = new car();
		String on = ob.alarmTurnOn();
		String off = ob.alarmTurnOff();
		System.out.println(on);
		System.out.println(off);
	}
}
