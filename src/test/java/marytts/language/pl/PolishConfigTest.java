/**
 * Copyright 2017 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 * <p>
 * This file is part of MARY TTS.
 * <p>
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package marytts.language.pl;

import marytts.config.LanguageConfig;
import marytts.config.MaryConfig;
import marytts.exceptions.MaryConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

/**
 * @author ingmar
 */
public class PolishConfigTest {

    static Locale POLISH = Locale.forLanguageTag("pl");

    @Test
    public void isNotMainConfig() throws MaryConfigurationException {
        MaryConfig m = new PolishConfig();
        Assert.assertFalse(m.isMainConfig());
    }

    @Test
    public void canGet() {
        MaryConfig m = MaryConfig.getLanguageConfig(POLISH);
        Assert.assertNotNull(m);
        Assert.assertTrue(((LanguageConfig) m).getLocales().contains(POLISH));
    }

    @Test
    public void hasPolishLocale() throws MaryConfigurationException {
        LanguageConfig e = new PolishConfig();
        Assert.assertTrue(e.getLocales().contains(POLISH));
    }
}
