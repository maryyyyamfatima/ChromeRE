package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cy3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4404cy3 implements Callback {
    public final /* synthetic */ Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.onResult(((C4747dy3) obj).a);
    }
}
