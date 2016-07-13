public class Demo {

	public static void main(String[] args) {
		try {
			ModifyOffset instance = ModifyOffset.getInstance(ModifyOffset.class
					.getResourceAsStream("axisoffset.dat"));
			PointDouble s2c = instance.s2c(new PointDouble(116.29049474,
					40.04302021));// 标准坐标转化为火星坐标

			System.out.println(s2c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
