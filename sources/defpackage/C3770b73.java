package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3770b73 implements Callback {
    public final /* synthetic */ RunnableC4113c73 a;
    public final /* synthetic */ Callback g;
    public final /* synthetic */ Callback h;

    public /* synthetic */ C3770b73(RunnableC4113c73 runnableC4113c73, Callback callback, Callback callback2) {
        this.a = runnableC4113c73;
        this.g = callback;
        this.h = callback2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        RunnableC4113c73 runnableC4113c73 = this.a;
        AbstractC2663Um3.a(runnableC4113c73.a);
        if (((Boolean) obj).booleanValue()) {
            this.g.onResult(runnableC4113c73.g);
        } else {
            this.h.onResult(null);
        }
    }
}
