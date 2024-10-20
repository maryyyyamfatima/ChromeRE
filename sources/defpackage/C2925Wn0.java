package defpackage;

import android.os.Bundle;
import j$.util.function.Consumer;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2925Wn0 implements Callback {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C2925Wn0(Consumer consumer) {
        this.a = consumer;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.accept((Bundle) obj);
    }
}
