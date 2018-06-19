package com.oopexample.command.impl;

import com.oopexample.CommandEvent;
import com.oopexample.DressWizard;
import com.oopexample.Temperature;
import com.oopexample.command.CommandI;
import com.oopexample.validator.Validator;

public class PutOnShirt extends Command implements CommandI {

	public PutOnShirt(int id, String name, Validator validator) {
		super(id, name, validator);
	}

	@Override
	public CommandEvent action(Temperature temperature) {
		if ( checkPrecondition(temperature, this)) {
			return new CommandEvent(this.getId(), "shirt");
		} else {
			return new CommandEvent(DressWizard.FAIL_COMM, "fail");
		}	
		
	}

}
