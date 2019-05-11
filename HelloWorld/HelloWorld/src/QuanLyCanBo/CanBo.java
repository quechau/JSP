package QuanLyCanBo;

public abstract class CanBo {
	public String HoTen;
	public String NamSinh;
	public String GioiTinh;
	public String DiaChi;

	public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
		super();
		HoTen = hoTen;
		NamSinh = namSinh;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
	}

	public abstract String Info();

}
