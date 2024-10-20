package org.chromium.content_public.browser;

import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NavigationHandle {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public int d;
    public GURL e;
    public final GURL f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Origin n;
    public final boolean o;
    public boolean p;
    public boolean q;
    public final boolean r;
    public final boolean s;

    public final void release() {
    }

    public NavigationHandle(long j, GURL gurl, GURL gurl2, GURL gurl3, boolean z, boolean z2, boolean z3, Origin origin, int i, boolean z4, boolean z5, boolean z6, boolean z7, long j2, boolean z8, boolean z9) {
        this.e = gurl;
        this.f = gurl2;
        this.a = z;
        this.c = z2;
        this.b = z3;
        this.n = origin;
        this.d = i;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
    }

    public final void didRedirect(GURL gurl, boolean z) {
        this.e = gurl;
        this.p = true;
        this.q = z;
    }

    public void didFinish(GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3, boolean z6) {
        this.e = gurl;
        this.i = z;
        this.g = z2;
        this.j = z3;
        this.h = z4;
        this.k = z5;
        this.d = i;
        this.l = i2;
        this.m = i3;
        this.q = z6;
    }
}
