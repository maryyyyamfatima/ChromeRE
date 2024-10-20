package defpackage;

import org.chromium.gfx.mojom.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6576jI3 implements InterfaceC9305rF {
    public final InterfaceC7559m90 a;
    public final DV1 b;
    public final long c;

    @Override // defpackage.InterfaceC9305rF
    public final void a(Object obj) {
        C5890hI3 c5890hI3 = new C5890hI3(0);
        c5890hI3.b = (Rect) obj;
        this.b.A(c5890hI3.c(this.a, new C5953hV1(5, 2, this.c)));
    }

    public C6576jI3(InterfaceC7559m90 interfaceC7559m90, DV1 dv1, long j) {
        this.a = interfaceC7559m90;
        this.b = dv1;
        this.c = j;
    }
}
