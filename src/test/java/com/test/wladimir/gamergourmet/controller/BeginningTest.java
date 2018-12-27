
package com.test.wladimir.gamergourmet.controller;

import com.test.wladimir.gamergourmet.model.Plate;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
public class BeginningTest {

    private static final String TEXT_OF_A_QUESTION = "O prato que você pensou é %s?";
    private static String namePlate = "torta";

    @Mock
    private Beginning beginningController;

    @Before
    public void setUp() {
        beginningController = new Beginning(namePlate);
    }

    @Test
    public void testQuestion() {
        String question = String.format(TEXT_OF_A_QUESTION, this.beginningController);
        assertThat(question, notNullValue());

    }

}
