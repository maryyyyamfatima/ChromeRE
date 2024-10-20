package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H72 implements Callback {
    public final /* synthetic */ InterfaceC2559Ts a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public H72(InterfaceC2559Ts interfaceC2559Ts) {
        this.a = interfaceC2559Ts;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.a(((Boolean) obj).booleanValue());
    }
}
