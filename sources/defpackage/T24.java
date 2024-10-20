package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class T24 {
    public static Uri a(Uri uri, String str) {
        return uri.buildUpon().path(uri.getPath() + str).build();
    }
}
