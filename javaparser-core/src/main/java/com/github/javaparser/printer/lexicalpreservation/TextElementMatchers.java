/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2020 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.printer.lexicalpreservation;

import com.github.javaparser.ast.Node;

class TextElementMatchers {

    static TextElementMatcher byTokenType(int tokenType) {
        return textElement -> textElement.isToken(tokenType);
    }

    static TextElementMatcher byNode(final Node node) {
        return new TextElementMatcher() {
            @Override
            public boolean match(TextElement textElement) {
                return textElement.isNode(node);
            }

            @Override
            public String toString() {
                return "match node " + node;
            }
        };
    }
}
