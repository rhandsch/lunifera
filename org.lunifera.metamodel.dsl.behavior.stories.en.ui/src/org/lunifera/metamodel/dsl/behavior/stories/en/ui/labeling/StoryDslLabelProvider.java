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
/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.behavior.stories.en.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AndStep;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AsA;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Examples;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.GivenStep;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.GivenStories;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.IWantTo;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.InOrderTo;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Meta;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementComponent;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementDefault;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementEntity;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementProcess;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementStepClass;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Narrative;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Scenario;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.ThenStep;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.WhenStep;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class StoryDslLabelProvider extends DefaultEObjectLabelProvider {

	int outlineRowSize = 40;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	public StoryDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:

	String text(AndStep ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "And " + name;
	}

	String text(AsA ele) {
		String roles = "no_role_selected";
		if (ele.getRoles() != null) {
			if (ele.getRoles().get(0) != null) {

				roles = ele.getRoles().get(0).getName();
			}
		}
		return "As a " + roles;
	}

	String text(MetaElementComponent ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "@component " + name;
	}

	String text(MetaElementDefault ele) {
		return "@" + ele.getName();
	}

	String text(MetaElementEntity ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "@entity " + name;
	}

	String text(Examples ele) {
		return "Examples ";
	}

	String text(GivenStep ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "Given " + name;
	}

	String text(GivenStories ele) {
		return "GivenStories";
	}

	String text(InOrderTo ele) {
		String name = ele.getName();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "In order to " + name;
	}

	String text(IWantTo ele) {
		String name = ele.getName();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "I want to " + name;
	}

	String text(Meta ele) {
		return "Meta";
	}

	String text(Narrative ele) {
		return "Narrative";
	}

	String text(MetaElementProcess ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "@process " + name;
	}

	String text(Scenario ele) {
		String name = ele.getName();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "Scenario: " + name;
	}

	String text(MetaElementStepClass ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "@component " + name;
	}

	String text(ThenStep ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "Then " + name;
	}

	String text(WhenStep ele) {
		String name = qualifiedNameProvider.getFullyQualifiedName(ele)
				.toString();
		if (name.length() > outlineRowSize) {
			name = name.substring(0, outlineRowSize).concat("...");
		}
		return "When " + name;
	}

	/*
	 * 
	 * String image(MyModel ele) { return "MyModel.gif"; }
	 */
}
