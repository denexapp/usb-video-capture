/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
  /**
   * Use `apply false` in the top-level build.gradle file to add a Gradle
   * plugin as a build dependency but not apply it to the current (root)
   * project. Don't use `apply false` in sub-projects. For more information,
   * see Applying external plugins with same version to subprojects.
   */

  id("com.android.application") version "8.9.2" apply false
  id("com.android.library") version "8.9.2" apply false
  id("org.jetbrains.kotlin.android") version "1.9.23" apply false}
