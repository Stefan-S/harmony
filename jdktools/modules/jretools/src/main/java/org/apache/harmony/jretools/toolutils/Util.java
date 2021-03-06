/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.harmony.jretools.toolutils;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Util {

    /* A default encoding for console messages */
    static String CONSOLE_ENCODING = System.getProperty("console.encoding", //$NON-NLS-1$
            "ISO8859_1"); //$NON-NLS-1$

    public static PrintWriter getDefaultWriter(OutputStream out){
        OutputStreamWriter osw;
        try {
            osw = new OutputStreamWriter(out, CONSOLE_ENCODING);
        } catch (UnsupportedEncodingException e) {
            osw = new OutputStreamWriter(out);
        }
        return new PrintWriter(osw);
    }

}
