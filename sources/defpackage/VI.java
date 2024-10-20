package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VI {
    public static final Object e = new Object();
    public final TI a;
    public final Q83 b;
    public final boolean c;
    public final int d;

    public VI(boolean z, Q83 q83, TI ti, int i) {
        this.c = z;
        this.b = q83;
        this.a = ti;
        this.d = i;
    }

    public final void a() {
        synchronized (e) {
            if (this.c) {
                TI ti = this.a;
                ti.getClass();
                Iterator it = new ArrayList(Arrays.asList(AbstractC10717vN.a)).iterator();
                while (it.hasNext()) {
                    ((C7549m72) ti.a).d((String) it.next());
                }
                this.a.b();
                this.b.q(this.d, "channels_version_key");
            }
        }
    }
}
