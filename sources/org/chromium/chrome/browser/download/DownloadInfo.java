package org.chromium.chrome.browser.download;

import android.graphics.Bitmap;
import defpackage.AbstractC8531oz1;
import defpackage.C0216Br0;
import defpackage.C4266cb2;
import defpackage.C6161i50;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DownloadInfo {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final Bitmap D;
    public final int E;
    public final int F;
    public final boolean G;
    public final OfflineItemSchedule H;
    public final GURL a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final GURL h;
    public final GURL i;
    public final long j;
    public final long k;
    public final String l;
    public final boolean m;
    public final String n;
    public final boolean o;
    public final C4266cb2 p;
    public final long q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final OTRProfileID u;
    public final boolean v;
    public final int w;
    public final long x;
    public final boolean y;
    public final C6161i50 z;

    public DownloadInfo(C0216Br0 c0216Br0) {
        GURL gurl = c0216Br0.a;
        this.a = gurl == null ? GURL.emptyGURL() : gurl;
        this.b = c0216Br0.b;
        this.c = c0216Br0.c;
        this.d = c0216Br0.d;
        this.e = c0216Br0.e;
        this.f = c0216Br0.f;
        this.g = c0216Br0.g;
        GURL gurl2 = c0216Br0.h;
        this.h = gurl2 == null ? GURL.emptyGURL() : gurl2;
        GURL gurl3 = c0216Br0.i;
        this.i = gurl3 == null ? GURL.emptyGURL() : gurl3;
        this.j = c0216Br0.j;
        this.k = c0216Br0.k;
        String str = c0216Br0.m;
        this.l = str;
        this.m = c0216Br0.n;
        this.o = c0216Br0.l;
        this.n = c0216Br0.o;
        this.p = c0216Br0.p;
        this.q = c0216Br0.q;
        this.r = c0216Br0.r;
        this.s = c0216Br0.s;
        this.t = c0216Br0.t;
        this.u = c0216Br0.u;
        boolean z = c0216Br0.v;
        this.v = z;
        this.w = c0216Br0.w;
        this.x = c0216Br0.x;
        this.y = c0216Br0.y;
        C6161i50 c6161i50 = c0216Br0.z;
        if (c6161i50 != null) {
            this.z = c6161i50;
        } else {
            this.z = AbstractC8531oz1.a(str, z);
        }
        this.A = c0216Br0.A;
        this.B = c0216Br0.B;
        this.C = c0216Br0.C;
        this.D = c0216Br0.D;
        this.E = c0216Br0.E;
        this.F = c0216Br0.F;
        this.G = c0216Br0.G;
        this.H = c0216Br0.H;
    }

    public static DownloadInfo createDownloadInfo(String str, String str2, String str3, GURL gurl, String str4, long j, long j2, OTRProfileID oTRProfileID, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, GURL gurl2, GURL gurl3, long j3, long j4, boolean z5, int i3, OfflineItemSchedule offlineItemSchedule) {
        String remapGenericMimeType = MimeUtils.remapGenericMimeType(str4, gurl.i(), str2);
        C4266cb2 c4266cb2 = new C4266cb2(j, i2 == -1 ? null : Long.valueOf(j2), 0);
        C0216Br0 c0216Br0 = new C0216Br0();
        c0216Br0.j = j;
        c0216Br0.k = j2;
        c0216Br0.f = str2;
        c0216Br0.m = str;
        c0216Br0.e = str2;
        c0216Br0.g = str3;
        c0216Br0.n = z2;
        c0216Br0.c(oTRProfileID);
        c0216Br0.s = z;
        c0216Br0.r = z3;
        c0216Br0.C = z4;
        c0216Br0.c = remapGenericMimeType;
        c0216Br0.i = gurl2;
        c0216Br0.p = c4266cb2;
        c0216Br0.h = gurl3;
        c0216Br0.w = i;
        c0216Br0.q = j3;
        c0216Br0.x = j4;
        c0216Br0.y = z5;
        c0216Br0.a = gurl;
        c0216Br0.F = i3;
        c0216Br0.H = offlineItemSchedule;
        return new DownloadInfo(c0216Br0);
    }
}
