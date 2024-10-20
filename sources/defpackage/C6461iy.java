package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6461iy {
    public static final HashMap d = new HashMap();
    public static int e;
    public final int a;
    public C1111Io0 b;
    public final C1241Jo0 c;

    public C6461iy(C1241Jo0 c1241Jo0, int i) {
        Object obj = ThreadUtils.a;
        this.c = c1241Jo0;
        this.a = i;
        this.b = c1241Jo0.a(new C6119hy(i));
    }

    public final Bitmap a(String str) {
        Object obj = ThreadUtils.a;
        if (this.b == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) b().b(str);
        int i = e + 1;
        e = i;
        if (i >= d.size()) {
            e = 0;
            Looper.myQueue().addIdleHandler(new C5775gy());
        }
        return bitmap;
    }

    public final void c(Bitmap bitmap, String str) {
        Object obj = ThreadUtils.a;
        if (bitmap == null || this.b == null) {
            return;
        }
        if (!SysUtils.isLowEndDevice()) {
            b().c(str, bitmap);
        }
        int i = e + 1;
        e = i;
        HashMap hashMap = d;
        if (i >= hashMap.size()) {
            e = 0;
            Looper.myQueue().addIdleHandler(new C5775gy());
        }
        hashMap.put(str, new WeakReference(bitmap));
    }

    public final C6119hy b() {
        C6119hy c6119hy = (C6119hy) this.b.a;
        if (c6119hy != null) {
            return c6119hy;
        }
        C6119hy c6119hy2 = new C6119hy(this.a);
        this.b = this.c.a(c6119hy2);
        return c6119hy2;
    }
}
