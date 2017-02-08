package cc.mini.entity;

import javax.persistence.*;

/**
 * Created by wxc
 * on 2017/2/7.
 * 记录该用户的好友关系，该用户对应的好友(用户和好友作为联合主键）
 */
@Entity
@Table(name = "friends")
public class Friends {

	private int id;
	private User user;
	private User friend;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//定义关联的User实体，列名为userId,参照User类中的id，定义为一个主键
	@OneToOne(targetEntity = User.class)
	@JoinColumn(name = "userId",referencedColumnName = "id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//定义关联的User实体，列名为friendId，参照User类中的id，定义为一个主键
	@OneToOne(targetEntity = User.class)
	@JoinColumn(name = "friendId",referencedColumnName = "id")
	public User getFriend() {
		return friend;
	}

	public void setFriend(User friend) {
		this.friend = friend;
	}

	@Override
	public int hashCode(){
		return (this.user == null?0:this.user.hashCode ())*31*31+(this.friend == null?0:this.friend.hashCode ())*31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj != null && obj.getClass () == Friends.class){
			Friends target = (Friends)obj;
			return this.user.equals (target.getUser ())&&this.friend.equals (target.getFriend ());
		}
		return true;
	}
}
