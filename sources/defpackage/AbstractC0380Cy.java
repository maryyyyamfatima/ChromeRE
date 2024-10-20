package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0380Cy implements InterfaceC9389rV3 {
    public abstract Bitmap c(InterfaceC11610xy interfaceC11610xy, Bitmap bitmap, int i, int i2);

    @Override // defpackage.InterfaceC9389rV3
    public final JO2 b(BZ0 bz0, JO2 jo2, int i, int i2) {
        if (!AbstractC10296u74.g(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC11610xy interfaceC11610xy = a.b(bz0).a;
        Bitmap bitmap = (Bitmap) jo2.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(interfaceC11610xy, bitmap, i, i2);
        return bitmap.equals(c) ? jo2 : C12296zy.c(c, interfaceC11610xy);
    }
}
