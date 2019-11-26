package learn.kotlin.functional

class CapitaliseNames {
    fun capitalise(names: List<String?>?): List<String> {
        return names.orEmpty()
                .map(String?::orEmpty)
                .filter(String::isNotEmpty)
                .map(String::toUpperCase)
    }

    fun sortByAlphabet(names: List<String>): List<String> {
        return names.sorted()
    }
}