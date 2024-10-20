package defpackage;

import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JE0 extends FE0 {
    public JE0(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public JE0(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) {
        int i = this.g;
        if (i > j) {
            this.g = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        b((int) j);
    }
}
