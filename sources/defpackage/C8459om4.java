package defpackage;

import J.N;
import android.app.Activity;
import android.util.Base64;
import android.widget.ImageButton;
import androidx.appcompat.app.a;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: om4 */
/* loaded from: classes.dex */
public final class C8459om4 {
    public static final long l = TimeUnit.DAYS.toMillis(1);
    public final KH a = new KH();
    public final Activity b;
    public final C10452uc0 c;
    public final PrefService d;
    public final Q83 e;
    public final KU3 f;
    public final Sm4 g;
    public final C10173tm4 h;
    public final InterfaceC7697ma2 i;
    public final C7771mm4 j;
    public final long k;

    public C8459om4(a aVar, C1340Ki c1340Ki, C6166i6 c6166i6, ImageButton imageButton, C4151cE3 c4151cE3, ZX1 zx1, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        PrefService a = R44.a(Profile.d());
        this.d = a;
        this.e = O83.a;
        this.j = new C7771mm4(a);
        this.b = aVar;
        this.i = c6166i6;
        KU3 a2 = LU3.a(Profile.d());
        this.f = a2;
        this.g = new Sm4(aVar, c4151cE3, zx1, viewOnClickListenerC1069If3);
        this.h = new C10173tm4(aVar, c1340Ki, imageButton, a2, new Runnable() { // from class: Yl4
            public /* synthetic */ Yl4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8459om4 c8459om4 = C8459om4.this;
                if (c8459om4.d.a("webfeed_follow_intro_debug.enable")) {
                    return;
                }
                c8459om4.f.dismissed("IPH_WebFeedFollow");
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C7928nE c7928nE = UN.a;
        this.k = timeUnit.toMillis(N.M37SqSAy("WebFeed", "intro-appearance-threshold-minutes", 15));
        this.c = new C10452uc0(c6166i6, new C5365fm4(this), new Callback() { // from class: Zl4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8459om4.this.j.d = null;
            }
        });
    }

    public final void a(C8115nm4 c8115nm4) {
        if (!this.d.a("webfeed_follow_intro_debug.enable")) {
            this.a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Q83 q83 = this.e;
            q83.s(currentTimeMillis, "Chrome.WebFeed.IntroLastShownTimeMs");
            q83.s(currentTimeMillis, AbstractC6265iP.p.b(Base64.encodeToString(c8115nm4.a, 0)));
            String b = AbstractC6265iP.q.b(Base64.encodeToString(c8115nm4.a, 0));
            q83.s(q83.h(b) + 1, b);
        }
        AbstractC4851eH1.d("WFFollowIntroCtrl", "Allowed intro: all requirements met", new Object[0]);
    }
}
