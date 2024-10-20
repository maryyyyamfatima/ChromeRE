package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10006tI extends AbstractC0380Cy {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC6098hu1.a);

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return -670243078;
    }

    @Override // defpackage.AbstractC0380Cy
    public final Bitmap c(InterfaceC11610xy interfaceC11610xy, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC10075tV3.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? AbstractC10075tV3.b(interfaceC11610xy, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        return obj instanceof C10006tI;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
