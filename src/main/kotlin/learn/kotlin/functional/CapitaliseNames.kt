package learn.kotlin.functional

class CapitaliseNames {
    fun capitalise(names: List<String>): List<String> {
        return names
                .map { name -> name.toUpperCase() }
    }
}