package com.symeonchen.demo.examples.fixTvReuse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.symeonchen.demo.examples.fixTvReuse.Bean.User

class FixTvReuseViewModel : ViewModel() {
    var userList = MutableLiveData<ArrayList<User>>()


    init {
        var _mockUserList = ArrayList<User>()
        _mockUserList.add(User(0, "nameShort", 1))
        _mockUserList.add(User(1, "nameMiddleMore", 2))
        _mockUserList.add(User(2, "name", 2))
        _mockUserList.add(User(3, "nameVerrrrrrrryLong", 3))
        _mockUserList.add(User(4, "name", 2))
        _mockUserList.add(User(5, "nameTooLongForTest", 8))
        _mockUserList.add(User(6, "nameVerrrrrrrryLong", 3))
        _mockUserList.add(User(7, "nameShort", 1))
        _mockUserList.add(User(8, "nameMiddleMore", 2))
        _mockUserList.add(User(9, "name", 2))
        _mockUserList.add(User(10, "nameTooLongForTest", 8))
        _mockUserList.add(User(11, "nameVerrrrrrrryLong", 3))
        _mockUserList.add(User(12, "name", 2))
        _mockUserList.add(User(13, "nameTooLongForTest", 8))
        _mockUserList.add(User(14, "nameVerrrrrrrryLong", 3))
        _mockUserList.add(User(15, "nameShort", 1))
        _mockUserList.add(User(16, "nameMiddleMore", 2))
        _mockUserList.add(User(17, "name", 2))
        _mockUserList.add(User(18, "nameTooLongForTest", 8))
        _mockUserList.add(User(19, "nameVerrrrrrrryLong", 3))
        _mockUserList.add(User(20, "name", 2))
        _mockUserList.add(User(21, "nameTooLongForTest", 8))
        _mockUserList.add(User(22, "nameVerrrrrrrryLong", 3))

        userList.postValue(_mockUserList)
    }


    override fun onCleared() {
        super.onCleared()
    }
}