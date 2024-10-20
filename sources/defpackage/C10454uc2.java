package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uc2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10454uc2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C10454uc2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final String a(String str) {
        int i = this.b;
        if (!(i > 0)) {
            return "";
        }
        int i2 = this.a;
        return str.subSequence(i2, i + i2).toString().toLowerCase(Locale.US);
    }
}
