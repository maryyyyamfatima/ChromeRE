package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11953yy implements InterfaceC11610xy {
    @Override // defpackage.InterfaceC11610xy
    public final void d(int i) {
    }

    @Override // defpackage.InterfaceC11610xy
    public final void e() {
    }

    @Override // defpackage.InterfaceC11610xy
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC11610xy
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC11610xy
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
