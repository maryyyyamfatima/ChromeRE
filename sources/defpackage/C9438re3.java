package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: re3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9438re3 implements InterfaceC8179nx2 {
    public final C9781se3 a;
    public int b;
    public Bitmap.Config c;

    public C9438re3(C9781se3 c9781se3) {
        this.a = c9781se3;
    }

    @Override // defpackage.InterfaceC8179nx2
    public final void a() {
        this.a.c(this);
    }

    public final String toString() {
        return C10124te3.c(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9438re3)) {
            return false;
        }
        C9438re3 c9438re3 = (C9438re3) obj;
        return this.b == c9438re3.b && AbstractC10296u74.b(this.c, c9438re3.c);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }
}
