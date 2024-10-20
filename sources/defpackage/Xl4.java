package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Xl4 {
    public final LargeIconBridge a;
    public final ImageFetcher b;

    public Xl4(LargeIconBridge largeIconBridge, ImageFetcher imageFetcher) {
        this.a = largeIconBridge;
        this.b = imageFetcher;
    }

    public final void a(int i, int i2, GURL gurl, GURL gurl2, Callback callback) {
        final Wl4 wl4 = new Wl4(this);
        wl4.b = i;
        wl4.c = i2;
        wl4.a = gurl;
        wl4.d = callback;
        if (gurl2 != null && gurl2.b) {
            String i3 = gurl2.i();
            int i4 = wl4.b;
            this.b.d(C0037Ah1.a(i4, i3, i4, "Feed"), new Callback() { // from class: Vl4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    Wl4 wl42 = Wl4.this;
                    if (bitmap == null) {
                        wl42.e.a.b(wl42.a, wl42.b, new Ul4(wl42));
                    } else {
                        wl42.d.onResult(bitmap);
                    }
                }
            });
            return;
        }
        this.a.b(gurl, i, new Ul4(wl4));
    }
}
