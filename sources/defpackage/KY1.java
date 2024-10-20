package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KY1 extends AbstractC10400uS0 {
    public static final /* synthetic */ int g = 0;
    public final List a;

    public KY1(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.a = arrayList;
        AbstractC5778gy2.a(inputStream != null, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        return read;
    }

    @Override // defpackage.AbstractC10400uS0, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            X5.a(it.next());
            try {
                throw null;
                break;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }
}
