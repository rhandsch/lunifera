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
package org.lunifera.metamodel.dsl.component.template.library.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class ComponentLibraryBuilderDslValueConverterService extends
		AbstractDeclarativeValueConverterService {

	@Inject
	@Named("dateFormat")
	private String dateFormat;

	@Inject
	@Named("timeZoneFormat")
	private String timeZoneFormat;

	public ComponentLibraryBuilderDslValueConverterService() {
	}

	@ValueConverter(rule = "Date")
	public IValueConverter<java.util.Date> FormatedValue() {
		return new AbstractNullSafeConverter<Date>() {

			@Override
			protected String internalToString(Date value) {
				SimpleDateFormat fmt = new SimpleDateFormat(dateFormat);
				fmt.setTimeZone(TimeZone.getTimeZone(timeZoneFormat));
				return '"' + fmt.format(value) + '"';
			}

			@Override
			protected Date internalToValue(String string, INode node)
					throws ValueConverterException {
				string = string.substring(1, string.length() - 1);

				// First choice, if a timestamp string, use it.
				try {
					// Allow non UTC strings since they are fully qualified with
					// offset and can thus
					// be parsed by anyone.
					SimpleDateFormat fmt = new SimpleDateFormat(dateFormat);
					fmt.setTimeZone(TimeZone.getTimeZone(timeZoneFormat));
					return fmt.parse(string);
				} catch (Exception e) {
					// ignore and try timestamp format
					System.err.println(e.getMessage());
//					throw new ValueConverterException(
//							"Not in timestamp format", node,
//							new IllegalArgumentException());
				}
				// Second choice - if using java default for the locale
				// Needs special processing as it probably does not contain TZ
				// in the string)
				try {
					// try the default locale style of Date Time and see if it
					// parses
					DateFormat.getDateTimeInstance().parse(string);
					// if this parsed, it is not likely that the default is the
					// full
					// format with timezone offset, so flag this as a special
					// error :)
					// that is fixable
					// Although simple, it makes sense from a user perspective,
					// a time in
					// local format can be entered and transformed to a
					// timestamp.
					throw new ValueConverterException(
							"Not in timestamp format", node,
							new IllegalArgumentException());
				} catch (ParseException e) {
					DateFormat fmt = DateFormat.getDateTimeInstance();
					String defaultFormat = (fmt instanceof SimpleDateFormat) ? ((SimpleDateFormat) fmt)
							.toLocalizedPattern()
							: "Default format for the locale";
					throw new ValueConverterException(
							"Not in valid format: Use '" + dateFormat + "' or "
									+ defaultFormat + "Parse error:"
									+ e.getMessage(), node, null);

				}

			}
		};
	}
}
