package org.chromium.chrome.browser.notifications;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionInfo {
    public final String a;
    public final Bitmap b;
    public final int c;
    public final String d;

    public ActionInfo(String str, Bitmap bitmap, int i, String str2) {
        this.a = str;
        this.b = bitmap;
        this.c = i;
        this.d = str2;
    }

    public static ActionInfo createActionInfo(String str, Bitmap bitmap, int i, String str2) {
        return new ActionInfo(str, bitmap, i, str2);
    }
}
