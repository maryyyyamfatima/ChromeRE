package defpackage;

import android.util.Size;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xv2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3097Xv2 implements L0 {
    public final C11603xw2 a;
    public final Size b;
    public final Size c;

    @Override // defpackage.L0
    public final float d() {
        return 0.0f;
    }

    @Override // defpackage.L0
    public final float e(float f) {
        return f;
    }

    @Override // defpackage.L0
    public final int c() {
        return this.a.a.getHeight();
    }

    public C3097Xv2(C11603xw2 c11603xw2, Size size, Size size2) {
        this.a = c11603xw2;
        this.b = size;
        this.c = size2;
    }

    @Override // defpackage.L0
    public final float f() {
        return this.b.getWidth();
    }

    @Override // defpackage.L0
    public final float a() {
        return this.b.getHeight();
    }

    @Override // defpackage.L0
    public final float b() {
        int i = this.a.a().left;
        return i + (this.c == null ? 0 : r1.getWidth());
    }

    @Override // defpackage.L0
    public final float g() {
        int i = this.a.a().top;
        return i + (this.c == null ? 0 : r1.getHeight());
    }
}
