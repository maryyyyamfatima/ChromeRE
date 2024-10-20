package defpackage;

import org.chromium.base.Callback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7232lC1 implements Callback {
    public final /* synthetic */ Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C7232lC1(Callback callback) {
        this.a = callback;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.onResult(((GURL) obj).i());
    }
}
