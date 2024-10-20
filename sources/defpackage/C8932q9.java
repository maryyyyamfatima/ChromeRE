package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8932q9 implements InterfaceC9305rF {
    public final InterfaceC7559m90 a;
    public final DV1 b;
    public final long c;

    @Override // defpackage.InterfaceC9305rF
    public final void a(Object obj) {
        C8246o9 c8246o9 = new C8246o9(0);
        c8246o9.b = (Map) obj;
        this.b.A(c8246o9.c(this.a, new C5953hV1(2, 2, this.c)));
    }

    public C8932q9(InterfaceC7559m90 interfaceC7559m90, DV1 dv1, long j) {
        this.a = interfaceC7559m90;
        this.b = dv1;
        this.c = j;
    }
}
