package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Status {

	/**
	 * Default constructor
	 */
	public Status() {
	}

	public String twins;
	public String disabledPerson;
	public String brotherSister;
	private Set<Child> children;

	/**
	 * @return
	 */
	public String getTwins() {

		return twins;
	}

	/**
	 * @param twins
	 * @return
	 */
	public void setTwins(String twins) {
		this.twins = twins;
	}

	/**
	 * @return
	 */
	public String getDisabledPerson() {
		return disabledPerson;
	}

	/**
	 * @param disabled
	 * @return
	 */
	public void setDisabledPerson(String disabled) {
		this.disabledPerson = disabled;
	}

	/**
	 * @return
	 */
	public String getBrotherSister() {
		return brotherSister;
	}

	/**
	 * @param brothSis
	 * @return
	 */
	public void setBrotherSister(String brothSis) {
		this.brotherSister = brothSis;
	}

	public Set<Child> getChildren() {
		return children;
	}

	public void setChildren(Set<Child> children) {
		this.children = children;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brotherSister == null) ? 0 : brotherSister.hashCode());
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((disabledPerson == null) ? 0 : disabledPerson.hashCode());
		result = prime * result + ((twins == null) ? 0 : twins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Status other = (Status) obj;
		if (brotherSister == null) {
			if (other.brotherSister != null) {
				return false;
			}
		} else if (!brotherSister.equals(other.brotherSister)) {
			return false;
		}
		if (children == null) {
			if (other.children != null) {
				return false;
			}
		} else if (!children.equals(other.children)) {
			return false;
		}
		if (disabledPerson == null) {
			if (other.disabledPerson != null) {
				return false;
			}
		} else if (!disabledPerson.equals(other.disabledPerson)) {
			return false;
		}
		if (twins == null) {
			if (other.twins != null) {
				return false;
			}
		} else if (!twins.equals(other.twins)) {
			return false;
		}
		return true;
	}

}