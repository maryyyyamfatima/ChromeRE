package defpackage;

import J.N;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6241iK0 implements InterfaceC2548Tp3 {
    public final QI0 a;
    public final /* synthetic */ FeedStream b;

    public final void b(View view, String str) {
        FeedStream feedStream = this.b;
        N.MAzH_k9s(feedStream.d, feedStream, (GURL) feedStream.a.apply(str), feedStream.e(view));
        c(1, str);
        feedStream.f(feedStream.o);
    }

    public final void c(final int i, final String str) {
        FeedStream feedStream;
        InterfaceC7610mJ0 interfaceC7610mJ0;
        final boolean z = i == 4 || i == 8;
        if (i != 4 && (interfaceC7610mJ0 = (feedStream = this.b).x) != null && interfaceC7610mJ0.g()) {
            feedStream.x.c(46, SystemClock.elapsedRealtimeNanos());
        }
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: cK0
            /* JADX WARN: Type inference failed for: r1v3, types: [SI0] */
            /* JADX WARN: Type inference failed for: r2v1, types: [dK0] */
            /* JADX WARN: Type inference failed for: r3v2, types: [eK0] */
            @Override // java.lang.Runnable
            public final void run() {
                final C6241iK0 c6241iK0 = C6241iK0.this;
                c6241iK0.getClass();
                LoadUrlParams loadUrlParams = new LoadUrlParams(str, 2);
                final boolean z2 = z;
                ?? r2 = new Runnable() { // from class: dK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedStream feedStream2 = C6241iK0.this.b;
                        N.M6FEpeaw(feedStream2.d, feedStream2, z2);
                    }
                };
                final ?? r3 = new Callback() { // from class: eK0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        N.MXctRyHn(((PI0) obj).a);
                    }
                };
                UI0 ui0 = (UI0) c6241iK0.a;
                ui0.getClass();
                C7928nE c7928nE = UN.a;
                String MMltG$kc = N.MMltG$kc("InterestFeedV2", "referrer_url");
                if (TextUtils.isEmpty(MMltG$kc)) {
                    MMltG$kc = "https://www.google.com/";
                }
                loadUrlParams.e = new C3498aL2(MMltG$kc, 0);
                Tab d = ui0.a.d(i, loadUrlParams);
                R32.a(8);
                if (d != null) {
                    d.v(new TI0(r2));
                    d.v(new V12(new Callback() { // from class: SI0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            PI0 pi0 = new PI0();
                            pi0.a = ((U12) obj).a;
                            r3.onResult(pi0);
                        }
                    }, d));
                }
                AbstractC5241fQ2.g("Chrome.StartSurface.TapFeedCardsCount");
            }
        });
    }

    public C6241iK0(FeedStream feedStream, QI0 qi0) {
        this.b = feedStream;
        this.a = qi0;
    }

    public final void d(C2460Sy0 c2460Sy0, View view) {
        FeedStream feedStream = this.b;
        feedStream.b();
        N.MakGUIs_(feedStream.d, feedStream, 9);
        feedStream.L = feedStream.c.getCurrentFocus();
        feedStream.M = a(view);
        feedStream.f11523J = new C11368xG(c2460Sy0);
        feedStream.K = feedStream.e(view);
        C5897hK0 c5897hK0 = new C5897hK0(this);
        QB qb = feedStream.I;
        ((m) qb).a(c5897hK0);
        ((m) qb).p(feedStream.f11523J, true);
    }

    public static View a(View view) {
        if (view == null || view.isAccessibilityFocused()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View a = a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
