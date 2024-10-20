package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class GL1 implements Callback {
    public final /* synthetic */ JL1 a;

    public /* synthetic */ GL1(JL1 jl1) {
        this.a = jl1;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C12044zE c12044zE = (C12044zE) obj;
        if (this.a.f) {
            c12044zE.c(c12044zE.i);
        }
    }
}
