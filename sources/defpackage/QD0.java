package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QD0 {
    public HashMap a;
    public HashMap b;

    public final void a(PD0 pd0) {
        if (pd0 == null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            if (this.b == null) {
                this.b = new HashMap();
            }
            String str = pd0.a;
            if (str != null) {
                this.a.put(str, pd0);
            }
        }
    }
}
