class Renderer {

    fun render(

        results: List<Note>,

        tags: Set<String>,

        graph: Map<String,List<String>>

    ) {

        println("Results\n")

        results.forEach {

            println("- ${it.title}")

        }

        println()

        println("Tags\n")

        tags.forEach {

            println("#$it")

        }

        println()

        println("Connections\n")

        graph.forEach {

            println(it.key)

            it.value.forEach { link ->

                println(" └── $link")

            }

        }

    }

}
