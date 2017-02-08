package cc.mini.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by wxc on 2017/2/6.
 * 文件表
 */

@Entity
@Table(name = "filestatus")
public class Filestatus {
	private int id;
	private String name;
	private int isDir;
	private String path;
	private String md5;
	private int fatherid;
	private Date createTime;
	private Date lastchangeTime;
	private int fileid;
	private Set<Filestatus> nextFile;
	private User user;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsDir() {
		return isDir;
	}

	public void setIsDir(int isDir) {
		this.isDir = isDir;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public int getFatherid() {
		return fatherid;
	}

	public void setFatherid(int fatherid) {
		this.fatherid = fatherid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastchangeTime() {
		return lastchangeTime;
	}

	public void setLastchangeTime(Date lastchangeTime) {
		this.lastchangeTime = lastchangeTime;
	}

	public int getFileid() {
		return fileid;
	}

	public void setFileid(int fileid) {
		this.fileid = fileid;
	}

	@OneToMany(targetEntity = Filestatus.class,mappedBy = "nextFile",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fatherId")
	@OrderBy("id")
	public Set<Filestatus> getNextFile() {
		return nextFile;
	}

	public void setNextFile(Set<Filestatus> nextFile) {
		this.nextFile = nextFile;
	}

	@ManyToOne(targetEntity = User.class)
	@JoinTable(name = "user_files",
		joinColumns = @JoinColumn(name = "fileId",referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "userId",referencedColumnName = "id")
	)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
