package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oa2 */
/* loaded from: classes.dex */
public final class C1822Oa2 implements InterfaceC4436d40, InterfaceC0679Ff3, InterfaceC11522xj {
    public static C1822Oa2 n;
    public boolean a;
    public boolean g;
    public boolean h;
    public final C4779e40 i;
    public ChromeActivity j;
    public boolean k;
    public long l;
    public final ViewOnClickListenerC10403uS3 m;

    public C1822Oa2() {
        C7928nE c7928nE = UN.a;
        if (!N.M6bsIDpc("OfflineIndicator", "bottom_offline_indicator", false)) {
            this.m = new ViewOnClickListenerC10403uS3();
        }
        this.i = new C4779e40(this, "OfflineIndicatorController");
        ApplicationStatus.d(this);
    }

    @Override // defpackage.InterfaceC4436d40
    public final void c(int i) {
        if (i == 0) {
            return;
        }
        d(i == 4);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        this.a = false;
        DownloadUtils.showDownloadManager(null, null, null, 11, true);
        EI2.h(1, 2, "OfflineIndicator.CTR");
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        this.a = false;
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        if (i != 1 && i != 2) {
            this.g = false;
        }
        if (i == 1) {
            C4779e40 c4779e40 = this.i;
            c4779e40.getClass();
            c4779e40.b(NetworkChangeNotifier.f.getCurrentConnectionType());
            d(c4779e40.j == 4);
        }
    }

    public final void d(boolean z) {
        Activity activity;
        boolean z2;
        int c;
        WebContents b;
        if (z != this.k) {
            if (z) {
                this.h = false;
                this.l = SystemClock.elapsedRealtime();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.l;
                C7928nE c7928nE = UN.a;
                this.h = elapsedRealtime >= ((long) (N.M37SqSAy("OfflineIndicator", "stable_offline_wait_s", 20) * 1000));
            }
            this.k = z;
        }
        if (ApplicationStatus.getStateForApplication() == 1 && (activity = ApplicationStatus.c) != null && (activity instanceof ChromeActivity)) {
            ChromeActivity chromeActivity = (ChromeActivity) activity;
            if (chromeActivity.z() == null) {
                return;
            }
            ViewOnClickListenerC10403uS3 viewOnClickListenerC10403uS3 = this.m;
            if (!z) {
                if (this.a) {
                    return;
                }
                Tab g1 = chromeActivity.g1();
                if ((g1 == null || g1.n() || AbstractC2217Rb2.e(g1) || TextUtils.equals(g1.getUrl().i(), "about:blank")) ? false : true) {
                    Tab g12 = chromeActivity.g1();
                    if (g12 != null && ((b = g12.b()) == null || b.e())) {
                        if (this.j != chromeActivity) {
                            this.j = chromeActivity;
                            g12.v(new C1692Na2(this));
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                    if (!this.g || this.h) {
                        Drawable a = AbstractC2884Wf.a(chromeActivity, R.drawable.0_resource_name_obfuscated_res_0x7f0902f0);
                        C12188zf3 a2 = C12188zf3.a(chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140711), this, 0, 25);
                        a2.i = true;
                        a2.k = a;
                        a2.g = -16777216;
                        a2.h = R.style.f102750_resource_name_obfuscated_res_0x7f150450;
                        a2.j = 10000;
                        a2.d = chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140714);
                        InterfaceC7697ma2 interfaceC7697ma2 = null;
                        a2.e = null;
                        C7928nE c7928nE2 = UN.a;
                        if (!(!N.M6bsIDpc("OfflineIndicator", "bottom_offline_indicator", false))) {
                            chromeActivity.z().c(a2);
                        } else {
                            C10285u6 c10285u6 = chromeActivity.H;
                            if (c10285u6 != null) {
                                interfaceC7697ma2 = (InterfaceC7697ma2) DC.k.e(c10285u6.t);
                            } else {
                                K14 k14 = DC.k;
                            }
                            if (viewOnClickListenerC10403uS3.h == null && ((c = ApplicationStatus.c(chromeActivity)) == 2 || c == 3)) {
                                viewOnClickListenerC10403uS3.h = a2;
                                C10746vS3 c10746vS3 = new C10746vS3(chromeActivity, viewOnClickListenerC10403uS3, a2, c10285u6, interfaceC7697ma2);
                                viewOnClickListenerC10403uS3.i = c10746vS3;
                                ViewGroup viewGroup = c10746vS3.j;
                                ViewGroup viewGroup2 = c10746vS3.b;
                                viewGroup.addView(viewGroup2);
                                c10746vS3.l.addOnLayoutChangeListener(c10746vS3.p);
                                viewGroup2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1718Nf3(c10746vS3));
                                viewOnClickListenerC10403uS3.i.a();
                                Handler handler = viewOnClickListenerC10403uS3.a;
                                RunnableC10060tS3 runnableC10060tS3 = viewOnClickListenerC10403uS3.g;
                                handler.removeCallbacks(runnableC10060tS3);
                                handler.postDelayed(runnableC10060tS3, viewOnClickListenerC10403uS3.h.j);
                                if (interfaceC7697ma2 != null) {
                                    C8385oa2 c8385oa2 = (C8385oa2) interfaceC7697ma2;
                                    if (AbstractC12248zp3.a(c8385oa2)) {
                                        CC cc = (CC) c8385oa2.g;
                                        viewOnClickListenerC10403uS3.j = cc;
                                        cc.d(viewOnClickListenerC10403uS3);
                                    }
                                }
                                ApplicationStatus.e(viewOnClickListenerC10403uS3, chromeActivity);
                            }
                        }
                        EI2.h(0, 2, "OfflineIndicator.CTR");
                        this.a = true;
                        this.g = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.a) {
                C7928nE c7928nE3 = UN.a;
                if (!N.M6bsIDpc("OfflineIndicator", "bottom_offline_indicator", false)) {
                    viewOnClickListenerC10403uS3.a(false);
                } else {
                    chromeActivity.z().a(this);
                }
            }
        }
    }
}
