package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import java.io.IOException;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3426a73 extends AbstractC1649Ms {
    public final /* synthetic */ Context h;
    public final /* synthetic */ Uri i;
    public final /* synthetic */ Callback j;

    public C3426a73(Activity activity, Uri uri, Callback callback) {
        this.h = activity;
        this.i = uri;
        this.j = callback;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Bitmap bitmap;
        ImageDecoder$Source createSource;
        try {
            ContentResolver contentResolver = this.h.getContentResolver();
            Uri uri = this.i;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                createSource = ImageDecoder.createSource(contentResolver, uri);
                bitmap = ImageDecoder.decodeBitmap(createSource);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            }
            if (i >= 26) {
                try {
                    if (AbstractC5832h73.b(bitmap)) {
                        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    }
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            bitmap = null;
        }
        new Handler(Looper.getMainLooper()).post(new Z63(this, bitmap));
        return null;
    }
}
