package defpackage;

import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216Jj0 implements InterfaceC1086Ij0 {
    public final InputStream a;

    public C1216Jj0(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final short b() {
        int read = this.a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new C0956Hj0();
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final int a() {
        return (b() << 8) | b();
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final int c(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0956Hj0();
        }
        return i2;
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final long skip(long j) {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.a;
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }
}
