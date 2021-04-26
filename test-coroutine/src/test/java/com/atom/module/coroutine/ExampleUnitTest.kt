package com.atom.module.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val job = GlobalScope.launch { // 在后台启动一个新的协程并继续
        delay(1000L)
        println("World1 ${Thread.currentThread().name}")
    }
    @Test
    fun addition_isCorrect() {
        job.start()
        println("Hello2 ${Thread.currentThread().name}") // 主线程中的代码会立即执行
        runBlocking {     // 但是这个表达式阻塞了主线程
            println("Hello3 ${Thread.currentThread().name}")
            delay(2000L)  // ……我们延迟 2 秒来保证 JVM 的存活
        }
    }
    @Test
    fun addition_isCorrect2() {
        runBlocking {
            println("Hello2 ${Thread.currentThread().name}") // 主线程中的代码会立即执行
            launch {
                delay(1000L)
                println("World1 ${Thread.currentThread().name}")
            }
        }
    }
    @Test
    fun addition_isCorrect3() = runBlocking {
        println("Hello2 ${Thread.currentThread().name}") // 主线程中的代码会立即执行
        launch {
            delay(1000L)
            println("World1 ${Thread.currentThread().name}")
        }
    }
}