package uni.fmi.login.model;

import uni.fmi.login.service.LoginService;

public class LoginScreenModel {

	private int points;
	private String message;

	public void isWorkingParents(boolean isWorkingParents) {
		if (isWorkingParents)
			points++;

	}

	public void isDisabledChild(boolean isDisabledChild) {
		if (isDisabledChild)
			points++;
	}

	public void isTwinChild(boolean isTwinChild) {
		if (isTwinChild) points++;
	}

	public void isSiblingsInTheSame(boolean isSiblingsInTheSame) {
		if (isSiblingsInTheSame) points++;
	}

	public Object getMessage() {
		return message;
	}

	public void isHaveSamePoints(boolean isHaveSamePoints) {
		if (isHaveSamePoints);
		
	}

	public void isWorkingParentsFalse(boolean isWorkingParentsFalse) {
		if (isWorkingParentsFalse)
			points--;
	}

	public void isDisabledChildFalse(boolean isDisabledChildFalse) {
		if (isDisabledChildFalse)
			points--;
	}

	public void isTwinsFalse(boolean isTwinsFalse) {
		if (isTwinsFalse) points--;
	}

	public void isSiblingsFalse(boolean isSiblingsFalse) {
		if (isSiblingsFalse) points--;	
	}

}
