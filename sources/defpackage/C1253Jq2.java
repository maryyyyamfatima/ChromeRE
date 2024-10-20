package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jq2 */
/* loaded from: classes.dex */
public final class C1253Jq2 implements Callback {
    public final /* synthetic */ C3069Xq a;
    public final /* synthetic */ C1642Mq2 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C1253Jq2(C1642Mq2 c1642Mq2, C3069Xq c3069Xq) {
        this.g = c1642Mq2;
        this.a = c3069Xq;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C3069Xq c3069Xq = (C3069Xq) obj;
        C1642Mq2 c1642Mq2 = this.g;
        if (c1642Mq2.z == null) {
            return;
        }
        if (c3069Xq != null) {
            if (!c3069Xq.a) {
                c1642Mq2.C.c = -1;
            } else if (this.a == null) {
                C8545p13 c8545p13 = c1642Mq2.C;
                c8545p13.a.add(0, c3069Xq);
                c8545p13.c = 0;
            }
        }
        c1642Mq2.w();
        c1642Mq2.z.o(4, c1642Mq2.C);
    }
}
