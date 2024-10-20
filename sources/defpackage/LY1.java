package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LY1 extends DS0 {
    public static final /* synthetic */ int g = 0;
    public final List a;

    public LY1(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.a = arrayList;
        AbstractC5778gy2.a(outputStream != null, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }

    @Override // defpackage.DS0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            int length = bArr.length;
            throw null;
        }
    }

    @Override // defpackage.DS0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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
