package processes;

public class LaptopProcessManufacturing extends GeneralProcessManufacturing {

	public LaptopProcessManufacturing(String processName) {
		super(processName);
	}

	@Override
	protected void assembling() {
		System.out.println("Laptop assembling...");
	}

	@Override
	protected void testing() {
		System.out.println("Laptop testing...");
	}

	@Override
	protected void packaging() {
		System.out.println("Laptop packaging...");
	}

	@Override
	protected void storaging() {
		System.out.println("Laptop storaging...");
	}


}
