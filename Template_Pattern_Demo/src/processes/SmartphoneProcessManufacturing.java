package processes;

public class SmartphoneProcessManufacturing extends GeneralProcessManufacturing {

	public SmartphoneProcessManufacturing(String processName) {
		super(processName);
	}

	@Override
	protected void assembling() {
		System.out.println("Smartphone assembling...");
	}

	@Override
	protected void testing() {
		System.out.println("Smartphone testing...");
	}

	@Override
	protected void packaging() {
		System.out.println("Smartphone packaging...");
	}

	@Override
	protected void storaging() {
		System.out.println("Smartphone storaging...");
	}

}
