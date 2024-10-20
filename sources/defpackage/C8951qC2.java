package defpackage;

import org.chromium.base.Callback;
import org.chromium.components.signin.base.AccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qC2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8951qC2 implements Callback {
    public final /* synthetic */ C10322uC2 a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.d((AccountInfo) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
