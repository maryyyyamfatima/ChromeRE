package defpackage;

import J.N;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4120c84 implements Callback {
    public final /* synthetic */ C4807e84 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C4120c84(C4807e84 c4807e84) {
        this.a = c4807e84;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C4807e84 c4807e84 = this.a;
        N.McCUpqFO(c4807e84, c4807e84.b);
    }
}
