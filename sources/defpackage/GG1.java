package defpackage;

import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GG1 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final float g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public String l;
    public boolean m;
    public WorkSource n;
    public final ClientIdentity o;

    public GG1(LocationRequest locationRequest) {
        this.a = locationRequest.a;
        this.b = locationRequest.g;
        this.c = locationRequest.h;
        this.d = locationRequest.i;
        this.e = locationRequest.j;
        this.f = locationRequest.k;
        this.g = locationRequest.l;
        this.h = locationRequest.m;
        this.i = locationRequest.n;
        this.j = locationRequest.o;
        this.k = locationRequest.p;
        this.l = locationRequest.q;
        this.m = locationRequest.r;
        this.n = locationRequest.s;
        this.o = locationRequest.t;
    }

    public final LocationRequest a() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        if (j2 == -1) {
            j2 = j;
        } else if (i != 105) {
            j2 = Math.min(j2, j);
        }
        long j3 = this.d;
        long j4 = this.b;
        long max = Math.max(j3, j4);
        long j5 = this.e;
        int i2 = this.f;
        float f = this.g;
        boolean z = this.h;
        long j6 = this.i;
        return new LocationRequest(i, j, j2, max, Long.MAX_VALUE, j5, i2, f, z, j6 == -1 ? j4 : j6, this.j, this.k, this.l, this.m, new WorkSource(this.n), this.o);
    }
}
