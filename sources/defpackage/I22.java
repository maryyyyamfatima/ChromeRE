package defpackage;

import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class I22 implements Runnable {
    public final /* synthetic */ a a;

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        if (aVar.l) {
            aVar.l = false;
        } else {
            aVar.b(aVar.d());
        }
    }

    public I22(a aVar) {
        this.a = aVar;
    }
}
