package com.example.kotlinclass

class DataSet {
    fun loadData() : List<MessageText> {
        return listOf(
            MessageText(R.string.affirmation1, R.drawable.image1),
            MessageText(R.string.affirmation2, R.drawable.image2),
            MessageText(R.string.affirmation3, R.drawable.image3),
            MessageText(R.string.affirmation4, R.drawable.image4),
            MessageText(R.string.affirmation5, R.drawable.image5),
            MessageText(R.string.affirmation6, R.drawable.image6),
            MessageText(R.string.affirmation7, R.drawable.image7),
            MessageText(R.string.affirmation8, R.drawable.image8),
            MessageText(R.string.affirmation9, R.drawable.image9),
            MessageText(R.string.affirmation10, R.drawable.image10))
    }
}