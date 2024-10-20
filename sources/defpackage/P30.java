package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.ThreadUtils;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P30 implements G22 {
    public final O30 a;
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public P30(O30 o30) {
        this.a = o30;
    }

    @Override // defpackage.G22
    public final void b(int i) {
        if (NetworkChangeNotifier.b()) {
            NetworkChangeNotifier.g(this);
            Object obj = ThreadUtils.a;
            this.h.set(false);
            new N30(this).c(AbstractC0185Bl.e);
        }
    }
}
