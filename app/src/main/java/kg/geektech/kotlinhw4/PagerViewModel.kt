package kg.geektech.kotlinhw4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PagerViewModel : ViewModel() {
    private var clickCount = 0
    private var clickedList = arrayListOf<Int>()

    val count = MutableLiveData<Int>()
    val list = MutableLiveData<List<Int>>()

    fun incrementClick() {
        clickCount++
        count.value = clickCount
        clickedList.add(clickCount)
        list.value = clickedList
    }

    fun decrement() {
        clickCount--
        count.value = clickCount
        clickedList.add(clickCount)
        list.value = clickedList
    }
}