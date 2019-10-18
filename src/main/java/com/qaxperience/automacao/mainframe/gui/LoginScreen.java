package com.qaxperience.automacao.mainframe.gui;

import com.jagacy.util.JagacyException;

public class LoginScreen {
	private Session session;

	public LoginScreen(Session session) throws Exception {
		this.session = session;

		LabelField waitLabel = new LabelField(21, 1, "CLAIM, TSO, or WYLBUR");
		if (!session.waitForText(waitLabel)) {
			throw new Exception("Exception when trying to wait login screen!");
		}
	}

	public void inputLogin(String login) throws JagacyException {
		InputField inputField = new InputField(23, 1, login);
		session.writeToFieldAndPressEnter(inputField);
	}
}
