/*
 * Copyright 2017-2018 Simon Zigelli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ze.passgen

object PassgenUtil {

    enum class Mode {
        LOWERCASE, UPPERCASE, UPPERLOWERCASE
    }

    fun generate(length: Int, mode: Mode = Mode.LOWERCASE): String {
        val chars = mode(mode)
        var passWord = ""
        for (i in 0 until length) {
            passWord += chars[Math.floor(Math.random() * chars.length).toInt()]
        }
        return passWord
    }

    private fun mode(mode: Mode): String {
        return when (mode) {
            Mode.LOWERCASE -> "0123456789abcdefghijklmnopqrstuvwxyz"
            Mode.UPPERCASE -> "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            Mode.UPPERLOWERCASE -> "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        }
    }
}