package org.chromium.chrome.browser.base;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC4851eH1;
import defpackage.V60;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SplitCompatAppComponentFactory extends AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        SplitChromeApplication.e("chrome");
        return super.instantiateActivity(a(classLoader, str), str, intent);
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return super.instantiateProvider(a(classLoader, str), str);
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        SplitChromeApplication.e("chrome");
        return super.instantiateReceiver(a(classLoader, str), str, intent);
    }

    public static ClassLoader a(ClassLoader classLoader, String str) {
        boolean z;
        boolean z2;
        Context context = V60.a;
        if (context == null) {
            AbstractC4851eH1.a("SplitCompat", "Unexpected null Context when instantiating component: %s", str);
            return classLoader;
        }
        ClassLoader classLoader2 = SplitCompatAppComponentFactory.class.getClassLoader();
        ClassLoader classLoader3 = context.getClassLoader();
        if (!classLoader.equals(classLoader3)) {
            Boolean bool = BundleUtils.a;
            try {
                Class.forName(str, false, classLoader2);
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                try {
                    Class.forName(str, false, classLoader3);
                    z2 = true;
                } catch (ClassNotFoundException unused2) {
                    z2 = false;
                }
                if (z2) {
                    AbstractC4851eH1.f("SplitCompat", "Mismatched ClassLoaders between Application and component: %s", str);
                    return classLoader3;
                }
            }
        }
        return classLoader;
    }
}
