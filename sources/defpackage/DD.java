package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DD implements RO2 {
    public final C8840pt0 a;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        this.a.getClass();
        return true;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        C8840pt0 c8840pt0 = this.a;
        List list = c8840pt0.d;
        return c8840pt0.a(new C2636Uh1(c8840pt0.c, (ByteBuffer) obj, list), i, i2, c0543Ee2, C8840pt0.k);
    }

    public DD(C8840pt0 c8840pt0) {
        this.a = c8840pt0;
    }
}
