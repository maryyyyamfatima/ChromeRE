package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yE3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11705yE3 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public AbstractC11705yE3() {
        if (C9267r74.a == null) {
            C9267r74.a = new C9267r74();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final void b(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.b.getShort(i2);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }
}
