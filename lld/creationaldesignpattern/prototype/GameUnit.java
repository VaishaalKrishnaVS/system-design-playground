package lld.creationaldesignpattern.prototype;


/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;

	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		var gameUnit =(GameUnit) super.clone();
		initialise(gameUnit);
		return gameUnit;
	}

	private void initialise(GameUnit gameUnit){
		gameUnit.position = Point3D.ZERO;
		reset();
	}
	protected abstract void reset();

	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
}
