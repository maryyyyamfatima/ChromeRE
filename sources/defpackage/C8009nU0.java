package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8009nU0 {
    public final C7665mU0 a = new C7665mU0();
    public ByteBuffer b = null;
    public Bitmap c = null;

    public final ByteBuffer a() {
        Bitmap bitmap = this.c;
        if (bitmap == null) {
            return this.b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.c.getHeight();
        int i = width * height;
        this.c.getPixels(new int[i], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((Color.blue(r9[i2]) * 0.114f) + (Color.green(r9[i2]) * 0.587f) + (Color.red(r9[i2]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }
}
