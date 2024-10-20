package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class If4 implements InterfaceC4582dW0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VT b;
    public final /* synthetic */ H74 c;
    public final /* synthetic */ boolean d = true;
    public final /* synthetic */ C7580mD0 e;
    public final /* synthetic */ C1485Ll f;

    public If4(int i, C7580mD0 c7580mD0, H74 h74, VT vt, C1485Ll c1485Ll) {
        this.a = i;
        this.b = vt;
        this.c = h74;
        this.e = c7580mD0;
        this.f = c1485Ll;
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void a(Object obj) {
        int i = this.a;
        VT vt = this.b;
        H74 h74 = this.c;
        boolean z = this.d;
        Jf4.a(i, this.e, h74, vt, (C1485Ll) obj, z);
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void b(Throwable th) {
        int i = Jf4.a;
        Log.e("Jf4", "Event mutator failure: ", th);
        C1485Ll c1485Ll = this.f;
        int i2 = this.a;
        VT vt = this.b;
        Jf4.a(i2, this.e, this.c, vt, c1485Ll, this.d);
    }
}
