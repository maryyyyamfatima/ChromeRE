package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6744jn3 extends ByteArrayOutputStream {
    public final /* synthetic */ C7088kn3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6744jn3(C7088kn3 c7088kn3, int i) {
        super(i);
        this.a = c7088kn3;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.g.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
