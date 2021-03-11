package com.uwaisalqadri.inknote.utils

import com.uwaisalqadri.inknote.data.model.Note

object DummyData {

    fun noteDummy(): ArrayList<Note> {

        val notes = arrayListOf<Note>()

        notes.add(
            Note(
                0,
                "title",
                "desc",
                "2020-40-30",
                true,
                "nd21p'nsp"
            )
        )

        notes.add(
            Note(
                1,
                "title",
                "sdbwuduwefliwgfliuwdilywvdiwbveifvqeifguewhdouw",
                "2020-40-30",
                true,
                "nd21p'nsp"
            )
        )

        notes.add(
            Note(
                3,
                "title",
                "sdb;hw2dip2bduobwbduowbdiqhodqosjqpsnqiuvsdqbsuqhpisj'/qodhowhdp9wnbdclw dywc;niw",
                "2020-40-30",
                true,
                "nd21p'nsp"
            )
        )

        return notes
    }
}