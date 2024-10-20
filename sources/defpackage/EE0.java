package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EE0 extends MediaDataSource {
    public long a;
    public final /* synthetic */ JE0 g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public EE0(JE0 je0) {
        this.g = je0;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            JE0 je0 = this.g;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + je0.available()) {
                    return -1;
                }
                je0.c(j);
                this.a = j;
            }
            if (i2 > je0.available()) {
                i2 = je0.available();
            }
            int read = je0.read(bArr, i, i2);
            if (read >= 0) {
                this.a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }
}
