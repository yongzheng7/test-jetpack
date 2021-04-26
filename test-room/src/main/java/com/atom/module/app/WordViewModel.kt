package com.atom.module.app

import androidx.lifecycle.*
import com.atom.module.utils.Logs
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository) : ViewModel() , DefaultLifecycleObserver{

    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()

    fun insert(word: Word) = viewModelScope.launch {
        repository.insert(word)
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onCreate ${owner.lifecycle.currentState}")
        owner.lifecycleScope.launchWhenCreated {
            Logs.e("${Thread.currentThread().name} WordViewModel launchWhenCreated lifecycleScope ${owner.lifecycle.currentState}")
        }
        owner.lifecycleScope.launchWhenStarted {
            Logs.e("${Thread.currentThread().name} WordViewModel launchWhenStarted lifecycleScope ${owner.lifecycle.currentState}")
        }
        owner.lifecycleScope.launchWhenResumed {
            Logs.e("${Thread.currentThread().name} WordViewModel launchWhenResumed lifecycleScope ${owner.lifecycle.currentState}")
        }
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onStart ${owner.lifecycle.currentState}")

    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onResume ${owner.lifecycle.currentState}")

    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onPause ${owner.lifecycle.currentState}")

    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onStop ${owner.lifecycle.currentState}")

    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Logs.e("${Thread.currentThread().name} WordViewModel onDestroy ${owner.lifecycle.currentState}")

    }
}