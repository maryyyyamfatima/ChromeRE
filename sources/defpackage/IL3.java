package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IL3 implements NL3 {
    public static final Object h = new Object();
    public final C6461iy a;
    public final int b;
    public final C5210fK1 c = new C5210fK1(100);
    public final ArrayDeque d = new ArrayDeque();
    public ML3 e;
    public final FL3 f;
    public int g;

    public IL3(C1241Jo0 c1241Jo0) {
        Object obj = ThreadUtils.a;
        this.a = new C6461iy(c1241Jo0, 15728640);
        this.f = new FL3(this, new ThumbnailGenerator());
        this.b = 0;
    }

    public final Bitmap a(int i, String str) {
        Bitmap a = this.a.a(String.format(Locale.US, "id=%s, size=%d", str, Integer.valueOf(i)));
        int i2 = this.b;
        EI2.b("Android.ThumbnailProvider.CachedBitmap.Found.".concat(i2 != 0 ? i2 != 1 ? "Other" : "NTPSnippets" : "DownloadHome"), a != null);
        return a;
    }

    public final void b(Bitmap bitmap, String str) {
        int i;
        ML3 ml3 = this.e;
        if (ml3 == null) {
            return;
        }
        if (bitmap != null) {
            this.a.c(bitmap, String.format(Locale.US, "id=%s, size=%d", str, Integer.valueOf(ml3.c)));
            C5210fK1 c5210fK1 = this.c;
            c5210fK1.getClass();
            AbstractC0087Ar1.e(str, "key");
            synchronized (c5210fK1.c) {
                C5554gK1 c5554gK1 = c5210fK1.b;
                c5554gK1.getClass();
                Object remove = c5554gK1.a.remove(str);
                if (remove != null) {
                    c5210fK1.d -= c5210fK1.d(str, remove);
                }
            }
            this.e.b(bitmap);
            int i2 = this.g;
            C6119hy b = this.a.b();
            synchronized (b.c) {
                i = b.d;
            }
            this.g = Math.max(i2, i);
        } else {
            this.c.c(str, h);
            this.e.b(null);
        }
        this.e = null;
        PostTask.c(AbstractC5103f04.a, new GL3(this));
    }
}
