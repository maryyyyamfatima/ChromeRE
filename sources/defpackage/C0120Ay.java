package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ay, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0120Ay extends AbstractC0185Bl {
    public final LruCache h;
    public final String i;
    public final int j;
    public final Bitmap k;
    public final String l;
    public final float m;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (h()) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bitmap);
        this.h.put(this.i, new C9533ru2(arrayList, this.l, this.m));
    }

    public C0120Ay(LruCache lruCache, Bitmap bitmap, String str, String str2, int i, float f) {
        this.h = lruCache;
        this.i = str;
        this.j = i;
        this.k = bitmap;
        this.l = str2;
        this.m = f;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        if (h()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap d = AbstractC0640Ey.d(this.k, this.j);
        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.PhotoPicker.BitmapScalerTask");
        return d;
    }
}
