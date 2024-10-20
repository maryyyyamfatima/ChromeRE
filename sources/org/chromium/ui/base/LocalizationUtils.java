package org.chromium.ui.base;

import defpackage.V60;
import java.util.Locale;
import org.chromium.base.LocaleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LocalizationUtils {
    public static Locale getJavaLocale(String str, String str2, String str3) {
        return new Locale(str, str2, str3);
    }

    public static String getDisplayNameForLocale(Locale locale, Locale locale2) {
        return locale.getDisplayName(locale2);
    }

    public static boolean isLayoutRtl() {
        return V60.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static String a(String str) {
        return str.replace("$LOCALE", LocaleUtils.getDefaultLocaleString().replace('-', '_'));
    }
}
