package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9663sI extends AbstractC0380Cy {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC6098hu1.a);

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return -599754482;
    }

    @Override // defpackage.AbstractC0380Cy
    public final Bitmap c(InterfaceC11610xy interfaceC11610xy, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC10075tV3.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap c = interfaceC11610xy.c(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        c.setHasAlpha(bitmap.hasAlpha());
        AbstractC10075tV3.a(bitmap, c, matrix);
        return c;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        return obj instanceof C9663sI;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
