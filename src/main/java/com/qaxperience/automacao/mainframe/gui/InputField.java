package com.qaxperience.automacao.mainframe.gui;

public class InputField {
	private int row;
	private int column;
	private String text;

	public InputField(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public InputField(int row, int column, String text) {
		this.row = row;
		this.column = column;
		this.text = text;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public String getText() {
		return text;
	}
}
