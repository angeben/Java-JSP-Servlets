package entity;

public class User {
	
	private int userid;
	private String first_name;
	private String last_name;
	private String username;
	private String email;
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public User(int userid, String first_name, String last_name, String username, String email) {
		super();
		this.userid = userid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.email = email;
	}

	public User(String first_name, String last_name, String username, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
				+ username + ", email=" + email + "]";
	}
}
