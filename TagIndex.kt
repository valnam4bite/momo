class TagIndex {

    fun build(

        notes: List<Note>

    ): Set<String> {

        return notes

            .flatMap {

                it.tags

            }

            .toSet()

    }

}
