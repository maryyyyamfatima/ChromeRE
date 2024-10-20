package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class IC2 implements Callback {
    public final /* synthetic */ MC2 a;

    public /* synthetic */ IC2(MC2 mc2) {
        this.a = mc2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.e((Exception) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
