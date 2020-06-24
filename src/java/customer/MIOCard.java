package customer;

public class MIOCard {

	private int ID;
	private Long point;
	private Long usedPoint;

	public Long getPoint() {
		return this.point;
	}

	/**
	 * 
	 * @param point
	 */
	public void setPoint(Long point) {
		this.point = point;
	}

	public Long getUsedPoint() {
		return this.usedPoint;
	}

	/**
	 * 
	 * @param usedPoint
	 */
	public void setUsedPoint(Long usedPoint) {
		this.usedPoint = usedPoint;
	}

	public void display() {
		// TODO - implement MIOCard.display
		throw new UnsupportedOperationException();
	}

}