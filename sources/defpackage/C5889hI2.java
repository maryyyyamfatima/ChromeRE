package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hI2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5889hI2 implements FaviconHelper$FaviconImageCallback {
    public final /* synthetic */ C10352uI2 a;
    public final /* synthetic */ GURL b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C10695vI2 d;

    public C5889hI2(C10695vI2 c10695vI2, C10352uI2 c10352uI2, GURL gurl, int i) {
        this.d = c10695vI2;
        this.a = c10352uI2;
        this.b = gurl;
        this.c = i;
    }

    @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
    public final void onFaviconAvailable(Bitmap bitmap, GURL gurl) {
        Drawable b;
        C10352uI2 c10352uI2 = this.a;
        if (this != c10352uI2.e) {
            return;
        }
        C10695vI2 c10695vI2 = this.d;
        C6964kR2 c6964kR2 = c10695vI2.k;
        Resources resources = c10695vI2.a.getResources();
        GURL gurl2 = this.b;
        if (gurl2 == null) {
            VH0 vh0 = c10695vI2.c;
            vh0.getClass();
            b = new BitmapDrawable(resources, vh0.b(resources, gurl2, true));
        } else {
            int i = c10695vI2.i;
            if (bitmap == null) {
                c6964kR2.getClass();
                b = new BitmapDrawable(resources, Bitmap.createScaledBitmap(c6964kR2.b(gurl2.i(), false), i, i, true));
            } else {
                b = AbstractC4855eI0.b(resources, Bitmap.createScaledBitmap(bitmap, i, i, true));
            }
        }
        ((C6233iI2) c10695vI2.h.get(Integer.valueOf(this.c))).a.put(gurl2, b);
        c10352uI2.c.setImageDrawable(b);
    }
}
