package com.qaxperience.automacao.mainframe.gui;

import com.jagacy.Key;
import com.jagacy.Session3270;
import com.jagacy.util.JagacyException;

public class Session extends Session3270 {
    private final int TIMEOUT = 10000;

    public Session(String session) throws JagacyException {
        super(session);
    }

    public boolean waitForText(final LabelField label) throws JagacyException {
        return waitForPosition(label.getRow(), label.getColumn(), label.getText(), TIMEOUT);
    }

    public void writeToField(final InputField field) throws JagacyException {
        writePosition(field.getRow(), field.getColumn(), field.getText());
    }

    public void writeToFieldAndPressEnter(final InputField field) throws JagacyException {
        writePosition(field.getRow(), field.getColumn(), field.getText());
        writeKey(Key.ENTER);
        this.waitForChange(TIMEOUT);
    }
}