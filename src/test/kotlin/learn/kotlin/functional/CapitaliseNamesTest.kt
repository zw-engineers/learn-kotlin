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

    @Test
    @DisplayName("Should return an empty list if names list is null")
    fun emptyNamesList() {
        val capitalisedNames = capitaliseNames.capitalise(null)

        assertThat(capitalisedNames).isEmpty()
    }

    @Test
    @DisplayName("Should return all non null names in uppercase")
    fun returnNonNullNames() {
        val names = listOf("artemas", "takudzwa", null, "shawn", "sarah")

        val capitalisedNames = capitaliseNames.capitalise(names)

        assertThat(capitalisedNames).isNotEmpty
        assertThat(capitalisedNames).hasSize(4)
        assertThat(capitalisedNames).containsExactly("ARTEMAS", "TAKUDZWA", "SHAWN", "SARAH")
    }

    @Test
    @DisplayName("Should return all capitalised names sorted")
    fun returnCapitalisedNamesSorted() {
        val names = listOf("artemas", "takudzwa", "muzanenhamo", "shawn", "sarah")
        val capitalisedNames = capitaliseNames.capitalise(names)

        val sortedNames = capitaliseNames.sortByAlphabet(capitalisedNames)

        assertThat(sortedNames).isNotEmpty
        assertThat(sortedNames).hasSize(5)
        assertThat(sortedNames).containsExactly("ARTEMAS", "MUZANENHAMO", "SARAH", "SHAWN", "TAKUDZWA")
    }
}