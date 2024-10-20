package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QI1 {
    public final Rect a;
    public final C8867py b;
    public int c;
    public Bitmap d;
    public PI1 e;
    public final Callback f;

    public QI1(C8867py c8867py, Rect rect, Callback callback) {
        this.a = rect;
        this.b = c8867py;
        this.f = callback;
    }

    public final void a() {
        float f;
        C8867py c8867py = this.b;
        if (c8867py == null) {
            b(2);
            return;
        }
        b(6);
        Rect rect = this.a;
        Runnable runnable = new Runnable() { // from class: NI1
            @Override // java.lang.Runnable
            public final void run() {
                QI1.this.b(2);
            }
        };
        Callback callback = new Callback() { // from class: OI1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                QI1 qi1 = QI1.this;
                qi1.d = bitmap;
                Callback callback2 = qi1.f;
                if (callback2 != null && bitmap != null) {
                    callback2.onResult(Integer.valueOf(bitmap.getAllocationByteCount()));
                }
                qi1.b(3);
            }
        };
        if (c8867py.g == 0.0f) {
            C8370oX2 c8370oX2 = c8867py.f;
            Tab tab = c8370oX2.a;
            if (tab.b() == null || c8370oX2.c.getWidth() == 0) {
                f = 1.0f;
            } else {
                C6600jN2 c6600jN2 = ((WebContentsImpl) tab.b()).m;
                f = ((int) Math.ceil(c6600jN2.a(c6600jN2.e))) / c8370oX2.c.getWidth();
            }
            c8867py.g = f;
        }
        c8867py.a.a.a(null, rect, c8867py.g, callback, runnable);
    }

    public final void b(int i) {
        this.c = i;
        PI1 pi1 = this.e;
        if (pi1 != null) {
            pi1.a(i);
        }
    }
}
