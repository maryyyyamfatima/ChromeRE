package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class ZE implements Runnable {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ Object g;

    public /* synthetic */ ZE(Callback callback, Object obj) {
        this.a = callback;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onResult(this.g);
    }
}
