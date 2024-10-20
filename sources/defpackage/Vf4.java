package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Vf4 {
    public final Pf4 a;
    public Long b;
    public Fl4 c;
    public final InterfaceC0079Ap3 d;
    public final Rf4 e;
    public final C12157za2 f = new C12157za2();
    public final Runnable g;
    public final InterfaceC7697ma2 h;
    public Boolean i;
    public boolean j;

    public final boolean e(WindowAndroid windowAndroid, Intent intent, int i, int i2) {
        EI2.h(i, 5, "VoiceInteraction.StartEventSource");
        EI2.h(i2, 2, "VoiceInteraction.StartEventTarget");
        return windowAndroid.z(intent, new Sf4(this, i, i2), Integer.valueOf(R.string.f90170_resource_name_obfuscated_res_0x7f140baf)) >= 0;
    }

    public Vf4(Pf4 pf4, C0538Ed2 c0538Ed2, Runnable runnable, InterfaceC7697ma2 interfaceC7697ma2) {
        C4496dF c4496dF = new C4496dF();
        this.a = pf4;
        this.d = c0538Ed2;
        this.g = runnable;
        this.e = new Rf4();
        this.h = interfaceC7697ma2;
        ((C8385oa2) interfaceC7697ma2).m(c4496dF.b(new Callback() { // from class: Mf4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Vf4.this.c();
            }
        }));
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Qf4) c11814ya2.next()).u();
            }
        }
    }

    public final void h(int i) {
        Object obj = ThreadUtils.a;
        this.b = Long.valueOf(SystemClock.elapsedRealtime());
        Pf4 pf4 = this.a;
        WindowAndroid windowAndroid = ((g) pf4).w;
        if (windowAndroid == null) {
            ((g) pf4).O();
            return;
        }
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            ((g) pf4).O();
            return;
        }
        if (!Wf4.c(true)) {
            ((g) pf4).O();
            return;
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.d;
        if (interfaceC0079Ap3.i()) {
            ((C2649Uk) interfaceC0079Ap3.get()).c("");
            if (f(activity, windowAndroid, i)) {
                return;
            }
        }
        if (g(activity, windowAndroid, i)) {
            return;
        }
        AbstractC4851eH1.f("VoiceRecognition", "Couldn't find suitable provider for voice searching", new Object[0]);
    }

    public final boolean g(final Activity activity, final WindowAndroid windowAndroid, final int i) {
        boolean z;
        if (windowAndroid.hasPermission("android.permission.RECORD_AUDIO")) {
            EI2.h(0, 3, "VoiceInteraction.AudioPermissionEvent");
            z = true;
        } else {
            if (windowAndroid.canRequestPermission("android.permission.RECORD_AUDIO")) {
                windowAndroid.b(new String[]{"android.permission.RECORD_AUDIO"}, new InterfaceC0218Br2() { // from class: Lf4
                    @Override // defpackage.InterfaceC0218Br2
                    public final void b(int[] iArr, String[] strArr) {
                        Vf4 vf4 = Vf4.this;
                        vf4.getClass();
                        int length = iArr.length;
                        Pf4 pf4 = vf4.a;
                        if (length != 1) {
                            EI2.h(1, 3, "VoiceInteraction.AudioPermissionEvent");
                            ((g) pf4).O();
                            return;
                        }
                        int i2 = iArr[0];
                        WindowAndroid windowAndroid2 = windowAndroid;
                        if (i2 == 0) {
                            vf4.g(activity, windowAndroid2, i);
                            return;
                        }
                        if (!windowAndroid2.canRequestPermission("android.permission.RECORD_AUDIO")) {
                            EI2.h(2, 3, "VoiceInteraction.AudioPermissionEvent");
                            vf4.c();
                            ((g) pf4).O();
                        } else {
                            EI2.h(1, 3, "VoiceInteraction.AudioPermissionEvent");
                            ((g) pf4).O();
                        }
                    }
                });
            } else {
                EI2.h(2, 3, "VoiceInteraction.AudioPermissionEvent");
                c();
            }
            z = false;
        }
        if (!z) {
            ((g) this.a).O();
            return false;
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("calling_package", activity.getComponentName().flattenToString());
        intent.putExtra("android.speech.extra.WEB_SEARCH_ONLY", true);
        if (e(windowAndroid, intent, i, 0)) {
            return true;
        }
        Wf4.a(false);
        c();
        EI2.h(i, 5, "VoiceInteraction.FailureEventSource");
        EI2.h(0, 2, "VoiceInteraction.FailureEventTarget");
        return false;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [Of4] */
    public final boolean f(final Activity activity, final WindowAndroid windowAndroid, final int i) {
        boolean z;
        String a;
        InterfaceC2259Rk c1220Jk;
        final C2649Uk c2649Uk = (C2649Uk) this.d.get();
        if (c2649Uk == null) {
            return false;
        }
        if (!(c2649Uk.o && c2649Uk.b(null, true))) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        boolean z2 = N.M09VlOh_("AssistantNonPersonalizedVoiceSearch") ? false : !c2649Uk.k.c("Chrome.Assistant.Enabled");
        Pf4 pf4 = this.a;
        if (z2) {
            ((g) pf4).Z(null, 12, false);
            Q83 q83 = O83.a;
            Runnable runnable = this.g;
            QB a2 = UB.a(windowAndroid);
            ZX1 s = windowAndroid.s();
            final ?? r13 = new Callback() { // from class: Of4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Vf4 vf4 = Vf4.this;
                    vf4.getClass();
                    boolean booleanValue = bool.booleanValue();
                    C2649Uk c2649Uk2 = c2649Uk;
                    if (booleanValue) {
                        new C2389Sk(c2649Uk2, c2649Uk2.a()).c(AbstractC0185Bl.e);
                    } else {
                        c2649Uk2.getClass();
                    }
                    boolean booleanValue2 = bool.booleanValue();
                    Activity activity2 = activity;
                    WindowAndroid windowAndroid2 = windowAndroid;
                    int i2 = i;
                    if (booleanValue2) {
                        if (vf4.f(activity2, windowAndroid2, i2)) {
                            return;
                        }
                        vf4.g(activity2, windowAndroid2, i2);
                        return;
                    }
                    vf4.g(activity2, windowAndroid2, i2);
                }
            };
            boolean M09VlOh_ = N.M09VlOh_("AssistantConsentModal");
            C1861Oi1 c1861Oi1 = windowAndroid.j;
            if (M09VlOh_) {
                if (s == null) {
                    PostTask.c(QF3.i, new Runnable() { // from class: Kk
                        @Override // java.lang.Runnable
                        public final void run() {
                            r13.onResult(Boolean.FALSE);
                        }
                    });
                } else {
                    c1220Jk = new C1999Pk((Context) c1861Oi1.get(), s);
                    C1609Mk c1609Mk = new C1609Mk(windowAndroid, q83, r13, runnable, c1220Jk);
                    c1609Mk.j.i(c1609Mk);
                }
            } else if (a2 == null) {
                PostTask.c(QF3.i, new Runnable() { // from class: Lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        r13.onResult(Boolean.FALSE);
                    }
                });
            } else {
                c1220Jk = new C1220Jk((Context) c1861Oi1.get(), a2);
                C1609Mk c1609Mk2 = new C1609Mk(windowAndroid, q83, r13, runnable, c1220Jk);
                c1609Mk2.j.i(c1609Mk2);
            }
            return true;
        }
        if (!c2649Uk.d()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("com.android.chrome.voice.VOICE_ENTRYPOINT", i);
        intent.putExtra("com.android.chrome.voice.INTENT_SENT_TIMESTAMP", System.currentTimeMillis());
        if (AbstractC8293oI0.a() && N.M09VlOh_("AssistantIntentExperimentId")) {
            String MMltG$kc = N.MMltG$kc("AssistantIntentExperimentId", "experiment_id");
            if (!TextUtils.isEmpty(MMltG$kc)) {
                intent.putExtra("com.android.chrome.voice.EXPERIMENT_ID", MMltG$kc);
            }
        }
        if (AbstractC8293oI0.a() && !N.M09VlOh_("AssistantNonPersonalizedVoiceSearch")) {
            CoreAccountInfo b = c2649Uk.l.b(1);
            intent.putExtra("com.android.chrome.voice.INTENT_USER_EMAIL", b == null ? null : b.getEmail());
            if ((i == 4 && AbstractC8293oI0.a() && N.M09VlOh_("AssistantIntentPageUrl")) && (a = a()) != null) {
                intent.putExtra("com.android.chrome.voice.PAGE_URL", a);
            }
            if (i == 4 && AbstractC8293oI0.a() && N.M09VlOh_("AssistantIntentTranslateInfo")) {
                InterfaceC3472aG1 interfaceC3472aG1 = ((g) pf4).j;
                Tab a3 = interfaceC3472aG1 != null ? interfaceC3472aG1.a() : null;
                if (a3 != null && !a3.isIncognito()) {
                    this.e.getClass();
                    if (N.Mx5ZGJOG(a3.b(), false)) {
                        String a4 = a();
                        String Mkdg1mTW = N.Mkdg1mTW(a3.b());
                        String Mijf24vV = N.Mijf24vV(a3.b());
                        if (!TextUtils.isEmpty(a4) && !TextUtils.isEmpty(Mkdg1mTW) && !TextUtils.isEmpty(Mijf24vV)) {
                            intent.putExtra("com.android.chrome.voice.TRANSLATE_ORIGINAL_LANGUAGE", Mkdg1mTW);
                            intent.putExtra("com.android.chrome.voice.TRANSLATE_CURRENT_LANGUAGE", Mijf24vV);
                            if (!intent.hasExtra("com.android.chrome.voice.PAGE_URL")) {
                                intent.putExtra("com.android.chrome.voice.PAGE_URL", a4);
                            }
                            String MMKf4EpW = N.MMKf4EpW();
                            if (!TextUtils.isEmpty(MMKf4EpW)) {
                                intent.putExtra("com.android.chrome.voice.TRANSLATE_TARGET_LANGUAGE", MMKf4EpW);
                            }
                            z = true;
                            EI2.b("VoiceInteraction.AssistantIntent.TranslateExtrasAttached", z);
                        }
                    }
                }
                z = false;
                EI2.b("VoiceInteraction.AssistantIntent.TranslateExtrasAttached", z);
            }
        }
        if (e(windowAndroid, intent, i, 1)) {
            return true;
        }
        c();
        EI2.h(i, 5, "VoiceInteraction.FailureEventSource");
        EI2.h(1, 2, "VoiceInteraction.FailureEventTarget");
        return false;
    }

    public final String a() {
        Tab a;
        InterfaceC3472aG1 interfaceC3472aG1 = ((g) this.a).j;
        if (interfaceC3472aG1 == null || (a = interfaceC3472aG1.a()) == null || a.isIncognito()) {
            return null;
        }
        GURL url = a.getUrl();
        if (T34.h(url)) {
            return url.i();
        }
        return null;
    }

    public final boolean b() {
        WindowAndroid windowAndroid;
        Pf4 pf4 = this.a;
        InterfaceC3472aG1 interfaceC3472aG1 = ((g) pf4).j;
        if (interfaceC3472aG1 == null || interfaceC3472aG1.isIncognito() || (windowAndroid = ((g) pf4).w) == null || windowAndroid.k().get() == null || !Wf4.c(false)) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("IsVoiceSearchEnabledCache")) {
            return Wf4.b(windowAndroid);
        }
        if (this.i == null) {
            this.i = Boolean.valueOf(Wf4.b(windowAndroid));
            if (!this.j) {
                ApplicationStatus.d(new InterfaceC11522xj() { // from class: Nf4
                    @Override // defpackage.InterfaceC11522xj
                    public final void n(int i) {
                        Vf4 vf4 = Vf4.this;
                        if (i == 2) {
                            vf4.i = null;
                        } else {
                            vf4.getClass();
                        }
                    }
                });
                this.j = true;
            }
        }
        return this.i.booleanValue();
    }

    public static void d(int i, boolean z) {
        EI2.b("VoiceInteraction.VoiceSearchResult", z);
        String str = i != 0 ? i != 1 ? null : "Assistant" : "System";
        if (str != null) {
            EI2.b("VoiceInteraction.VoiceSearchResult.".concat(str), z);
        }
    }
}
