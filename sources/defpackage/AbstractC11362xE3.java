package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xE3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11362xE3 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    public final AbstractC7895n74 e = AbstractC7895n74.d();

    public final int b(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int a(int i) {
        return this.b.getInt(i) + i;
    }

    public final String d(int i) {
        ByteBuffer byteBuffer = this.b;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        return this.e.a(byteBuffer, i2 + 4, i3);
    }

    public final int g(int i) {
        int i2 = i + this.a;
        return this.b.getInt(this.b.getInt(i2) + i2);
    }

    public final int e(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2) + i2 + 4;
    }

    public final ByteBuffer f(int i) {
        int b = b(i);
        if (b == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int e = e(b);
        order.position(e);
        order.limit((g(b) * 1) + e);
        return order;
    }

    public final void c(int i, ByteBuffer byteBuffer) {
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
