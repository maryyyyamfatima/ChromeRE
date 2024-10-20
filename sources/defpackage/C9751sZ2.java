package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sZ2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9751sZ2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public C9751sZ2(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9751sZ2)) {
            return false;
        }
        C9751sZ2 c9751sZ2 = (C9751sZ2) obj;
        return this.c == c9751sZ2.c && this.d == c9751sZ2.d && this.e == c9751sZ2.e && TextUtils.equals(this.a, c9751sZ2.a) && TextUtils.equals(this.b, c9751sZ2.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }
}
