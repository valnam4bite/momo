fun main() {

    println(

        "Loading notes...\n"

    )

    val repository =

        NoteRepository()

    val notes =

        repository.load()

    Statistics().print(

        notes

    )

    val results =

        SearchEngine()

            .search(

                notes,

                "kotlin"

            )

    println(

        "Search: kotlin\n"

    )

    val tags =

        TagIndex()

            .build(notes)

    val graph =

        LinkGraph()

            .graph(notes)

    Renderer()

        .render(

            results,

            tags,

            graph

        )

}
