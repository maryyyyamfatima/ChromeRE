package defpackage;

import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: He0 */
/* loaded from: classes.dex */
public final class C0931He0 implements InterfaceC8371oX3, InterfaceC0186Bl0, H14 {
    public WindowAndroid a;
    public InterfaceC7913nB g;

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public C0931He0(C10285u6 c10285u6, I5 i5, C1051Ic0 c1051Ic0) {
        this.a = c10285u6;
        this.g = c1051Ic0;
        i5.b(this);
        WindowAndroid windowAndroid = this.a;
        int i = AbstractC8027nX3.a;
        InterfaceC8371oX3.e.a(this, windowAndroid.t);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        int i = AbstractC8027nX3.a;
        InterfaceC8371oX3.e.b(this);
        this.a = null;
        this.g = null;
    }
}
