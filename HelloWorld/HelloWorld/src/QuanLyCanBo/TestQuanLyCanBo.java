package QuanLyCanBo;

public class TestQuanLyCanBo {
	public static void main(String[] args) {
		QuanLyCanBo quanlyCanBo = new QuanLyCanBo();
		KySu kysu = new KySu("QueChau", "22/10/1995", "Nam", "QuangNam", "Electronic & Communication");
		quanlyCanBo.canbo.add(kysu);
		quanlyCanBo.hienthiThongtin();
	}
}
