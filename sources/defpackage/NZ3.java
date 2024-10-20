package defpackage;

import J.N;
import java.net.URISyntaxException;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NZ3 extends GURL {
    public NZ3(String str) {
        super(str);
        if (!this.b) {
            throw new URISyntaxException(str, "Uri could not be parsed as a valid GURL");
        }
    }

    public NZ3() {
    }

    @Override // org.chromium.url.GURL
    public final GURL e() {
        NZ3 nz3 = new NZ3();
        N.MNBd3mFA(this.a, this.b, this.c.c(), nz3);
        return nz3;
    }

    public final String toString() {
        return this.a;
    }
}
