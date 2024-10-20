package defpackage;

import J.N;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202Bo1 extends AbstractC7584mE {
    public final int c;

    public C0202Bo1(int i, String str, String str2) {
        super(str, str2);
        this.c = i;
    }

    public final int c() {
        String b = b();
        int i = this.c;
        C8615pE c8615pE = CachedFeatureFlags.d;
        c8615pE.c();
        CachedFeatureFlags.c.getClass();
        Q74 q74 = CachedFeatureFlags.b;
        synchronized (q74.c) {
            Integer num = (Integer) q74.c.get(b);
            if (num == null) {
                c8615pE.b();
                Integer valueOf = Integer.valueOf(O83.a.f(i, b));
                q74.c.put(b, valueOf);
                return valueOf.intValue();
            }
            return num.intValue();
        }
    }

    @Override // defpackage.AbstractC7584mE
    public final void a() {
        C7928nE c7928nE = UN.a;
        O83.a.q(N.M37SqSAy(this.a, this.b, this.c), b());
    }
}
