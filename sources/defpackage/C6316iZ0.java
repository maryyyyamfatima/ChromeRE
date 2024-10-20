package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iZ0 */
/* loaded from: classes.dex */
public final class C6316iZ0 extends AbstractC2045Pt0 {
    public C6316iZ0(C5284fZ0 c5284fZ0) {
        super(c5284fZ0);
    }

    @Override // defpackage.JO2
    public final Class e() {
        return C5284fZ0.class;
    }

    @Override // defpackage.JO2
    public final int d() {
        C8378oZ0 c8378oZ0 = ((C5284fZ0) this.a).a.a;
        C1993Pi3 c1993Pi3 = (C1993Pi3) c8378oZ0.a;
        return (c1993Pi3.j.length * 4) + c1993Pi3.d.limit() + c1993Pi3.i.length + c8378oZ0.n;
    }

    @Override // defpackage.JO2
    public final void b() {
        C3492aK1 c3492aK1;
        C3492aK1 c3492aK12;
        C3492aK1 c3492aK13;
        C5284fZ0 c5284fZ0 = (C5284fZ0) this.a;
        c5284fZ0.stop();
        c5284fZ0.i = true;
        C8378oZ0 c8378oZ0 = c5284fZ0.a.a;
        c8378oZ0.c.clear();
        Bitmap bitmap = c8378oZ0.l;
        if (bitmap != null) {
            c8378oZ0.e.b(bitmap);
            c8378oZ0.l = null;
        }
        c8378oZ0.f = false;
        C7346lZ0 c7346lZ0 = c8378oZ0.i;
        ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2 = c8378oZ0.d;
        if (c7346lZ0 != null) {
            componentCallbacks2C5575gO2.n(c7346lZ0);
            c8378oZ0.i = null;
        }
        C7346lZ0 c7346lZ02 = c8378oZ0.k;
        if (c7346lZ02 != null) {
            componentCallbacks2C5575gO2.n(c7346lZ02);
            c8378oZ0.k = null;
        }
        C7346lZ0 c7346lZ03 = c8378oZ0.m;
        if (c7346lZ03 != null) {
            componentCallbacks2C5575gO2.n(c7346lZ03);
            c8378oZ0.m = null;
        }
        C1993Pi3 c1993Pi3 = (C1993Pi3) c8378oZ0.a;
        c1993Pi3.l = null;
        byte[] bArr = c1993Pi3.i;
        C4253cZ0 c4253cZ0 = c1993Pi3.c;
        if (bArr != null && (c3492aK13 = c4253cZ0.b) != null) {
            c3492aK13.g(bArr);
        }
        int[] iArr = c1993Pi3.j;
        if (iArr != null && (c3492aK12 = c4253cZ0.b) != null) {
            c3492aK12.g(iArr);
        }
        Bitmap bitmap2 = c1993Pi3.m;
        if (bitmap2 != null) {
            c4253cZ0.a.b(bitmap2);
        }
        c1993Pi3.m = null;
        c1993Pi3.d = null;
        c1993Pi3.s = null;
        byte[] bArr2 = c1993Pi3.e;
        if (bArr2 != null && (c3492aK1 = c4253cZ0.b) != null) {
            c3492aK1.g(bArr2);
        }
        c8378oZ0.j = true;
    }

    @Override // defpackage.AbstractC2045Pt0, defpackage.InterfaceC2656Ul1
    public final void a() {
        ((C5284fZ0) this.a).a.a.l.prepareToDraw();
    }
}
