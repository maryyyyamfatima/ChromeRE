package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KN3 extends C5799h20 {
    public final Context r;
    public int s;
    public int t;
    public int u;
    public int v;

    @Override // defpackage.C5799h20
    public final void e() {
        throw null;
    }

    public KN3(Context context, float f, float f2, InterfaceC5455g20 interfaceC5455g20, int i) {
        super(context, f, f2, interfaceC5455g20);
        this.r = context;
        this.d = i;
    }

    public final int g() {
        boolean z = this.l;
        int i = z ? this.u : this.s;
        if (this.j) {
            i = z ? this.v : this.t;
        }
        return Y50.b(this.r, i).getDefaultColor();
    }
}
