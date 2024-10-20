package defpackage;

import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Df */
/* loaded from: classes.dex */
public final class C0415Df implements InterfaceC11778yT1 {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef a;

    public C0415Df(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.a = layoutInflaterFactory2C0545Ef;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final void c(BS1 bs1, boolean z) {
        C0285Cf c0285Cf;
        BS1 k = bs1.k();
        int i = 0;
        boolean z2 = k != bs1;
        if (z2) {
            bs1 = k;
        }
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        C0285Cf[] c0285CfArr = layoutInflaterFactory2C0545Ef.L;
        int length = c0285CfArr != null ? c0285CfArr.length : 0;
        while (true) {
            if (i < length) {
                c0285Cf = c0285CfArr[i];
                if (c0285Cf != null && c0285Cf.h == bs1) {
                    break;
                } else {
                    i++;
                }
            } else {
                c0285Cf = null;
                break;
            }
        }
        if (c0285Cf != null) {
            if (z2) {
                layoutInflaterFactory2C0545Ef.q(c0285Cf.a, c0285Cf, k);
                layoutInflaterFactory2C0545Ef.s(c0285Cf, true);
            } else {
                layoutInflaterFactory2C0545Ef.s(c0285Cf, z);
            }
        }
    }

    @Override // defpackage.InterfaceC11778yT1
    public final boolean d(BS1 bs1) {
        Window.Callback A;
        if (bs1 != bs1.k()) {
            return true;
        }
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        if (!layoutInflaterFactory2C0545Ef.F || (A = layoutInflaterFactory2C0545Ef.A()) == null || layoutInflaterFactory2C0545Ef.Q) {
            return true;
        }
        A.onMenuOpened(108, bs1);
        return true;
    }
}
