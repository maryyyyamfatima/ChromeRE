package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GW0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(b.k());
    }
}
