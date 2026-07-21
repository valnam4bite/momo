class SearchEngine {

    fun search(

        notes: List<Note>,

        keyword: String

    ): List<Note> {

        return notes.filter {

            it.title.contains(

                keyword,

                true

            ) ||

            it.markdown.contains(

                keyword,

                true

            )

        }

    }

}
