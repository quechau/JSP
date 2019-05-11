package QuanLyCanBo;

public class KySu extends CanBo {
	public String NganhDaoTao;

	public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		NganhDaoTao = nganhDaoTao;
	}

	@Override
	public String Info() {
		return "KySu [NganhDaoTao=" + NganhDaoTao + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", GioiTinh="
				+ GioiTinh + ", DiaChi=" + DiaChi + "]";
	}

}
