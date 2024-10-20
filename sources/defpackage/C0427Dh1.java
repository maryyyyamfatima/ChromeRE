package defpackage;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0427Dh1 implements Callback {
    public final /* synthetic */ C0037Ah1 a;
    public final /* synthetic */ Callback g;

    public /* synthetic */ C0427Dh1(C0037Ah1 c0037Ah1, Callback callback) {
        this.a = c0037Ah1;
        this.g = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        int i;
        int i2;
        Bitmap bitmap = (Bitmap) obj;
        C0037Ah1 c0037Ah1 = this.a;
        boolean z = c0037Ah1.e;
        Callback callback = this.g;
        if (!z) {
            callback.onResult(bitmap);
            return;
        }
        if (bitmap != null && (i = c0037Ah1.c) > 0 && (i2 = c0037Ah1.d) > 0 && bitmap.getWidth() != i && bitmap.getHeight() != i2) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, i, i2, 2);
        }
        callback.onResult(bitmap);
    }
}
