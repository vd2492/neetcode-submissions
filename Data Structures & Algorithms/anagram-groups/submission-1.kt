class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {
            val key = word.toCharArray().sorted().joinToString("")

            if (key !in groups) {
                groups[key] = mutableListOf()
            }

            groups[key]!!.add(word)
        }

        return groups.values.toList()
    }
}