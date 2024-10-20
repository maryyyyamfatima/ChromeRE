package defpackage;

import J.N;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R73 {
    public final C5858hC1 a;
    public C6862k73 b;
    public EP c;
    public GURL d;
    public boolean e;
    public boolean f;

    public R73(C6862k73 c6862k73, EP ep, C5858hC1 c5858hC1) {
        this.a = c5858hC1;
        b(c6862k73, ep);
    }

    public final void b(C6862k73 c6862k73, EP ep) {
        GURL gurl;
        this.b = c6862k73;
        this.c = ep;
        this.d = ep.e;
        C7928nE c7928nE = UN.a;
        this.e = N.M09VlOh_("PreemptiveLinkToTextGeneration") && this.a != null && ep.j == 3;
        this.f = (this.c.j == 0 || (gurl = this.d) == null || gurl.k()) ? false : true;
    }

    public final C6862k73 a(int i) {
        C6862k73 c6862k73;
        if (this.e) {
            C5858hC1 c5858hC1 = this.a;
            return (i != 0 || (c6862k73 = c5858hC1.m) == null) ? c5858hC1.n : c6862k73;
        }
        if (this.f) {
            if (i == 0) {
                this.b.e = this.d.i();
            } else {
                this.b.e = null;
            }
        }
        return this.b;
    }
}
