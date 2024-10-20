package defpackage;

import J.N;
import android.os.SystemClock;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RK3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ C5561gL3 h;

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.h;
        if (c5561gL3.i != 0) {
            c5561gL3.d();
        }
        ImeAdapterImpl imeAdapterImpl = c5561gL3.e;
        imeAdapterImpl.h();
        if (imeAdapterImpl.f()) {
            N.M1qwlrOP(imeAdapterImpl.a, imeAdapterImpl, null, 7, 0, SystemClock.uptimeMillis(), 229, 0, false, 0);
            N.Mvb046o_(imeAdapterImpl.a, imeAdapterImpl, this.a, this.g);
            N.M1qwlrOP(imeAdapterImpl.a, imeAdapterImpl, null, 9, 0, SystemClock.uptimeMillis(), 229, 0, false, 0);
        }
    }

    public RK3(C5561gL3 c5561gL3, int i, int i2) {
        this.h = c5561gL3;
        this.a = i;
        this.g = i2;
    }
}
