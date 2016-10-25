/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.command.explorer.page;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

import org.eclipse.che.ide.api.command.CommandImpl;

/**
 * //
 *
 * @author Artem Zatsarynnyi
 */
public class PreviewUrlPage implements CommandsExplorerPage {

    @Override
    public String getTitle() {
        return "Preview URL";
    }

    @Override
    public String getTooltip() {
        return "Command preview URL";
    }

    @Override
    public IsWidget getView() {
        return new Label("Preview URL");
    }

    @Override
    public void resetFrom(CommandImpl command) {

    }
}
