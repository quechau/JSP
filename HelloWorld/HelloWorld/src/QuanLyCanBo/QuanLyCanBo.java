package QuanLyCanBo;

import java.util.ArrayList;

public class QuanLyCanBo implements QuanLy {
	ArrayList<CanBo> canbo = new ArrayList<CanBo>();

	@Override
	public void hienthiThongtin() {
		for (CanBo c : canbo) {
			System.out.println(c.toString());
		}

	}

}
