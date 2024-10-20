package defpackage;

import android.graphics.Bitmap;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RH0 implements SH0 {
    public final /* synthetic */ GURL a;
    public final /* synthetic */ SH0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TH0 d;

    public RH0(TH0 th0, GURL gurl, SH0 sh0, boolean z) {
        this.d = th0;
        this.a = gurl;
        this.b = sh0;
        this.c = z;
    }

    @Override // defpackage.SH0
    public final void a(int i, Bitmap bitmap) {
        SH0 sh0 = this.b;
        GURL gurl = this.a;
        TH0 th0 = this.d;
        if (bitmap != null) {
            th0.a.put(gurl, Integer.valueOf(i));
            sh0.a(i, bitmap);
        } else {
            if (i == 1) {
                th0.a(2, this, gurl);
                return;
            }
            if (i == 2) {
                th0.a.put(gurl, 3);
                if (this.c) {
                    th0.a(3, this, gurl);
                    return;
                }
            }
            sh0.a(0, null);
        }
    }
}
