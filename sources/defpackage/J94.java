package defpackage;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J94 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public J94(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.limit();
    }
}
