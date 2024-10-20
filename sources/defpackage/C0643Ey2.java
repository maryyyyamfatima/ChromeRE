package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ey2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643Ey2 {
    public final int a;
    public final int b;
    public final String c;

    public C0643Ey2(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.K;
        this.b = preference.L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0643Ey2)) {
            return false;
        }
        C0643Ey2 c0643Ey2 = (C0643Ey2) obj;
        return this.a == c0643Ey2.a && this.b == c0643Ey2.b && TextUtils.equals(this.c, c0643Ey2.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
