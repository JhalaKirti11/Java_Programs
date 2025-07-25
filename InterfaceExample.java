public interface Alarm {
	default String alarmTurnOn() {
		return "turn alarm on.";
	}

	default String alarmTurnOff() {
		return "turn off alarm";
	}
}

interface Vehicle{	
	default String alarmTurnOn() {
		return "turn vehicle alarm on";
	}
	default String alarmTurnOff() {
		return "turn vehicle alarm off";
	}
}

public class InterfaceExample implements Vehicles, Alarm {
	public String alarmTurnOn() {
		return Vehicle.super.alarmTurnOn()+" "+ Alarm.super.alarmTurnOn();
	}
}
