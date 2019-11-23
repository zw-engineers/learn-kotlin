package learn.kotlin.functional

class CapitaliseNames {
    fun capitalise(names: List<String>?): List<String>? {
        return names
                .orEmpty()
                .map(String::toUpperCase)
    }
}