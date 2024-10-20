package defpackage;

import J.N;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UK3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ C5561gL3 h;

    @Override // java.lang.Runnable
    public final void run() {
        ImeAdapterImpl imeAdapterImpl = this.h.e;
        if (imeAdapterImpl.f()) {
            int i = this.a;
            int i2 = this.g;
            if (i <= i2) {
                N.M8ty0WHb(imeAdapterImpl.a, imeAdapterImpl, i, i2);
            } else {
                N.M8ty0WHb(imeAdapterImpl.a, imeAdapterImpl, i2, i);
            }
        }
    }

    public UK3(C5561gL3 c5561gL3, int i, int i2) {
        this.h = c5561gL3;
        this.a = i;
        this.g = i2;
    }
}
