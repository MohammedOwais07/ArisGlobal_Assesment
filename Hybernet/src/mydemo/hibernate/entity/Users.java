package mydemo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "users")
public class Users {
	
	
	@Id
	@Column(name = "users_id")
	int usersId;

	@Column(name = "username")
	String username;
	
	@Column(name = "email")
	String email;


	public Users(int usersId, String username, String email) {
		this.usersId = usersId;
		this.username = username;
		this.email = email;
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
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
