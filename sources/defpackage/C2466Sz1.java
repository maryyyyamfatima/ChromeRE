package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2466Sz1 {
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public int e;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2466Sz1)) {
            return false;
        }
        C2466Sz1 c2466Sz1 = (C2466Sz1) obj;
        return this.c == c2466Sz1.c && this.a == c2466Sz1.a && this.b == c2466Sz1.b && TextUtils.equals(this.d, c2466Sz1.d) && this.e == c2466Sz1.e;
    }
}
