package kadai.kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public void changeGear(final int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
		this.speed = switch(afterGear) {
			case 1, 2, 3, 4, 5 -> afterGear * 10;
			default -> 10;
		};
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
