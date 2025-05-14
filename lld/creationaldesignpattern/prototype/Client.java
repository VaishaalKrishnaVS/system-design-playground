package lld.creationaldesignpattern.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        var swordsman = new Swordsman();
		swordsman.move(new Point3D(3,3,3), 23f);
		swordsman.attack();

		System.out.println(swordsman.toString());

		var newSwordsman = (Swordsman) swordsman.clone();
		System.out.println(newSwordsman.toString());
	}

}
