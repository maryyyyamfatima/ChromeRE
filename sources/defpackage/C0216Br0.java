package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Br0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216Br0 {
    public boolean B;
    public boolean C;
    public Bitmap D;
    public int E;
    public int F;
    public boolean G;
    public OfflineItemSchedule H;
    public GURL a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public GURL h;
    public GURL i;
    public long j;
    public long k;
    public boolean l;
    public String m;
    public boolean n;
    public String o;
    public long q;
    public boolean s;
    public boolean t;
    public OTRProfileID u;
    public boolean v;
    public long x;
    public boolean y;
    public C6161i50 z;
    public C4266cb2 p = new C4266cb2(0, null, 2);
    public boolean r = true;
    public int w = 0;
    public boolean A = true;

    public final void c(OTRProfileID oTRProfileID) {
        this.u = oTRProfileID;
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        this.t = oTRProfileID != null;
    }

    public final DownloadInfo a() {
        return new DownloadInfo(this);
    }

    public static C0216Br0 b(DownloadInfo downloadInfo) {
        C0216Br0 c0216Br0 = new C0216Br0();
        c0216Br0.a = downloadInfo.a;
        c0216Br0.b = downloadInfo.b;
        c0216Br0.c = downloadInfo.c;
        c0216Br0.d = downloadInfo.d;
        c0216Br0.e = downloadInfo.e;
        c0216Br0.f = downloadInfo.f;
        c0216Br0.g = downloadInfo.g;
        c0216Br0.h = downloadInfo.h;
        c0216Br0.i = downloadInfo.i;
        c0216Br0.j = downloadInfo.j;
        c0216Br0.k = downloadInfo.k;
        c0216Br0.m = downloadInfo.l;
        c0216Br0.n = downloadInfo.m;
        c0216Br0.o = downloadInfo.n;
        c0216Br0.l = downloadInfo.o;
        c0216Br0.p = downloadInfo.p;
        c0216Br0.q = downloadInfo.q;
        c0216Br0.y = downloadInfo.y;
        c0216Br0.r = downloadInfo.r;
        c0216Br0.s = downloadInfo.s;
        c0216Br0.c(downloadInfo.u);
        c0216Br0.v = downloadInfo.v;
        c0216Br0.w = downloadInfo.w;
        c0216Br0.x = downloadInfo.x;
        c0216Br0.B = downloadInfo.B;
        c0216Br0.C = downloadInfo.C;
        c0216Br0.D = downloadInfo.D;
        c0216Br0.E = downloadInfo.E;
        c0216Br0.F = downloadInfo.F;
        c0216Br0.G = downloadInfo.G;
        c0216Br0.H = downloadInfo.H;
        return c0216Br0;
    }
}
