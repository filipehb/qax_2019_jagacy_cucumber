package com.qaxperience.automacao.mainframe.gui;

import com.jagacy.util.JagacyException;

public class Menu {
    private Session session;

	public Menu(Session session) throws Exception {
		this.session = session;

		LabelField waitLabel = new LabelField(14, 3, "the campus code for the desired campus");
		if (!session.waitForText(waitLabel)) {
			throw new Exception("Exception when trying to wait menu screen!");
		}
	}

	public void inputActionCode(String actionCode) throws JagacyException {
		InputField inputField = new InputField(34, 1, actionCode);
		session.writeToFieldAndPressEnter(inputField);
    }
}
