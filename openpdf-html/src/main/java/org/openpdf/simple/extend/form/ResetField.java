/*
 * {{{ header & license
 * Copyright (c) 2007 Sean Bright
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.openpdf.simple.extend.form;

import org.w3c.dom.Element;
import org.openpdf.layout.LayoutContext;
import org.openpdf.render.BlockBox;
import org.openpdf.simple.extend.XhtmlForm;
import org.openpdf.util.XRLog;

import javax.swing.*;

class ResetField extends AbstractButtonField {
    ResetField(Element e, XhtmlForm form, LayoutContext context, BlockBox box) {
        super(e, form, context, box);
    }

    @Override
    public JComponent create() {
        JButton button = new JButton();

        String value;
        if (hasAttribute("value")) {
            value = getAttribute("value");
            if (value.isEmpty())
                value = " ";    //otherwise we get a very short button
        }
        else {
            value = "Reset";
        }

        applyComponentStyle(button);

        button.setText(value);

        button.addActionListener(event -> {
            XRLog.layout("Reset pressed: Restore");

            getParentForm().reset();
        });

        return button;
    }

    @Override
    public boolean includeInSubmission(JComponent source) {
        return false;
    }

    @Override
    protected String[] getFieldValues() {
        return new String[] {
                hasAttribute("value") ? getAttribute("value") : "Reset" // TODO: Don't hardcode
        };
    }
}
