package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RB0 {
    public static final RB0 b = new RB0(AbstractC8868py0.a);
    public final byte[] a;

    public static RB0 a(C7188l43 c7188l43) {
        try {
            DV h = DV.h(c7188l43.a.duplicate(), false);
            if (h.e()) {
                return b;
            }
            h.B();
            return new RB0(h.l());
        } catch (IOException e) {
            throw new C10239ty0("Error reading extension from model", e);
        }
    }

    public final C7188l43 b(int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boolean z = KV.b;
            JV jv = new JV(4096, byteArrayOutputStream);
            jv.c0(i, this.a);
            jv.Z();
            return C7188l43.a(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new C10239ty0("Error adding extension to model", e);
        }
    }

    public RB0(byte[] bArr) {
        this.a = bArr;
    }
}
