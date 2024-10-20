package defpackage;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7816mu1 {
    public final KeyPair a;
    public final long b;

    public C7816mu1(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7816mu1)) {
            return false;
        }
        C7816mu1 c7816mu1 = (C7816mu1) obj;
        if (this.b != c7816mu1.b) {
            return false;
        }
        KeyPair keyPair = this.a;
        PublicKey publicKey = keyPair.getPublic();
        KeyPair keyPair2 = c7816mu1.a;
        return publicKey.equals(keyPair2.getPublic()) && keyPair.getPrivate().equals(keyPair2.getPrivate());
    }

    public final int hashCode() {
        KeyPair keyPair = this.a;
        return Arrays.hashCode(new Object[]{keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.b)});
    }
}
