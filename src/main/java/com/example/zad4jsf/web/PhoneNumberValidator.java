package com.example.zad4jsf.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import javax.faces.validator.Validator;

@FacesValidator("phoneValidator")
public class PhoneNumberValidator implements Validator {

	private String phonePattern = "[(0-9)]{9}";
	
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		String number = value.toString();
		
		if ((number != null && !number.isEmpty() && !number.matches(phonePattern))) {
			FacesMessage message = new FacesMessage();
			message.setDetail("The telephone number must consist of 9 digits, letters not allowed");
			message.setSummary("The telephone number must consist of 9 digits, letters not allowed");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
