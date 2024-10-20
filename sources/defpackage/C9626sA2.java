package defpackage;

import J.N;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.chromium.components.policy.PolicyService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sA2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9626sA2 implements InterfaceC1301Ka0 {
    public static C9626sA2 f;
    public final Context a;
    public final Q83 b;
    public PolicyService c;
    public C9283rA2 d;
    public boolean e;

    @Override // defpackage.InterfaceC1301Ka0
    public final /* synthetic */ boolean a() {
        return AbstractC1171Ja0.a(this);
    }

    public C9626sA2(Context context) {
        this.a = context;
        Q83 q83 = O83.a;
        this.b = q83;
        this.e = false;
        if (q83.c("metrics_reporting")) {
            q83.p("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", q83.e("metrics_reporting", false));
            q83.m("metrics_reporting");
        }
    }

    public static C9626sA2 g() {
        if (f == null) {
            f = new C9626sA2(V60.a);
        }
        return f;
    }

    public final void h() {
        if (this.e) {
            this.b.p("Chrome.Privacy.UsageAndCrashReportingPermittedByPolicy", !N.M9GOn8lm());
        }
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean f() {
        return this.b.e("in_metrics_sample", true);
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return !r0.isActiveNetworkMetered();
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean b() {
        return this.b.e("Chrome.Privacy.UsageAndCrashReportingPermittedByPolicy", true);
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean c() {
        return this.b.e("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", false);
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean e() {
        return AX.e().g("force-dump-upload");
    }
}
