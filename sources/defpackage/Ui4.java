package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class Ui4 {
    public static Uri a(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }
}
