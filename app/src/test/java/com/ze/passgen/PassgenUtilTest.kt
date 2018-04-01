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

import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PassgenUtilTest {

    @Test
    fun testPassword() {
        assertThat(PassgenUtil.generate(0).length, `is`(0))
        assertThat(PassgenUtil.generate(8).length, `is`(8))
        assertThat(PassgenUtil.generate(10).length, `is`(10))
    }
}
