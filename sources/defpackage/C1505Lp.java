package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505Lp {
    public String a;
    public String b;
    public int c;
    public int d;

    public C1505Lp(C1505Lp c1505Lp) {
        a(c1505Lp);
    }

    public C1505Lp(int i, String str, int i2) {
        this.a = str;
        this.b = "";
        this.c = i;
        this.d = i2;
    }

    public final void a(C1505Lp c1505Lp) {
        String str = c1505Lp.a;
        String str2 = c1505Lp.b;
        int i = c1505Lp.c;
        int i2 = c1505Lp.d;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.b);
    }

    public final String b() {
        return this.a + this.b;
    }

    public final boolean d() {
        return this.c == this.a.length() && this.d == this.a.length();
    }

    public static boolean e(String str, String str2) {
        return str2.startsWith(str) && str2.length() > str.length();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1505Lp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1505Lp c1505Lp = (C1505Lp) obj;
        return this.a.equals(c1505Lp.a) && this.b.equals(c1505Lp.b) && this.c == c1505Lp.c && this.d == c1505Lp.d;
    }

    public final int hashCode() {
        return (this.d * 7) + (this.c * 5) + (this.b.hashCode() * 3) + (this.a.hashCode() * 2);
    }

    public final String toString() {
        return String.format(Locale.US, "AutocompleteState {[%s][%s] [%d-%d]}", this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
