package defpackage;

import J.N;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TK3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ C5561gL3 h;

    @Override // java.lang.Runnable
    public final void run() {
        ImeAdapterImpl imeAdapterImpl = this.h.e;
        if (imeAdapterImpl.f()) {
            N.MmtjCblb(imeAdapterImpl.a, imeAdapterImpl, this.a, this.g);
        }
    }

    public TK3(C5561gL3 c5561gL3, int i, int i2) {
        this.h = c5561gL3;
        this.a = i;
        this.g = i2;
    }
}
