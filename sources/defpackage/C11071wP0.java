package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11071wP0 extends AbstractC0380Cy {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC6098hu1.a);

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return 1572326941;
    }

    @Override // defpackage.AbstractC0380Cy
    public final Bitmap c(InterfaceC11610xy interfaceC11610xy, Bitmap bitmap, int i, int i2) {
        return AbstractC10075tV3.b(interfaceC11610xy, bitmap, i, i2);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        return obj instanceof C11071wP0;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
