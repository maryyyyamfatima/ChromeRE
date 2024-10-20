package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10400uS0 extends FilterInputStream {
    public AbstractC10400uS0(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
