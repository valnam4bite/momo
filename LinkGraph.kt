class LinkGraph {

    fun graph(

        notes: List<Note>

    ): Map<String,List<String>> {

        val parser =

            MarkdownParser()

        return notes.associate {

            it.title to

            parser.links(it)

        }

    }

}
