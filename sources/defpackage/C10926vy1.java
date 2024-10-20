package defpackage;

import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10926vy1 implements Cloneable {
    public final C7849n00 a;
    public final C3975bk0 g;
    public final Ad4 h;
    public final WZ i;
    public final Rect j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final YV3 p;
    public final long q;
    public int r;
    public long s;
    public int t = 0;

    public C10926vy1(C3975bk0 c3975bk0, Ad4 ad4, WZ wz, String str, Rect rect, int i, int i2, int i3, long j, int i4, int i5, YV3 yv3) {
        this.g = c3975bk0;
        this.h = ad4;
        this.i = wz;
        this.a = wz.r;
        this.j = rect;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.q = j;
        this.n = i4 == 8 ? 1 : i4;
        this.o = i5;
        this.p = yv3;
    }

    public final void b(Rect rect) {
        Rect rect2 = this.j;
        int i = rect2.left;
        int i2 = this.k;
        rect.left = i - i2;
        int i3 = rect2.top;
        int i4 = this.l;
        rect.top = i3 - i4;
        rect.right = rect2.right - i2;
        rect.bottom = rect2.bottom - i4;
    }

    public final int c() {
        long j = this.s;
        if (j == 0) {
            return 3;
        }
        return (int) ((j >> 16) & 7);
    }

    public final boolean d() {
        if (this.n == 2) {
            return false;
        }
        C3975bk0 c3975bk0 = this.g;
        if (c3975bk0 == null || !c3975bk0.d()) {
            WZ wz = this.i;
            wz.getClass();
            if (!(wz instanceof TG3)) {
                return false;
            }
        }
        return true;
    }

    public static C9006qN2 a(C10926vy1 c10926vy1, C9006qN2 c9006qN2, HashMap hashMap) {
        C9645sE1 c9645sE1 = new C9645sE1(c10926vy1);
        Rect rect = new Rect();
        c10926vy1.b(rect);
        Ad4 ad4 = c10926vy1.h;
        return new C9006qN2(c9006qN2, c9645sE1, hashMap, rect, ad4 != null ? ad4.c : null, c9006qN2 != null ? c9006qN2.a() : 0);
    }
}
