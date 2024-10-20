package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.services.media_session.MediaImage;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BR1 extends QR1 {
    public final /* synthetic */ ER1 b;

    @Override // defpackage.QR1
    public final void a(HashSet hashSet) {
        ER1 er1 = this.b;
        er1.p = hashSet;
        if (er1.g()) {
            return;
        }
        er1.k.n = er1.p;
        er1.i();
    }

    @Override // defpackage.QR1
    public final void b(List list) {
        MediaImage mediaImage;
        double d;
        double d2;
        ER1 er1 = this.b;
        WN1 wn1 = er1.e;
        if (wn1.a != null) {
            wn1.d = er1;
            if (list == null) {
                mediaImage = null;
            } else {
                Iterator it = list.iterator();
                mediaImage = null;
                double d3 = 0.0d;
                while (it.hasNext()) {
                    MediaImage mediaImage2 = (MediaImage) it.next();
                    if (mediaImage2 == null) {
                        d2 = 0.0d;
                    } else {
                        List list2 = mediaImage2.c;
                        if (list2.isEmpty()) {
                            d2 = 0.4d;
                        } else {
                            Iterator it2 = list2.iterator();
                            double d4 = 0.0d;
                            while (it2.hasNext()) {
                                d4 = Math.max(d4, wn1.b((Rect) it2.next()));
                            }
                            String a = AbstractC7974nN0.a(mediaImage2.a.i());
                            if (!"bmp".equals(a)) {
                                String str = mediaImage2.b;
                                if (!"image/bmp".equals(str)) {
                                    if ("gif".equals(a) || "image/gif".equals(str)) {
                                        d = 0.3d;
                                    } else if ("icon".equals(a) || "image/x-icon".equals(str)) {
                                        d = 0.4d;
                                    } else if ("png".equals(a) || "image/png".equals(str)) {
                                        d = 1.0d;
                                    } else {
                                        d = ("jpeg".equals(a) || "jpg".equals(a) || "image/jpeg".equals(str)) ? 0.7d : 0.6d;
                                    }
                                    d2 = d * d4;
                                }
                            }
                            d = 0.5d;
                            d2 = d * d4;
                        }
                    }
                    if (d2 > d3) {
                        mediaImage = mediaImage2;
                        d3 = d2;
                    }
                }
            }
            if (mediaImage == null) {
                wn1.e = null;
                ER1 er12 = (ER1) wn1.d;
                er12.getClass();
                Bitmap a2 = AbstractC7292lO1.a(null);
                er12.f = a2;
                er12.g = null;
                if (er12.h != a2) {
                    er12.h = a2;
                    if (!er12.g()) {
                        C7636mO1 c7636mO1 = er12.k;
                        c7636mO1.g = er12.h;
                        c7636mO1.i = er12.f;
                        er12.i();
                    }
                }
                wn1.c = -1;
                wn1.d = null;
            } else {
                GURL gurl = wn1.e;
                GURL gurl2 = mediaImage.a;
                if (!gurl2.equals(gurl)) {
                    wn1.e = gurl2;
                    wn1.c = wn1.a.j(gurl2, wn1);
                }
            }
        }
        ER1.a(er1);
    }

    @Override // defpackage.QR1
    public final void d(MediaMetadata mediaMetadata) {
        ER1 er1 = this.b;
        er1.n = mediaMetadata;
        ER1.a(er1);
    }

    @Override // defpackage.QR1
    public final void e(MediaPosition mediaPosition) {
        ER1 er1 = this.b;
        er1.q = mediaPosition;
        if (er1.g()) {
            return;
        }
        er1.k.o = er1.q;
        er1.i();
    }

    @Override // defpackage.QR1
    public final void c() {
        ER1 er1 = this.b;
        if (er1.c != null) {
            Runnable runnable = er1.s;
            if (runnable != null) {
                er1.r.removeCallbacks(runnable);
                er1.s = null;
            }
            er1.f();
            er1.k = null;
        }
        er1.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BR1(ER1 er1, MediaSessionImpl mediaSessionImpl) {
        super(mediaSessionImpl);
        this.b = er1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0129, code lost:            if (r4 == false) goto L252;     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.QR1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BR1.f(boolean, boolean):void");
    }
}
