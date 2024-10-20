package defpackage;

import J.N;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NG1 implements Callback {
    public final /* synthetic */ long a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public NG1(long j) {
        this.a = j;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        N.MeFOXp9F(this.a, ((Integer) obj).intValue());
    }
}
