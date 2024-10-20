package defpackage;

import J.N;
import android.graphics.Point;
import android.util.Size;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabService;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8867py {
    public KI1 a;
    public LongScreenshotsTabService b;
    public final Tab c;
    public final C5513gC0 d;
    public final KH e = new KH();
    public final C8370oX2 f;
    public float g;

    public C8867py(Tab tab, C8370oX2 c8370oX2, C5513gC0 c5513gC0) {
        this.c = tab;
        this.f = c8370oX2;
        this.d = c5513gC0;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [oy] */
    public final void a(int i, long j) {
        if (i == 1 && this.a == null) {
            GURL emptyGURL = GURL.emptyGURL();
            LongScreenshotsTabService longScreenshotsTabService = this.b;
            ?? r7 = new Callback() { // from class: oy
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int intValue = ((Integer) obj).intValue();
                    C8867py c8867py = C8867py.this;
                    if (intValue == 0) {
                        KI1 ki1 = c8867py.a;
                        Size size = ki1.c;
                        C8370oX2 c8370oX2 = c8867py.f;
                        c8370oX2.c = size;
                        c8370oX2.d = ki1.d;
                    }
                    C6201iC0 c6201iC0 = c8867py.d.a;
                    if (intValue == 13 || intValue == 14) {
                        c6201iC0.d(1);
                        ZI1.a(6);
                        return;
                    }
                    if (intValue != 0) {
                        c6201iC0.d(2);
                        ZI1.a(7);
                        return;
                    }
                    c6201iC0.d(4);
                    ZI1.a(5);
                    KI1 ki12 = c6201iC0.c.a;
                    Size size2 = ki12 == null ? null : ki12.c;
                    Point point = ki12 != null ? ki12.d : null;
                    Iterator it = c6201iC0.d.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            return;
                        } else {
                            ((InterfaceC5857hC0) c11814ya2.next()).b(size2, point);
                        }
                    }
                }
            };
            this.e.getClass();
            this.a = new KI1(emptyGURL, longScreenshotsTabService, j, r7);
            return;
        }
        this.b.getClass();
        if (j != 0) {
            N.Mj0DaLs7(j);
        }
        EI2.h(i, 10, "Sharing.LongScreenshots.BitmapGenerationStatus");
        C6201iC0 c6201iC0 = this.d.a;
        if (i == 7) {
            c6201iC0.d(1);
            ZI1.a(4);
        } else if (i != 1) {
            c6201iC0.d(2);
            ZI1.a(3);
        }
    }
}
