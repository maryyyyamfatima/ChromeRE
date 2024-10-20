package defpackage;

import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cX2 */
/* loaded from: classes2.dex */
public final class C4245cX2 implements InterfaceC3902bX2, InterfaceC4009bp4 {
    public final ZW2 a;
    public final C5276fX2 g;

    public C4245cX2(ZW2 zw2, C5276fX2 c5276fX2) {
        this.a = zw2;
        this.g = c5276fX2;
        WindowAndroid windowAndroid = c5276fX2.c;
        windowAndroid.w.a(this);
        ((CV1) zw2).d(new GV1(c5276fX2, windowAndroid.q() == 3 ? 0 : 1));
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void b() {
        C5276fX2 c5276fX2 = this.g;
        int i = c5276fX2.a;
        ((CV1) this.a).d(new GV1(c5276fX2, 1));
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void a() {
        C5276fX2 c5276fX2 = this.g;
        int i = c5276fX2.a;
        ((CV1) this.a).d(new GV1(c5276fX2, 0));
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void d() {
        C5276fX2 c5276fX2 = this.g;
        int i = c5276fX2.a;
        ((CV1) this.a).d(new GV1(c5276fX2, 2));
    }

    @Override // defpackage.InterfaceC3902bX2
    public final void destroy() {
        this.g.c.w.d(this);
    }
}
