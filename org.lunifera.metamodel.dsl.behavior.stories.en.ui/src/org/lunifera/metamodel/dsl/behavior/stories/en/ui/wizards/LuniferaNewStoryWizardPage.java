/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.behavior.stories.en.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (story).
 */

public class LuniferaNewStoryWizardPage extends WizardNewFileCreationPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public LuniferaNewStoryWizardPage(IStructuredSelection selection) {
		super("Lunifera", selection);
		setTitle("Behavior Story File");
		setFileName("new_behavior_story");
		setFileExtension("story");
		setDescription("This wizard creates a new file with *.story extension that can be opened by a multi-page editor.");
	}
}