package defpackage;

import org.chromium.base.Callback;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3450aC implements Callback {
    public int a;
    public final /* synthetic */ m g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C3450aC(m mVar) {
        this.g = mVar;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m mVar = this.g;
        if (booleanValue) {
            this.a = mVar.s(0);
        } else {
            mVar.p.c(this.a);
        }
    }
}
