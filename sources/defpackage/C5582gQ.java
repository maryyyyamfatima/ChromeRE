package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.infobars.InfoBar;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gQ */
/* loaded from: classes.dex */
public final class C5582gQ implements InterfaceC6730jl1 {
    public static boolean r;
    public InterfaceC10590uz3 a;
    public Handler g;
    public Tab h;
    public YP i;
    public final String j;
    public final String k;
    public final String l;
    public final I5 m;
    public final Activity n;
    public final InterfaceC4578dV1 o;
    public ZP p;
    public C3864bQ q;

    @Override // defpackage.InterfaceC6730jl1
    public final void a(int i) {
    }

    public static void d(int i) {
        EI2.h(i, 5, "Android.Survey.InfoBarClosingState");
    }

    public static void e(int i) {
        EI2.h(i, 9, "Android.Survey.SurveyFilteringResults");
    }

    public C5582gQ(String str, I5 i5, ChromeTabbedActivity chromeTabbedActivity, InterfaceC4578dV1 interfaceC4578dV1) {
        this.j = str;
        this.k = AbstractC6265iP.b.b(str);
        this.l = AbstractC6265iP.a.b(str);
        this.m = i5;
        this.n = chromeTabbedActivity;
        this.o = interfaceC4578dV1;
    }

    public final void h(Tab tab, final String str) {
        InterfaceC4578dV1 interfaceC4578dV1;
        AbstractC4851eH1.d("ChromeSurveyCtrler", Log.getStackTraceString(new Throwable("Logging invocation of #showSurveyPrompt to investigate crbug.com/1249055.")), new Object[0]);
        this.h = tab;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("MessagesForAndroidChromeSurvey") && (interfaceC4578dV1 = this.o) != null) {
            if (r) {
                final String format = String.format("The survey prompt for survey with ID %s has already been shown.", str);
                AbstractC4851eH1.f("ChromeSurveyCtrler", format, new Object[0]);
                PostTask.c(QF3.h, new Runnable() { // from class: SP
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChromePureJavaExceptionReporter.d(new Throwable(format));
                    }
                });
                return;
            }
            if (C12260zr3.b().c(str)) {
                final String format2 = String.format("The message prompt will not be shown because the survey with ID %s has expired.", str);
                AbstractC4851eH1.f("ChromeSurveyCtrler", format2, new Object[0]);
                PostTask.c(QF3.h, new Runnable() { // from class: TP
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChromePureJavaExceptionReporter.d(new Throwable(format2));
                    }
                });
                return;
            }
            Resources resources = this.n.getResources();
            BD2 bd2 = new BD2(HU1.F);
            bd2.c(HU1.a, 11);
            bd2.e(HU1.f, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140338));
            bd2.c(HU1.m, R.drawable.0_resource_name_obfuscated_res_0x7f09011e);
            bd2.c(HU1.p, 0);
            bd2.e(HU1.c, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140337));
            bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: UP
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    C5582gQ c5582gQ = C5582gQ.this;
                    c5582gQ.getClass();
                    C12260zr3.b().d(c5582gQ.n, str, c5582gQ.m);
                    return 1;
                }
            });
            bd2.e(HU1.x, new Callback() { // from class: VP
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C5582gQ.this.g(((Integer) obj).intValue());
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            });
            final PropertyModel a = bd2.a();
            a.o(HU1.y, new InterfaceC7913nB() { // from class: WP
                @Override // defpackage.InterfaceC7913nB
                public final boolean a() {
                    final C5582gQ c5582gQ = C5582gQ.this;
                    c5582gQ.getClass();
                    C12260zr3 b = C12260zr3.b();
                    String str2 = str;
                    if (!b.c(str2)) {
                        return true;
                    }
                    AbstractC4851eH1.f("ChromeSurveyCtrler", "The survey message prompt was dismissed because the survey with ID %s has expired.", str2);
                    Handler handler = new Handler(ThreadUtils.c());
                    final PropertyModel propertyModel = a;
                    handler.post(new Runnable() { // from class: XP
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((C5265fV1) C5582gQ.this.o).a(9, propertyModel);
                        }
                    });
                    return false;
                }
            });
            ZP zp = new ZP(this, a);
            this.p = zp;
            this.h.v(zp);
            I5 i5 = this.m;
            if (i5 != null) {
                C3864bQ c3864bQ = new C3864bQ(this, str, a);
                this.q = c3864bQ;
                i5.b(c3864bQ);
            }
            ((C5265fV1) interfaceC4578dV1).c(a, false);
            r = true;
        } else {
            InfoBarContainer.c(tab).j.a(this);
            N.MjByxscl(tab.b(), R.drawable.0_resource_name_obfuscated_res_0x7f09011e, new C4894eQ(this));
            FI2.a("Android.Survey.ShowSurveyInfoBar");
        }
        ((AbstractC11276wz3) this.a).s(this.i);
    }

    public final void g(int i) {
        C3864bQ c3864bQ;
        ZP zp;
        Tab tab = this.h;
        if (tab != null && (zp = this.p) != null) {
            tab.w(zp);
            this.p = null;
        }
        I5 i5 = this.m;
        if (i5 != null && (c3864bQ = this.q) != null) {
            i5.c(c3864bQ);
            this.q = null;
        }
        if (i == 4) {
            d(1);
            f();
            return;
        }
        if (i == 1) {
            d(0);
            f();
            EI2.i(O83.a.f(0, this.l), 1, 20, 21, "Android.Survey.DownloadAttemptsBeforeAccepted");
        } else if (i == 3) {
            d(2);
            f();
        } else if (i == 5) {
            d(4);
            f();
        } else if (i == 9) {
            d(4);
        } else {
            d(4);
        }
    }

    public final boolean c(Tab tab, String str) {
        if (!((tab == null || tab.b() == null || tab.isIncognito()) ? false : true)) {
            return false;
        }
        if (tab.e() || !tab.isUserInteractable()) {
            tab.v(new C4207cQ(this, str));
            return false;
        }
        h(tab, str);
        return true;
    }

    @Override // defpackage.InterfaceC6730jl1
    public final void b(InterfaceC2006Pl1 interfaceC2006Pl1) {
        this.g.removeCallbacksAndMessages(null);
        if (interfaceC2006Pl1 != null) {
            InfoBar infoBar = (InfoBar) interfaceC2006Pl1;
            long j = infoBar.o;
            if ((j == 0 ? -1 : N.MIZvQmze(j, infoBar)) != 78) {
                return;
            }
            this.g.postDelayed(new Runnable() { // from class: RP
                @Override // java.lang.Runnable
                public final void run() {
                    C5582gQ.this.f();
                }
            }, 5000L);
        }
    }

    public final void f() {
        InfoBarContainer c;
        if (this.h == null) {
            return;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("MessagesForAndroidChromeSurvey") && !this.h.isDestroyed() && (c = InfoBarContainer.c(this.h)) != null) {
            c.j.d(this);
        }
        this.g.removeCallbacksAndMessages(null);
        O83.a.s(System.currentTimeMillis(), this.k);
        this.h = null;
    }
}
