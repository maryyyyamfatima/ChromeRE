package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CE2 extends Z50 {
    public static final CE2 b = new CE2(C7193l52.a);
    public final AtomicReference a;

    public CE2(C7193l52 c7193l52) {
        this.a = new AtomicReference(c7193l52);
    }

    @Override // defpackage.Z50
    public final boolean c(String str, Level level, boolean z) {
        return ((Z50) this.a.get()).c(str, level, z);
    }

    @Override // defpackage.Z50
    public final ME3 b() {
        return ((Z50) this.a.get()).b();
    }

    @Override // defpackage.Z50
    public final AbstractC10078tW1 a() {
        return ((Z50) this.a.get()).a();
    }
}
