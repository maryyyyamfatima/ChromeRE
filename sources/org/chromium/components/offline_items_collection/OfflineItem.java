package org.chromium.components.offline_items_collection;

import defpackage.C4266cb2;
import defpackage.C6161i50;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OfflineItem implements Cloneable {
    public String A;
    public boolean C;
    public boolean D;
    public long E;
    public C4266cb2 F;
    public long G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f11537J;
    public OfflineItemSchedule K;
    public String g;
    public String h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public String v;
    public String w;
    public GURL x;
    public GURL y;
    public boolean z;
    public C6161i50 a = new C6161i50();
    public int i = 5;
    public int B = 2;

    public final Object clone() {
        OfflineItem offlineItem = new OfflineItem();
        C6161i50 c6161i50 = this.a;
        offlineItem.a = c6161i50 == null ? null : new C6161i50(c6161i50.a, c6161i50.b);
        offlineItem.g = this.g;
        offlineItem.h = this.h;
        offlineItem.i = this.i;
        offlineItem.j = this.j;
        offlineItem.k = this.k;
        offlineItem.l = this.l;
        offlineItem.m = this.m;
        offlineItem.p = this.p;
        offlineItem.q = this.q;
        offlineItem.r = this.r;
        offlineItem.s = this.s;
        offlineItem.t = this.t;
        offlineItem.u = this.u;
        offlineItem.v = this.v;
        offlineItem.w = this.w;
        offlineItem.n = this.n;
        offlineItem.o = this.o;
        offlineItem.x = this.x;
        offlineItem.y = this.y;
        offlineItem.z = this.z;
        offlineItem.A = this.A;
        offlineItem.B = this.B;
        offlineItem.C = this.C;
        offlineItem.D = this.D;
        offlineItem.E = this.E;
        offlineItem.G = this.G;
        offlineItem.I = this.I;
        offlineItem.f11537J = this.f11537J;
        OfflineItemSchedule offlineItemSchedule = this.K;
        if (offlineItemSchedule != null) {
            offlineItem.K = new OfflineItemSchedule(offlineItemSchedule.b, offlineItemSchedule.a);
        }
        C4266cb2 c4266cb2 = this.F;
        if (c4266cb2 != null) {
            offlineItem.F = new C4266cb2(c4266cb2.a, c4266cb2.b, c4266cb2.c);
        }
        return offlineItem;
    }
}
