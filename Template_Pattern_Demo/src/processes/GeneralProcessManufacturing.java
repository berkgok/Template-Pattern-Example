package processes;

public abstract class GeneralProcessManufacturing {
	
	private String processName;

	public GeneralProcessManufacturing(String processName) {
		this.setProcessName(processName);
	}

	protected abstract void assembling();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storaging();
	
	/* Template method */
	public void process() {
		if (processName != null || processName != "") {
			assembling();
			testing();
			packaging();
			storaging();
		}
	}
	
	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}
}
