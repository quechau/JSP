package QuanLyCanBo;

public class NhanVien extends CanBo {
	public String CongViec;

	public NhanVien(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		CongViec = congViec;
	}

	public String Info() {
		return "NhanVien [CongViec=" + CongViec + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", GioiTinh=" + GioiTinh
				+ ", DiaChi=" + DiaChi + "]";
	}

}
