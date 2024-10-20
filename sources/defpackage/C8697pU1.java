package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pU1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8697pU1 {
    public final ByteBuffer a;
    public final List b;
    public C10620v43 c;

    public C8697pU1(ByteBuffer byteBuffer, List list) {
        this.a = byteBuffer;
        this.b = list;
    }

    public C10620v43 a() {
        if (this.c == null) {
            this.c = new C10620v43(this, new C5953hV1(this));
        }
        return this.c;
    }
}
