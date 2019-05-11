package QuanLyCanBo;

public class CongNhan extends CanBo {
	public int Rank;

	public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, int rank) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		Rank = rank;
	}

	@Override
	public String Info() {
		return "CongNhan [Rank=" + Rank + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", GioiTinh=" + GioiTinh
				+ ", DiaChi=" + DiaChi + "]";
	}

}
