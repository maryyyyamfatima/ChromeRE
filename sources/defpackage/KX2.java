package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class KX2 implements InterfaceC0079Ap3 {
    public final /* synthetic */ OX2 a;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ViewGroup h;
    public final /* synthetic */ int i;

    public /* synthetic */ KX2(OX2 ox2, Context context, ViewGroup viewGroup, int i) {
        this.a = ox2;
        this.g = context;
        this.h = viewGroup;
        this.i = i;
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        OX2 ox2 = this.a;
        ox2.getClass();
        return new VX2(this.g, this.h, this.i, ox2.b);
    }
}
