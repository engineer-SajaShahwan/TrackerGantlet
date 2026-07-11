/*
 * ContainerParser.kt

 * JVM Stack Explanation:
 * Each recursive call creates a new stack frame containing the current
 * function parameters and local variables.
 * When the recursive call finishes, its stack frame is removed (popped)
 * and execution returns to the previous frame.
 *
 * Example:
 *
 * parse("Crate[Box[PKG-101]]")
 *
 * Stack frames:
 * Frame 1 -> parse Crate
 * Frame 2 -> parse Box
 * Frame 3 -> parse PKG-101
 *
 * After returning:
 * Frame 3 removed
 * Frame 2 continues
 * Frame 2 removed
 * Frame 1 returns final result.
 */
class ContainerParseException(message: String) : Exception(message)


fun parseContainer(input: String): List<String> {
    val result = recursiveParse(input.trim(), 0)

    return result.first
}
private fun recursiveParse(
    text: String,
    index: Int
): Pair<List<String>, Int> {

    if (index >= text.length) {
        return Pair(emptyList(), index)
    }

    val currentChar = text[index]

    if (currentChar.isWhitespace()) {
        return recursiveParse(text, index + 1)
    }
    if (currentChar == ']') {
        return Pair(emptyList(), index + 1)
    }

    if (currentChar == '[') {
        val inside = recursiveParse(text, index + 1)

        return Pair(
            inside.first,
            inside.second
        )
    }

    if (text.startsWith("PKG-", index)) {
        val end = text.indexOfAny(charArrayOf(',', ']', ' '), index)

        val actualEnd = if (end == -1) text.length else end
        val packageId = text.substring(index, actualEnd)

        val remaining = recursiveParse(text, actualEnd + 1)

        return Pair(
            listOf(packageId) + remaining.first,
            remaining.second
        )
    }

    return recursiveParse(text, index + 1)
}
fun main() {
    val result = parseContainer("Crate[Box[PKG-101],PKG-102]")
    val result1= parseContainer(input="Crate[Box[PKG-102],80")

    println(result)
    println(result1)
}