package com.qaxperience.automacao.mainframe;

import static org.junit.Assert.assertTrue;

import com.jagacy.util.JagacyException;
import com.qaxperience.automacao.mainframe.gui.LabelField;
import com.qaxperience.automacao.mainframe.gui.LoginScreen;
import com.qaxperience.automacao.mainframe.gui.Session;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
    private Session session;
    private LoginScreen loginScreen;

    @Dado("Que eu começo uma nova sessão")
    public void i_start_a_new_emulator_session() throws Throwable {

        session = new Session("test");
        session.open();

    }

    @Quando("Faço login")
    public void i_open_phonbook_application() throws Throwable {

        loginScreen = new LoginScreen(session);
        loginScreen.inputLogin("PHONBOOK");
    }

    @Então("Eu devo estar logado")
    public void i_should_see_the_results_matching_with_my_search_criteria() throws Throwable {
        LabelField waitLabel = new LabelField(14, 3, "the campus code for the desired campus");
        assertTrue(session.waitForText(waitLabel));
    }

    @After
    public void tearDown() throws JagacyException {
        session.close();
    }
}