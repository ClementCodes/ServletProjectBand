package model;

public class Instructions {
	private String instructions;

	public Instructions(String instructions) {
		this.instructions = instructions;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "Instructions [instructions=" + instructions + "]";
	}

}
