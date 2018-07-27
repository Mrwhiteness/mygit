package com.android.instructionbook.util;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import java.util.Locale;

public class Utils {
	public static String getDisplayName(String paramString) {
		if (TextUtils.isEmpty(paramString))
			;
		String[] arrayOfString = paramString.split("\\.");
		if (arrayOfString.length == 1)
			return paramString;
		return arrayOfString[1];
	}

	public static String getLocaleLanguage() {
		Locale localLocale = Locale.getDefault();
		Object[] arrayOfObject = new Object[2];
		arrayOfObject[0] = localLocale.getLanguage();
		arrayOfObject[1] = localLocale.getCountry();
		return String.format("%s-%s", arrayOfObject);
	}

	public static String getSharedPreferences(Context paramContext) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getString("ZIP_FILE", "nomanual");
	}

}