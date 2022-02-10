package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Child {

	/**
	 * Default constructor
	 */
	public Child() {
	}

	public String parentsWork;
	public String statusCode;
	private User users;
	private Set<Status> status;

	/**
	 * @return
	 */
	public String getParentsWork() {
		return parentsWork;
	}

	/**
	 * @param work
	 * @return
	 */
	public void setParentsWork(String work) {
		this.parentsWork = work;
	}

	/**
	 * @return
	 */
	public Set<Status> getStatus() {
		return status;
	}

	/**
	 * @param code
	 * @return
	 */
	public void setStatus(String code) {
		this.statusCode = code;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parentsWork == null) ? 0 : parentsWork.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Child other = (Child) obj;
		if (parentsWork == null) {
			if (other.parentsWork != null) {
				return false;
			}
		} else if (!parentsWork.equals(other.parentsWork)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (statusCode == null) {
			if (other.statusCode != null) {
				return false;
			}
		} else if (!statusCode.equals(other.statusCode)) {
			return false;
		}
		if (users == null) {
			if (other.users != null) {
				return false;
			}
		} else if (!users.equals(other.users)) {
			return false;
		}
		return true;
	}

}