package com.oopexample;

public class CommandEvent {
	private Integer commandId;
	private String response;
	
	public CommandEvent() {
		
	}

	public CommandEvent(int commandId, String response) {
		super();
		this.commandId = commandId;
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	

	public Integer getCommandId() {
		return commandId;
	}

	public void setCommandId(int commandId) {
		this.commandId = commandId;
	}

	@Override
	public int hashCode() {
		return getCommandId().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		CommandEvent other = (CommandEvent) obj;
		if (this == other) {
			return true;
		}

		if (other == null || other.getClass() != other.getClass()) {
			return false;
		}

		return (other.getCommandId().equals(this.getCommandId()));
	}
}
