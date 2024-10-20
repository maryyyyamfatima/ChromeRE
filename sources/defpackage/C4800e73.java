package defpackage;

import android.text.TextUtils;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4800e73 implements Callback {
    public final Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            this.a.onResult(null);
        } else {
            new C4457d73(this, str).c(AbstractC0185Bl.e);
        }
    }

    public C4800e73(C2745Vd0 c2745Vd0) {
        this.a = c2745Vd0;
    }
}
