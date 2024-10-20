package org.chromium.chrome.browser.flags;

import defpackage.AbstractC1329Kf3;
import defpackage.C12188zf3;
import defpackage.ViewOnClickListenerC1069If3;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BadFlagsSnackbarManager {
    public static void show(WindowAndroid windowAndroid, String str) {
        ViewOnClickListenerC1069If3 a = AbstractC1329Kf3.a(windowAndroid);
        if (a == null) {
            return;
        }
        C12188zf3 a2 = C12188zf3.a(str, null, 1, 51);
        a2.i = false;
        a2.j = 8000;
        a.c(a2);
    }
}
