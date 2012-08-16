/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on org.eclipse.xtend.ide.labeling.XtendImages
 * 
 */
package org.lunifera.metamodel.dsl.entity.ui.labeling;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.viewsupport.JavaElementImageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.xbase.ui.labeling.XbaseImages;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class EntityImages extends XbaseImages {

	@Inject
	private IImageHelper imageHelper;

	public ImageDescriptor forFilter() {
		return JavaPluginImages.DESC_ELCL_FILTER;
	}

	public ImageDescriptor forImplementsAnnotation() {
		return JavaPluginImages.DESC_OBJ_IMPLEMENTS;
	}

	public ImageDescriptor forOverridesAnnotation() {
		return JavaPluginImages.DESC_OBJ_OVERRIDES;
	}

	public Image forPackage() {
		return getJdtImage(JavaPluginImages.DESC_OBJS_PACKDECL);
	}

	public Image forImport() {
		return getJdtImage(JavaPluginImages.DESC_OBJS_IMPDECL);
	}

	public Image forField(JvmVisibility visibility, int attachment) {
		ImageDescriptor descriptor = JavaElementImageProvider
				.getFieldImageDescriptor(false, toFlags(JvmVisibility.PRIVATE));
		return attachment >= 0 ? getDecoratedJdtImage(descriptor, attachment)
				: getJdtImage(descriptor);
	}

	public Image forEnum(JvmVisibility visibility) {
		int flags = toFlags(visibility);
		flags |= Flags.AccEnum;
		return getJdtImage(JavaElementImageProvider.getTypeImageDescriptor(
				false, false, flags, false));
	}

	public Image forEnumLiteral() {
		ImageDescriptor descriptor = JavaElementImageProvider
				.getFieldImageDescriptor(false, toFlags(JvmVisibility.PUBLIC));
		return getJdtImage(descriptor);
	}

	public Image forProperty() {
		return forField(JvmVisibility.PRIVATE, -1);
	}

	public Image forRefers() {
		return forField(JvmVisibility.PRIVATE, -1);
	}

	public Image forContains() {
		return forField(JvmVisibility.PRIVATE, -1);
	}

	public Image forContainer() {
		return forField(JvmVisibility.PRIVATE, -1);
	}

	public Image forEmbedds() {
		return forField(JvmVisibility.PRIVATE, -1);
	}

	public Image forFile() {
		return imageHelper.getImage("xtend.gif");
	}
}
