/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.rust.grammar.antlr4;

import org.junit.Test;
import org.netbeans.junit.NbTestCase;

/**
 *
 * @author antonio
 */
public class RustLexerWithFilesTest extends NbTestCase {

    public RustLexerWithFilesTest(String testName) {
        super(testName);
    }

    @Test
    public void testShouldVisit_noparse_rs() throws Exception {
        System.out.println("testShouldVisit_noparse_rs");
        RustTestUtils.lexFile(getDataDir(), "noparse.rs", false, null);
    }

    @Test
    public void testShouldVisit_crates_regex_rs() throws Exception {
        System.out.println("testShouldVisit_crates_regex_rs");
        RustTestUtils.lexFile(getDataDir(), "crates_regex.rs", false, null);
    }

    @Test
    public void testShouldVisit_shl_shr_rs() throws Exception {
        System.out.println("testShouldVisit_shl_shr_rs");
        RustTestUtils.lexFile(getDataDir(), "shl_shr.rs", false, null);
    }

}
