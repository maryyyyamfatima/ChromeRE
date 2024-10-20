package org.chromium.base;

import android.content.Context;
import android.text.TextUtils;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class JNIUtils {
    public static Boolean a;
    public static ClassLoader b;

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = Boolean.FALSE;
        }
        return a.booleanValue();
    }

    public static ClassLoader getSplitClassLoader(String str) {
        Context context = V60.a;
        if (TextUtils.isEmpty(str) || !BundleUtils.d(context, str)) {
            ClassLoader classLoader = b;
            return classLoader == null ? JNIUtils.class.getClassLoader() : classLoader;
        }
        return BundleUtils.a(context, str).getClassLoader();
    }
}
