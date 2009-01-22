/*
 * Copyright 2009 Google Inc.
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

package com.google.devtools.depan.javascript.graph;


/**
 * Define how a JavaScript builtin (such as String or Element) is represented
 * in a dependency graph.
 * 
 * @author <a href="leeca@google.com">Lee Carver</a>
 */
public class JavaScriptBuiltinElement extends JavaScriptElement {

  private final String builtinName;

  /**
   * Construct an element for built-in JavaScript components.
   */
  public JavaScriptBuiltinElement(String builtinName) {
    this.builtinName = builtinName;
  }

  @Override
  public void accept(JavaScriptElementVisitor visitor) {
    visitor.visitClass(this);
  }

  @Override
  public String friendlyString() {
    return getElementName();
  }

  @Override
  public String getId() {
    return builtinName;
  }
}
