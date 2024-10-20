package defpackage;

import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pf */
/* loaded from: classes.dex */
public final class C8755pf implements InterfaceC11778yT1 {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef a;

    public C8755pf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.a = layoutInflaterFactory2C0545Ef;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final boolean d(BS1 bs1) {
        Window.Callback A = this.a.A();
        if (A == null) {
            return true;
        }
        A.onMenuOpened(108, bs1);
        return true;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final void c(BS1 bs1, boolean z) {
        this.a.r(bs1);
    }
}
