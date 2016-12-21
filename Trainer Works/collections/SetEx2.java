package com.eci.collections;

import java.util.HashSet;
import java.util.Set;

class Box{
	private int boxId;
	private String boxName;
	
	
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	
	public Box(int boxId, String boxName) {
		super();
		this.boxId = boxId;
		this.boxName = boxName;
	}
	@Override
	public String toString() {
		return "Box [boxId=" + boxId + ", boxName=" + boxName + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boxId;
		result = prime * result + ((boxName == null) ? 0 : boxName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (boxId != other.boxId)
			return false;
		if (boxName == null) {
			if (other.boxName != null)
				return false;
		} else if (!boxName.equals(other.boxName))
			return false;
		return true;
	}
	

	
	
	
	
}


public class SetEx2 {
	public static void main(String[] args) {
		Set<Box> boxes = new HashSet<Box>();
		
		boxes.add(new Box(101, "Laptop"));
		boxes.add(new Box(22, "Pet Bottle"));
		boxes.add(new Box(44, "Remote"));
		boxes.add(new Box(21, "Computer"));
		boxes.add(new Box(21, "Computer"));
		boxes.add(new Box(21, "Computer"));
		
		for(Box temp : boxes){
			System.out.println(temp +", " + temp.hashCode());
		}
		
		
	}
}












