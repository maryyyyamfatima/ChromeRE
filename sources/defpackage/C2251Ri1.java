package defpackage;

import android.text.TextUtils;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ri1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2251Ri1 implements Callback {
    public final /* synthetic */ Callback a;

    public /* synthetic */ C2251Ri1(Callback callback) {
        this.a = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C10307u93 c10307u93 = (C10307u93) obj;
        Callback callback = this.a;
        if (c10307u93 == null || TextUtils.isEmpty(c10307u93.p.d)) {
            callback.onResult(null);
        } else {
            callback.onResult(c10307u93.p.d);
        }
    }
}
