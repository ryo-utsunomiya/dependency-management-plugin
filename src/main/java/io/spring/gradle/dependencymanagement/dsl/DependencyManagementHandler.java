/*
 * Copyright 2014-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.gradle.dependencymanagement.dsl;

import groovy.lang.Closure;

/**
 * A handler for configuring dependency management.
 *
 * @author Andy Wilkinson
 */
public interface DependencyManagementHandler {

    /**
     * Configures the dependency management imports using the given {@code closure}. The closure is called with an
     * {@link ImportsHandler} as its delegate.
     *
     * @param closure the closure to execute to configure the imports
     * @see ImportsHandler
     */
    void imports(Closure closure);

    /**
     * Configures the managed dependencies using the given {@code closure}. The closure is called with
     * {@link DependenciesHandler} as its delegate.
     *
     * @param closure the closure to execute to configure the dependencies
     * @see DependenciesHandler
     */
    void dependencies(Closure closure);

}