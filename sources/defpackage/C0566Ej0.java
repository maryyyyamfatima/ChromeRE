package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ej0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566Ej0 {
    public final C1439Lb3 a;

    public C0566Ej0(C1439Lb3 c1439Lb3) {
        this.a = c1439Lb3;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        C1439Lb3 c1439Lb3 = (C1439Lb3) this.a.get(str);
        if (c1439Lb3 == null) {
            return null;
        }
        if (str2 != null) {
            str3 = AbstractC7848n0.a(str2, str3);
        }
        return (String) c1439Lb3.get(str3);
    }
}
