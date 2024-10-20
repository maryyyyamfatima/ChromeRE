package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import java.lang.reflect.Array;
import java.util.HashSet;
import org.chromium.base.TraceEvent;
import org.chromium.base.UnguessableToken;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4735dw2 {
    public final UnguessableToken a;
    public final Size b;
    public final float c;
    public Bitmap[][] d;
    public C4392cw2[][] e;
    public boolean[][] f;
    public final boolean[][] g;
    public final PlayerCompositorDelegateImpl h;
    public final C5423fw2 i;
    public HashSet j = new HashSet();

    public C4735dw2(UnguessableToken unguessableToken, int i, int i2, float f, Size size, PlayerCompositorDelegateImpl playerCompositorDelegateImpl, C5423fw2 c5423fw2) {
        this.a = unguessableToken;
        this.b = new Size(i, i2);
        this.c = f;
        this.h = playerCompositorDelegateImpl;
        this.i = c5423fw2;
        int max = (int) Math.max(1.0d, Math.ceil((size.getHeight() * f) / i2));
        int max2 = (int) Math.max(1.0d, Math.ceil((size.getWidth() * f) / i));
        this.d = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, max, max2);
        this.e = (C4392cw2[][]) Array.newInstance((Class<?>) C4392cw2.class, max, max2);
        Class cls = Boolean.TYPE;
        this.f = (boolean[][]) Array.newInstance((Class<?>) cls, max, max2);
        this.g = (boolean[][]) Array.newInstance((Class<?>) cls, max, max2);
    }

    public final void c() {
        this.f = null;
        this.e = null;
        for (int i = 0; i < this.d.length; i++) {
            int i2 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.d[i];
                if (i2 < bitmapArr.length) {
                    Bitmap bitmap = bitmapArr[i2];
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i2++;
                }
            }
        }
        this.d = null;
    }

    public final boolean d(int i, int i2) {
        boolean[][] zArr = this.f;
        if (zArr == null) {
            return false;
        }
        zArr[i][i2] = true;
        C4392cw2[][] c4392cw2Arr = this.e;
        boolean[][] zArr2 = this.g;
        if (c4392cw2Arr != null && c4392cw2Arr[i][i2] != null) {
            boolean z = zArr2[i][i2];
            return false;
        }
        Bitmap[][] bitmapArr = this.d;
        if (bitmapArr == null || c4392cw2Arr == null || bitmapArr[i][i2] != null || c4392cw2Arr[i][i2] != null) {
            return false;
        }
        Size size = this.b;
        int height = size.getHeight() * i;
        int width = size.getWidth() * i2;
        boolean z2 = zArr2[i][i2];
        final C4392cw2 c4392cw2 = new C4392cw2(this, i, i2);
        this.e[i][i2] = c4392cw2;
        int a = this.h.a(this.a, new Rect(width, height, size.getWidth() + width, size.getHeight() + height), this.c, c4392cw2, new Runnable() { // from class: bw2
            @Override // java.lang.Runnable
            public final void run() {
                C4392cw2 c4392cw22 = C4392cw2.this;
                C4735dw2 c4735dw2 = c4392cw22.i;
                int i3 = c4392cw22.a;
                int i4 = c4392cw22.g;
                C4735dw2.b(c4735dw2, i3, i4);
                C4392cw2[][] c4392cw2Arr2 = c4735dw2.e;
                if (c4392cw2Arr2 == null) {
                    return;
                }
                c4392cw2Arr2[i3][i4] = null;
            }
        });
        C4392cw2 c4392cw22 = this.e[i][i2];
        if (c4392cw22 != null) {
            c4392cw22.h = a;
        }
        return true;
    }

    public static void a(C4735dw2 c4735dw2) {
        if (c4735dw2.d == null || c4735dw2.f == null) {
            return;
        }
        TraceEvent.b("PlayerFrameBitmapState.deleteUnrequiredBitmaps", null);
        for (int i = 0; i < c4735dw2.d.length; i++) {
            int i2 = 0;
            while (true) {
                Bitmap[] bitmapArr = c4735dw2.d[i];
                if (i2 < bitmapArr.length) {
                    Bitmap bitmap = bitmapArr[i2];
                    if (!c4735dw2.f[i][i2] && bitmap != null) {
                        bitmap.recycle();
                        c4735dw2.d[i][i2] = null;
                    }
                    i2++;
                }
            }
        }
        TraceEvent.c("PlayerFrameBitmapState.deleteUnrequiredBitmaps");
    }

    public static void b(C4735dw2 c4735dw2, int i, int i2) {
        Bitmap[][] bitmapArr = c4735dw2.d;
        if (bitmapArr == null) {
            return;
        }
        HashSet hashSet = c4735dw2.j;
        if (hashSet != null) {
            hashSet.remove(Integer.valueOf((i * bitmapArr.length) + i2));
            if (!c4735dw2.j.isEmpty()) {
                return;
            } else {
                c4735dw2.j = null;
            }
        }
        c4735dw2.i.b(c4735dw2);
    }
}
