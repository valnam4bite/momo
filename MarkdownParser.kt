class MarkdownParser {

    fun links(

        note: Note

    ): List<String> {

        val regex =

            "\\[\\[(.*?)]]"

                .toRegex()

        return regex

            .findAll(

                note.markdown

            )

            .map {

                it.groupValues[1]

            }

            .toList()

    }

}
