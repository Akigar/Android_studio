data class Message(val address: String?, val topic: String?, val message: String?, val content: String?) {
    //fun toHTML(): String = "$address ${topic}"
}

fun main() {
    fun Message.toHTML(): String {
        val style = "<head>\n" +
                "\t<style>\n" +
                "\t\tbody { \n" +
                "\t\t\tbackground: rgb(80, 80, 80);\n" +
                "font-size: 14px;\n" +
                "\t\t\tfont-family: 'Arial' ;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "\n<body>\n"
        var template = style + "<table> " +
                (address?.let { "\n\t<tr>\n\t\t<td>address</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (topic?.let { "\n\t<tr>\n\t\t<td>topic</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (message?.let { "\n\t<tr>\n\t\t<td>message</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (content?.let { "\n\t<tr>\n\t\t<td>content</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                "\n</table>" + "\n</body>"
        return template
    }

    val m = Message("nikita.gordeew2015@yandex.com", null, null, null)
    val m1 = Message("nikita.gordeew2015@yandex.com", null, "nikita.gordeew2015@yandex.com", "Hello")
    val m2 = Message("nikita.gordeew2015@yandex.com", "sometopic", "nikita.gordeew2015@yandex.com", "Hello")
    println(m.toHTML())
    println(m1.toHTML())
    println(m2.toHTML())
}
