package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11489xd2 implements Callback {
    public final /* synthetic */ C11832yd2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C11832yd2 c11832yd2 = this.a;
        c11832yd2.c.onResult(obj);
        ((C8385oa2) ((InterfaceC7697ma2) c11832yd2.b.get())).n(c11832yd2.a);
    }

    public C11489xd2(C11832yd2 c11832yd2) {
        this.a = c11832yd2;
    }
}
