package com.sunbeam;

public enum Category {
FICTION(1), BIOPIC(2) , SELFHELP(3) , MYSTERY(4), ADVENTURE(5);

private int value;

private Category(int value) {
	this.value = value;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}




}
