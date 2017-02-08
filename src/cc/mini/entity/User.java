package cc.mini.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxc on 2017/2/6.
 * 用户表
 */
@Entity
@Table(name = "user")
public class User {

	private int id;
	private String email;
	private String userName;
	private String realName;
	private String password;
	private int friendId;
	private Set<Filestatus> filestatus = new HashSet<> ();

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	@OneToMany(targetEntity = Filestatus.class,cascade = CascadeType.ALL)
	@JoinTable(name = "user_files",
				joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "filesId",referencedColumnName = "id")
	)
	public Set<Filestatus> getFilestatus() {
		return filestatus;
	}

	public void setFilestatus(Set<Filestatus> filestatus) {
		this.filestatus = filestatus;
	}
}
