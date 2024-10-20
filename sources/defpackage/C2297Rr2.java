package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2297Rr2 implements Callback {
    public final /* synthetic */ AbstractC4368cs2 a;

    public /* synthetic */ C2297Rr2(AbstractC4368cs2 abstractC4368cs2) {
        this.a = abstractC4368cs2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        AbstractC4368cs2 abstractC4368cs2 = this.a;
        abstractC4368cs2.getClass();
        if (((Boolean) obj).booleanValue()) {
            abstractC4368cs2.l();
            abstractC4368cs2.l = true;
        } else if (abstractC4368cs2.l) {
            abstractC4368cs2.a();
        }
    }
}
