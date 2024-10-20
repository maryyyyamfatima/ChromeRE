package defpackage;

import android.graphics.Bitmap;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hB */
/* loaded from: classes.dex */
public final class C5851hB implements LargeIconBridge.LargeIconCallback {
    public final /* synthetic */ XA a;
    public final /* synthetic */ C6195iB g;

    public C5851hB(C6195iB c6195iB, XA xa) {
        this.g = c6195iB;
        this.a = xa;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        Bitmap createScaledBitmap;
        XA xa = this.a;
        C6195iB c6195iB = this.g;
        if (bitmap == null) {
            c6195iB.e.e.setColor(i);
            C6964kR2 c6964kR2 = c6195iB.e;
            GURL gurl = xa.b;
            c6964kR2.getClass();
            createScaledBitmap = c6964kR2.b(gurl.i(), false);
        } else {
            int i3 = c6195iB.g;
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i3, true);
        }
        xa.f = createScaledBitmap;
        int i4 = c6195iB.h - 1;
        c6195iB.h = i4;
        if (i4 == 0) {
            c6195iB.a.a.add(c6195iB.b);
            c6195iB.c.c();
            c6195iB.d.a();
        }
    }
}
