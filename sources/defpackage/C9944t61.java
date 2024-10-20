package defpackage;

import J.N;
import android.accounts.Account;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.h;
import com.android.chrome.R;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t61 */
/* loaded from: classes2.dex */
public final class C9944t61 extends C12260zr3 {
    public static final long i = TimeUnit.HOURS.toMillis(20);
    public final Profile c;
    public final C5926hQ d;
    public Account e;
    public I5 f;
    public C9258r61 g;
    public final HashMap b = new HashMap();
    public final HashMap h = new HashMap();

    public static void e(int i2) {
        EI2.h(i2, 14, "Android.Survey.ShowSurveyStatus");
    }

    public C9944t61() {
        Profile d = Profile.d();
        this.c = d;
        Context context = V60.a;
        C0869Gr3 c0869Gr3 = new C0869Gr3(d);
        C0219Br3.i.getClass();
        if (OP0.b == null) {
            synchronized (OP0.a) {
                if (OP0.b == null) {
                    OP0.b = context;
                }
            }
        }
        int i2 = AbstractC3208Yr3.b;
        Context context2 = OP0.b;
        M61 m61 = M61.g;
        ((O61) ((N61) m61.a.get())).getClass();
        if (OP0.c(((Boolean) O61.a.a(context2)).booleanValue())) {
            String packageName = context.getPackageName();
            Context context3 = OP0.b;
            ((O61) ((N61) m61.a.get())).getClass();
            if (AbstractC3208Yr3.l(packageName, (String) O61.c.a(context3))) {
                C11917yr3.b.a = new E22(c0869Gr3);
                this.d = new C5926hQ();
                return;
            }
            throw new IllegalStateException("Error, need to be on the allowed list to use the HttpClient.");
        }
        throw new IllegalStateException("Error, HttpClient feature is not enabled.");
    }

