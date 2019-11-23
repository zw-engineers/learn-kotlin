package learn.kotlin.functional

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CapitaliseNamesTest() {

    private val capitaliseNames: CapitaliseNames = CapitaliseNames()

    @Test
    @DisplayName("Should return all names capitalised")
    fun capitalisedNames() {
        val names = listOf("artemas", "takudzwa", "muzanenhamo", "shawn", "sarah")

        val capitalisedNames = capitaliseNames.capitalise(names)

        assertThat(capitalisedNames).isNotEmpty
        assertThat(capitalisedNames).hasSize(5)
        assertThat(capitalisedNames).containsExactly("ARTEMAS", "TAKUDZWA", "MUZANENHAMO", "SHAWN", "SARAH")
    }
}