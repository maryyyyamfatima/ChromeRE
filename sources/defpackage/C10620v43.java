package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v43, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10620v43 extends C8697pU1 {
    public final C5953hV1 d;
    public C8697pU1 e;

    @Override // defpackage.C8697pU1
    public final C10620v43 a() {
        return this;
    }

    public C10620v43(C8697pU1 c8697pU1, C5953hV1 c5953hV1) {
        super(c8697pU1.a, c8697pU1.b);
        this.d = c5953hV1;
    }

    public final C8697pU1 b() {
        if (this.e == null) {
            ByteBuffer slice = ((ByteBuffer) this.a.position(this.d.a.a)).slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            this.e = new C8697pU1(slice, this.b);
        }
        return this.e;
    }
}
