package defpackage;

import org.chromium.base.Callback;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BG0 {
    public final GURL a;
    public final boolean b;
    public final GURL c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final VK2 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final Callback n;
    public final boolean o;
    public final Origin p;

    public BG0(GURL gurl, boolean z, GURL gurl2, int i, boolean z2, boolean z3, VK2 vk2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Callback callback, boolean z9, Origin origin) {
        this.a = gurl;
        this.b = z;
        this.d = i;
        this.c = gurl2 == null ? GURL.emptyGURL() : gurl2;
        this.e = z2;
        this.f = z3;
        this.g = vk2;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = null;
        this.m = z8;
        this.n = callback;
        this.o = z9;
        this.p = origin;
    }
}
