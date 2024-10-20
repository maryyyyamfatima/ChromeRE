package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WN1 implements ImageDownloadCallback {
    public WebContents a;
    public final int b;
    public int c = -1;
    public VN1 d = null;
    public GURL e;

    public WN1(int i) {
        this.b = i;
    }

    @Override // org.chromium.content_public.browser.ImageDownloadCallback
    public final void a(int i, List list, List list2) {
        if (i != this.c) {
            return;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        double d = 0.0d;
        Bitmap bitmap = null;
        while (it.hasNext() && it2.hasNext()) {
            Bitmap bitmap2 = (Bitmap) it.next();
            double b = b((Rect) it2.next());
            if (d < b) {
                bitmap = bitmap2;
                d = b;
            }
        }
        ER1 er1 = (ER1) this.d;
        er1.getClass();
        Bitmap a = AbstractC7292lO1.a(bitmap);
        er1.f = a;
        er1.g = null;
        if (er1.h != a) {
            er1.h = a;
            if (!er1.g()) {
                C7636mO1 c7636mO1 = er1.k;
                c7636mO1.g = er1.h;
                c7636mO1.i = er1.f;
                er1.i();
            }
        }
        this.c = -1;
        this.d = null;
    }

    public final double b(Rect rect) {
        int max = Math.max(rect.width(), rect.height());
        double d = 0.8d;
        if (max != 0) {
            if (max < 114) {
                d = 0.0d;
            } else {
                int i = this.b;
                d = max <= i ? (((max - 114) * 0.8d) / (i - 114)) + 0.2d : (i * 1.0d) / max;
            }
        }
        int width = rect.width();
        int height = rect.height();
        return (Math.min(width, height) / Math.max(width, height)) * d;
    }
}
