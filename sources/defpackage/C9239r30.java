package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9239r30 implements Callback {
    public final /* synthetic */ C9925t30 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C9925t30 c9925t30 = this.a;
        c9925t30.h = (Boolean) obj;
        if (c9925t30.a == 2) {
            RunnableC8554p30 runnableC8554p30 = c9925t30.i;
            if (runnableC8554p30 != null) {
                c9925t30.f.removeCallbacks(runnableC8554p30);
                c9925t30.i = null;
            }
            c9925t30.b();
        }
    }
}
