package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9069qa0 implements EX {
    public final Hr4 a;

    @Override // defpackage.EX
    public final boolean isEnabled() {
        return true;
    }

    public C9069qa0(Context context, Hr4 hr4) {
        AbstractC0087Ar1.e(context, "context");
        this.a = hr4;
    }

    @Override // defpackage.EX
    public final FX a(int i) {
        return new C9411ra0(this.a, i);
    }
}
