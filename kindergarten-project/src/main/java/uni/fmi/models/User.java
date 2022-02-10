package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 */
	public User() {
	}

	public String username;
	public String password;
	public String email;
	private Set<Role> roles;
	private Child children;

	/**
	 * @return
	 */
	public String getUsername() {

		return username;
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {

		return password;
	}

	/**
	 * @param password
	 * @return
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public Set<Role> getRoles() {

		return roles;
	}

	/**
	 * @param roles
	 * @return
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Child getChildren() {
		return children;
	}

	public void setChildren(Child children) {
		this.children = children;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (children == null) {
			if (other.children != null) {
				return false;
			}
		} else if (!children.equals(other.children)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

}