    @Override // defpackage.C12260zr3
    public final boolean c(String str) {
        Long l = (Long) this.h.get(str);
        if (l == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = currentTimeMillis - l.longValue();
        AbstractC4851eH1.d("HatsNextController", "Logging invocation of #isSurveyExpired to investigate crbug.com/1249055.\nSurvey ID: " + str + "\nSurvey download time: " + l + "\n#isSurveyExpired request time: " + currentTimeMillis + "\nMinutes since download: " + ((longValue / 1000.0d) / 60.0d), new Object[0]);
        return longValue > i;
    }

    @Override // defpackage.C12260zr3
    public final void a(Context context, String str, PP pp, QP qp) {
        C1202Jg1.a().getClass();
        Account a = CoreAccountInfo.a(C1202Jg1.b(this.c).b(0));
        this.e = a;
        if (a == null) {
            EI2.b("Android.Survey.DownloadRequested2", false);
            return;
        }
        if (context == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        C8573p61 c8573p61 = new C8573p61(this, str, pp, qp);
        Account account = this.e;
        boolean g = AX.e().g("force-enable-chrome-survey");
        C2298Rr3 c2298Rr3 = new C2298Rr3(context, str, c8573p61, "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw", account, g);
        this.d.getClass();
        C0219Br3 c0219Br3 = C0219Br3.i;
        c0219Br3.getClass();
        c0219Br3.g = "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw";
        if (TextUtils.isEmpty("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw")) {
            Log.e("SurveyController", "API key was not set by the client.");
        }
        final D22 d22 = new D22(context, str, account == null ? "" : account.name, c0219Br3.g, C11917yr3.b.a.a);
        d22.e = c8573p61;
        C5364fm3 c5364fm3 = new C5364fm3();
        synchronized (C0219Br3.j) {
            if (TextUtils.isEmpty(str)) {
                Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                c8573p61.a(str, EnumC2168Qr3.TRIGGER_ID_NOT_SET);
            } else {
                c0219Br3.f.getClass();
                c0219Br3.e = System.currentTimeMillis();
                C8831pr3 c8831pr3 = (C8831pr3) C9174qr3.o.j();
                if (c8831pr3.h) {
                    c8831pr3.l();
                    c8831pr3.h = false;
                }
                C9174qr3 c9174qr3 = (C9174qr3) c8831pr3.g;
                c9174qr3.getClass();
                str.getClass();
                c9174qr3.k = str;
                c8831pr3.o(C0219Br3.c(c2298Rr3));
                if (c8831pr3.h) {
                    c8831pr3.l();
                    c8831pr3.h = false;
                }
                ((C9174qr3) c8831pr3.g).m = g;
                C9174qr3 c9174qr32 = (C9174qr3) c8831pr3.j();
                C8138nq3 c = AbstractC3208Yr3.c(context);
                C9248r43 c9248r43 = (C9248r43) C9591s43.l.j();
                if (c9248r43.h) {
                    c9248r43.l();
                    c9248r43.h = false;
                }
                C9591s43 c9591s43 = (C9591s43) c9248r43.g;
                c9591s43.getClass();
                c9174qr32.getClass();
                c9591s43.j = c9174qr32;
                if (c9248r43.h) {
                    c9248r43.l();
                    c9248r43.h = false;
                }
                C9591s43 c9591s432 = (C9591s43) c9248r43.g;
                c9591s432.getClass();
                c.getClass();
                c9591s432.k = c;
                final C9591s43 c9591s433 = (C9591s43) c9248r43.j();
                final C5364fm3 c5364fm32 = new C5364fm3();
                if (c9591s433 == null) {
                    Log.e("NetworkCallerHttp", "Survey trigger request event was null");
                } else {
                    ((ThreadPoolExecutor) Z22.a()).execute(new Runnable() { // from class: A22
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9591s43 c9591s434 = c9591s433;
                            D22 d222 = D22.this;
                            C2428Sr3 c2428Sr3 = new C2428Sr3(d222.c, d222.a, d222.d, d222.b(), c9591s434);
                            c2428Sr3.b();
                            int i2 = AbstractC3208Yr3.b;
                            C22 c22 = new C22(d222, c9591s434, c2428Sr3, c5364fm32);
                            d222.g.b(new Z91(Uri.parse(c2428Sr3.d()), c2428Sr3.b, c2428Sr3.c()), c22);
                        }
                    });
                }
                C4108c64 c4108c64 = (C4108c64) C4452d64.m.j();
                if (c4108c64.h) {
                    c4108c64.l();
                    c4108c64.h = false;
                }
                C4452d64 c4452d64 = (C4452d64) c4108c64.g;
                c4452d64.getClass();
                c4452d64.j = str;
                if (c4108c64.h) {
                    c4108c64.l();
                    c4108c64.h = false;
                }
                ((C4452d64) c4108c64.g).k = g;
                if (c4108c64.h) {
                    c4108c64.l();
                    c4108c64.h = false;
                }
                ((C4452d64) c4108c64.g).l = false;
                AbstractC5275fX1.c((C4452d64) c4108c64.j(), c5364fm3, context, account == null ? null : account.name);
            }
        }
        EI2.b("Android.Survey.DownloadRequested2", true);
    }

    @Override // defpackage.C12260zr3
    public final void d(Activity activity, String str, I5 i5) {
        C1202Jg1.a().getClass();
        Account a = CoreAccountInfo.a(C1202Jg1.b(this.c).b(0));
        Account account = this.e;
        if (account == null || !account.equals(a)) {
            e(1);
            return;
        }
        SurveyData surveyData = (SurveyData) this.b.get(str);
        if (surveyData == null) {
            AbstractC4851eH1.a("HatsNextController", String.format("SurveyData for %s cannot be found!", str), new Object[0]);
            e(3);
            return;
        }
        View findViewById = activity.findViewById(R.id.survey_container);
        if (findViewById == null) {
            AbstractC4851eH1.a("HatsNextController", "Cannot find survey container in the activity!", new Object[0]);
            e(2);
            return;
        }
        C9601s61 c9601s61 = new C9601s61(this, str, findViewById, i5);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801be);
        BundleUtils.f("survey");
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        if (valueOf == null || valueOf.intValue() <= 0) {
            throw new IllegalArgumentException("The max prompt width must be a positive value.");
        }
        Integer valueOf2 = Integer.valueOf(R.drawable.0_resource_name_obfuscated_res_0x7f09011e);
        EnumC4408cz2 enumC4408cz2 = EnumC4408cz2.FIRST_CARD_MODAL;
        ArrayList arrayList = new ArrayList(Arrays.asList(new C8776pi2("chrome_version", "105.0.5195.136"), new C8776pi2("chrome_channel", "Stable")));
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("ChromeSurveyNextAndroid", "extra_field_trail_psd");
        if (!TextUtils.isEmpty(MMltG$kc)) {
            arrayList.add(new C8776pi2("extra_field_trail_psd", MMltG$kc));
        }
        C5926hQ c5926hQ = this.d;
        EnumC3721az2 enumC3721az2 = EnumC3721az2.CARD;
        boolean z = false;
        C4751dz2 c4751dz2 = new C4751dz2(activity, R.id.survey_container, valueOf2, valueOf, true, c9601s61, 777, a, surveyData, arrayList, enumC4408cz2, enumC3721az2);
        c5926hQ.getClass();
        C0219Br3 c0219Br3 = C0219Br3.i;
        c0219Br3.getClass();
        C5364fm3 c5364fm3 = new C5364fm3();
        AtomicBoolean atomicBoolean = C0219Br3.j;
        synchronized (atomicBoolean) {
            W54 w54 = (W54) C3421a64.o.j();
            int intValue = valueOf.intValue();
            if (w54.h) {
                w54.l();
                w54.h = false;
            }
            C3421a64 c3421a64 = (C3421a64) w54.g;
            c3421a64.j |= 1;
            c3421a64.k = intValue;
            if (OP0.c(J61.a(OP0.b))) {
                if (w54.h) {
                    w54.l();
                    w54.h = false;
                }
                C3421a64 c3421a642 = (C3421a64) w54.g;
                c3421a642.getClass();
                c3421a642.m = X54.a(2);
                c3421a642.j |= 2;
                if (w54.h) {
                    w54.l();
                    w54.h = false;
                }
                C3421a64 c3421a643 = (C3421a64) w54.g;
                c3421a643.getClass();
                c3421a643.n = Z54.a(3);
                c3421a643.j |= 4;
            }
            if (atomicBoolean.get()) {
                int i2 = AbstractC3208Yr3.b;
                c0219Br3.f(EnumC3372Zy2.SURVEY_ALREADY_RUNNING);
                w54.o(Y54.m);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            if (!(surveyData instanceof SurveyDataImpl)) {
                c0219Br3.f(EnumC3372Zy2.INVALID_SURVEY_DATA_TYPE);
                w54.o(Y54.k);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                throw new IllegalArgumentException("Survey data is not the correct type.");
            }
            c0219Br3.b = (SurveyDataImpl) surveyData;
            c0219Br3.a = c9601s61;
            C6442iu3 c6442iu3 = c0219Br3.f;
            long j = ((SurveyDataImpl) surveyData).k;
            int i3 = AbstractC3208Yr3.b;
            c6442iu3.getClass();
            if (System.currentTimeMillis() - j > AbstractC3208Yr3.a) {
                Log.w("SurveyController", "Cancelling show request since SurveyData was expired.");
                c0219Br3.f(EnumC3372Zy2.SURVEY_EXPIRED);
                w54.o(Y54.n);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            activity.getPackageName();
            if (c0219Br3.h > ((SurveyDataImpl) surveyData).k) {
                Context context = OP0.b;
                ((O61) ((N61) M61.g.a.get())).getClass();
                OP0.c(((Boolean) O61.b.a(context)).booleanValue());
                z = true;
            }
            if (z) {
                Log.w("SurveyController", "Cancelling show request since SurveyData was older than oldest valid trigger request.");
                c0219Br3.f(EnumC3372Zy2.SURVEY_EXPIRED);
                w54.o(Y54.n);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            if (activity.isFinishing()) {
                Log.w("SurveyController", "Cancelling show request since activity was finishing.");
                c0219Br3.f(EnumC3372Zy2.CLIENT_ACTIVITY_WAS_FINISHING);
                w54.o(Y54.h);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            if (activity.isDestroyed()) {
                Log.w("SurveyController", "Cancelling show request since activity was destroyed.");
                c0219Br3.f(EnumC3372Zy2.CLIENT_ACTIVITY_WAS_DESTROYED);
                w54.o(Y54.g);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            if (C0219Br3.d(c0219Br3.b)) {
                c0219Br3.f(EnumC3372Zy2.INVALID_SURVEY_PAYLOAD);
                w54.o(Y54.l);
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                return;
            }
            if (OP0.c(J61.a(OP0.b))) {
                C9168qq3 c9168qq3 = c0219Br3.b.h.k;
                if (c9168qq3 == null) {
                    c9168qq3 = C9168qq3.o;
                }
                c9168qq3.getClass();
                if (!new C1117Ip1(c9168qq3.m, C9168qq3.n).contains(EnumC8825pq3.h)) {
                    c0219Br3.f(EnumC3372Zy2.INVALID_COMPLETION_STYLE);
                    w54.o(Y54.i);
                    c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                    return;
                }
                C10539uq3 c10539uq3 = c0219Br3.b.h.l;
                if (c10539uq3 == null) {
                    c10539uq3 = C10539uq3.n;
                }
                c10539uq3.getClass();
                if (!new C1117Ip1(c10539uq3.l, C10539uq3.m).contains(EnumC10196tq3.i)) {
                    c0219Br3.f(EnumC3372Zy2.INVALID_PROMPT_STYLE);
                    w54.o(Y54.j);
                    c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
                    return;
                }
            }
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                c0219Br3.c = a == null ? "" : a.name;
                c0219Br3.d = arrayList;
                C2553Tq3 c2553Tq3 = c0219Br3.b.h;
                Answer a2 = c0219Br3.a(activity);
                if (activity instanceof VS0) {
                    h h0 = ((VS0) activity).h0();
                    if (h0.B("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                        SurveyDataImpl surveyDataImpl = c0219Br3.b;
                        String str2 = surveyDataImpl.a;
                        C7456lr3 c7456lr3 = surveyDataImpl.i;
                        Integer b = C0219Br3.b(c2553Tq3, c4751dz2);
                        C6550jD2 c6550jD2 = new C6550jD2();
                        c6550jD2.E0(C6208iD2.b(str2, c2553Tq3, c7456lr3, a2, 777, true, b, enumC3721az2, enumC4408cz2));
                        C10547us c10547us = new C10547us(h0);
                        c10547us.j(R.id.survey_container, c6550jD2, "com.google.android.libraries.surveys.internal.PromptDialogFragment");
                        c10547us.e(true);
                    } else {
                        Log.w("SurveyController", "PromptDialog was already open, bailing out.");
                    }
                } else {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    if (fragmentManager.findFragmentByTag("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                        SurveyDataImpl surveyDataImpl2 = c0219Br3.b;
                        String str3 = surveyDataImpl2.a;
                        C7456lr3 c7456lr32 = surveyDataImpl2.i;
                        Integer b2 = C0219Br3.b(c2553Tq3, c4751dz2);
                        DialogFragmentC10568uv2 dialogFragmentC10568uv2 = new DialogFragmentC10568uv2();
                        dialogFragmentC10568uv2.setArguments(C6208iD2.b(str3, c2553Tq3, c7456lr32, a2, 777, true, b2, enumC3721az2, enumC4408cz2));
                        fragmentManager.beginTransaction().replace(R.id.survey_container, dialogFragmentC10568uv2, "com.google.android.libraries.surveys.internal.PromptDialogFragment").commitAllowingStateLoss();
                    } else {
                        Log.w("SurveyController", "PromptDialog was already open, bailing out.");
                    }
                }
                c0219Br3.e((C3421a64) w54.j(), c5364fm3, activity);
            }
        }
    }
}
