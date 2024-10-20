package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bc2 */
/* loaded from: classes.dex */
public final class C3929bc2 extends AbstractC2737Vb2 implements InterfaceC2689Us {
    public static final Object l = new Object();
    public static C3929bc2 m;
    public C3127Yb2 k;

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
    }

    public C3929bc2(Context context) {
        super(new C3585ac2(context));
    }

    @Override // defpackage.InterfaceC2689Us
    public final boolean b(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        C3127Yb2 c3127Yb2 = new C3127Yb2(this, interfaceC2559Ts);
        c3127Yb2.c(AbstractC0185Bl.f);
        this.k = c3127Yb2;
        return false;
    }

    @Override // defpackage.InterfaceC2689Us
    public final boolean c(Context context, KF3 kf3) {
        C3127Yb2 c3127Yb2 = this.k;
        if (c3127Yb2 != null) {
            c3127Yb2.a(false);
            this.k = null;
        }
        return false;
    }
}
