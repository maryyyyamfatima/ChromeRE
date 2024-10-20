package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.chromium.base.Callback;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.WatcherImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2199Qy implements InterfaceC1160Iy {
    public final OutputStream g;
    public long i;
    public long j;
    public C7043kg0 k;
    public Callback l;
    public final ByteBuffer a = ByteBuffer.allocateDirect(65536);
    public final long h = 52428800;

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C2199Qy(FileOutputStream fileOutputStream) {
        this.g = fileOutputStream;
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        if (this.l == null) {
            return;
        }
        e(hy1.a, "Connection error detected.");
    }

    @Override // defpackage.InterfaceC1160Iy
    public final void d0(long j, long j2) {
        if (this.l == null) {
            return;
        }
        if (j2 > this.h) {
            e(8, "Stream exceeds permitted size");
            return;
        }
        this.i = j2;
        if (this.j < j2) {
            AbstractC10647v90.a.getClass();
            new WatcherImpl().a(this.k, C7215l90.c, new C2069Py(this));
            return;
        }
        try {
            this.g.close();
            this.l.onResult(0);
            this.l = null;
        } catch (IOException unused) {
            e(1, "Failed to close stream.");
        }
    }

    @Override // defpackage.InterfaceC1160Iy
    public final void X0(int i, long j) {
        if (this.l == null) {
            return;
        }
        c();
    }

    public final void c() {
        long intValue;
        long j;
        OutputStream outputStream = this.g;
        ByteBuffer byteBuffer = this.a;
        do {
            try {
                C7043kg0 c7043kg0 = this.k;
                C6699jg0 c6699jg0 = C6699jg0.c;
                ResultAnd b = c7043kg0.b(byteBuffer);
                int i = b.a;
                if (i == 17) {
                    return;
                }
                if (i != 0) {
                    e(i, "Failed to read from blob.");
                    return;
                }
                Integer num = (Integer) b.b;
                if (num.intValue() <= 0) {
                    e(17, "No data available");
                    return;
                }
                try {
                    outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset(), num.intValue());
                    intValue = this.j + num.intValue();
                    this.j = intValue;
                    j = this.i;
                } catch (IOException unused) {
                    e(15, "Failed to write to stream.");
                    return;
                }
            } catch (HY1 e) {
                e(e.a, "Failed to receive blob.");
                return;
            }
        } while (intValue < j);
        if (intValue != j) {
            e(11, "Received more bytes than expected size.");
            return;
        }
        try {
            outputStream.close();
            this.l.onResult(0);
            this.l = null;
        } catch (IOException unused2) {
            e(1, "Failed to close stream.");
        }
    }

    public final void e(int i, String str) {
        if (i == 0) {
            i = 3;
        }
        AbstractC4851eH1.f("share", str, new Object[0]);
        AbstractC2663Um3.a(this.g);
        this.l.onResult(Integer.valueOf(i));
        this.l = null;
    }
}
