package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LN2 implements Callback {
    public final /* synthetic */ Callback a = null;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Integer num = (Integer) obj;
        Callback callback = this.a;
        if (callback != null) {
            callback.onResult(num);
        }
    }
}
