package gaps;

public class Pojo {
	private String name;
	private String pw;
	@Override
	public String toString() {
		return "Pojo [name=" + name + ", pw=" + pw + "]";
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
