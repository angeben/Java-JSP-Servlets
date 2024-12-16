package entity;
import javax.persistence.*;

@Entity(name="users")
@Table(name="users")
public class Users {
	
	@Id 
	@Column(name="user_id")
	int userId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="username")
	String username;
	
	public Users() {
		super();
	}

	@Column(name="email")
	String email;

	public int getUserId() {
		return userId;
	}

	public Users(String firstName, String lastName, String username, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
