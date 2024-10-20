package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ty, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10238ty implements RO2 {
    public final C11953yy a = new C11953yy();

    @Override // defpackage.RO2
    public final /* bridge */ /* synthetic */ boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return true;
    }

    @Override // defpackage.RO2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C12296zy b(ImageDecoder$Source imageDecoder$Source, int i, int i2, C0543Ee2 c0543Ee2) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(imageDecoder$Source, new C7411lk0(i, i2, c0543Ee2));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C12296zy(decodeBitmap, this.a);
    }
}
