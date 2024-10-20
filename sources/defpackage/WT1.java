package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WT1 {
    public boolean a;
    public boolean b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public double o;
    public String p;

    public final void d() {
        if (this.a || this.c == 0) {
            return;
        }
        this.a = true;
        EI2.k((System.nanoTime() - this.c) / 1000000, "MerchantTrust.Message.DurationPrepared");
    }

    public final void e() {
        if (this.b || this.d == 0) {
            return;
        }
        this.b = true;
        EI2.k((System.nanoTime() - this.d) / 1000000, "MerchantTrust.Message.DurationShown");
    }

    public final void c() {
        if (this.e || this.j == 0) {
            return;
        }
        this.e = true;
        EI2.k((System.nanoTime() - this.j) / 1000000, "MerchantTrust.BottomSheet.DurationPeeked");
    }

    public final void b() {
        if (this.f || this.k == 0) {
            return;
        }
        this.f = true;
        EI2.k((System.nanoTime() - this.k) / 1000000, "MerchantTrust.BottomSheet.DurationHalfOpened");
    }

    public final void a() {
        if (this.g || this.l == 0) {
            return;
        }
        this.g = true;
        EI2.k((System.nanoTime() - this.l) / 1000000, "MerchantTrust.BottomSheet.DurationFullyOpened");
    }

    public final void f() {
        if (this.p != null) {
            long nanoTime = (System.nanoTime() - this.m) / 1000000;
            EI2.g("MerchantTrust.MessageImpact.BrowsingTime", nanoTime, 10L, 600000L, 50);
            EI2.g("MerchantTrust.MessageImpact.BrowsingTime" + g(), nanoTime, 10L, 600000L, 50);
            EI2.d(this.n, "MerchantTrust.MessageImpact.NavigationCount");
            EI2.d(this.n, "MerchantTrust.MessageImpact.NavigationCount" + g());
        }
        this.m = 0L;
        this.n = 0;
        this.p = null;
        this.o = 0.0d;
    }

    public final String g() {
        double round = Math.round(this.o * 10.0d) / 10.0d;
        return ".Rating".concat(round >= 4.5d ? "AboveFourPointFive" : round >= 4.0d ? "AboveFour" : round >= 3.0d ? "AboveThree" : round >= 2.0d ? "AboveTwo" : "BelowTwo");
    }
}
