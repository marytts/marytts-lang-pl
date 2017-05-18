package marytts.language.pl

import marytts.LocalMaryInterface
import marytts.util.dom.DomUtils
import org.testng.annotations.*

class PolishPhonemiserIT {

    @Test
    void canProcessTextToPhonemes() {
        def mary = new LocalMaryInterface()
        mary.locale = Locale.forLanguageTag('pl')
        mary.outputType = 'PHONEMES'
        def output = mary.generateXML('najwspanialszym')
        assert output.documentElement
    }
}
