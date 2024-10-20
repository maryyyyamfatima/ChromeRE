package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3147Yf2 {
    public final Context a;

    public C3147Yf2(Context context) {
        this.a = context;
    }

    public final ApplicationInfo a(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo b(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}
