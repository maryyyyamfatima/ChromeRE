package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.components.page_info.PageInfoController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2502Tg2 implements Callback {
    public final /* synthetic */ C3152Yg2 a;

    public /* synthetic */ C2502Tg2(C3152Yg2 c3152Yg2) {
        this.a = c3152Yg2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C3152Yg2 c3152Yg2 = this.a;
        if (c3152Yg2.l != null) {
            ((PageInfoController) c3152Yg2.h).g(booleanValue ? 12 : 11);
            long j = c3152Yg2.l.a;
            if (j != 0) {
                N.MTF7msU_(j, booleanValue);
            }
        }
    }
}
