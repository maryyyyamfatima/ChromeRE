package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HA0 {
    public final PA0 a;
    public final byte[] b;

    public HA0(PA0 pa0, byte[] bArr) {
        if (pa0 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = pa0;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HA0)) {
            return false;
        }
        HA0 ha0 = (HA0) obj;
        if (this.a.equals(ha0.a)) {
            return Arrays.equals(this.b, ha0.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return AbstractC4199cO1.a("EncodedPayload{encoding=", String.valueOf(this.a), ", bytes=[...]}");
    }
}
