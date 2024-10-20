package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class MC3 implements Callback {
    public final /* synthetic */ ZC3 a;

    public /* synthetic */ MC3(ZC3 zc3) {
        this.a = zc3;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        ((Boolean) obj).booleanValue();
        this.a.b();
    }
}
