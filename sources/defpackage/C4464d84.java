package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4464d84 implements Callback {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ C4807e84 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C4464d84(C4807e84 c4807e84, Callback callback) {
        this.g = c4807e84;
        this.a = callback;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        String str = (String) obj;
        this.g.b = str;
        this.a.onResult(str);
    }
}
