package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedPageInformation;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fm4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5365fm4 extends BA0 {
    public final /* synthetic */ C8459om4 a;

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        C8459om4 c8459om4 = this.a;
        c8459om4.j.d = null;
        C10173tm4 c10173tm4 = c8459om4.h;
        Q53 q53 = c10173tm4.g;
        if (q53 != null) {
            q53.b();
            c10173tm4.g.t.b();
            c10173tm4.g = null;
        }
    }

    public C5365fm4(C8459om4 c8459om4) {
        this.a = c8459om4;
    }

    @Override // defpackage.BA0
    public final void f0(TabImpl tabImpl) {
        GURL url = tabImpl.getUrl();
        if (tabImpl.isIncognito()) {
            AbstractC4851eH1.d("WFFollowIntroCtrl", "No intro: tab is incognito", new Object[0]);
            return;
        }
        if (url.h().equals("http") || url.h().equals("https")) {
            final C7771mm4 c7771mm4 = this.a.j;
            Callback callback = new Callback() { // from class: em4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r4v8, types: [bm4] */
                /* JADX WARN: Type inference failed for: r6v5, types: [am4] */
                @Override // org.chromium.base.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onResult(java.lang.Object r20) {
                    /*
                        Method dump skipped, instructions count: 404
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C5021em4.onResult(java.lang.Object):void");
                }
            };
            final C7427lm4 c7427lm4 = new C7427lm4();
            c7771mm4.d = c7427lm4;
            c7427lm4.a = tabImpl;
            c7427lm4.b = url;
            c7427lm4.c = callback;
            System.nanoTime();
            QF3 qf3 = AbstractC5103f04.a;
            Runnable runnable = new Runnable() { // from class: im4
                /* JADX WARN: Type inference failed for: r3v0, types: [km4] */
                @Override // java.lang.Runnable
                public final void run() {
                    final C7771mm4 c7771mm42 = C7771mm4.this;
                    boolean a = c7771mm42.c.a("webfeed_follow_intro_debug.enable");
                    final C7427lm4 c7427lm42 = c7427lm4;
                    if (a) {
                        AbstractC4851eH1.d("WFFollowIntroCtrl", "Intro debug mode is enabled: some checks will be skipped", new Object[0]);
                        if (!c7771mm42.a(c7427lm42)) {
                            c7771mm42.b(c7427lm42, null);
                            return;
                        } else {
                            N.MSWj76M1(new WebFeedBridge$WebFeedPageInformation(c7427lm42.a, c7427lm42.b), 1, new C6739jm4(c7771mm42, c7427lm42));
                            return;
                        }
                    }
                    if (c7771mm42.a(c7427lm42)) {
                        GURL gurl = c7427lm42.b;
                        final ?? r3 = new Callback() { // from class: km4
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                Ml4 ml4 = (Ml4) obj;
                                C7771mm4 c7771mm43 = C7771mm4.this;
                                c7771mm43.getClass();
                                int i = ml4.a;
                                int i2 = c7771mm43.b;
                                int i3 = ml4.b;
                                int i4 = c7771mm43.a;
                                boolean z = i >= i4 && i3 >= i2;
                                C7427lm4 c7427lm43 = c7427lm42;
                                if (!z) {
                                    AbstractC4851eH1.d("WFFollowIntroCtrl", "No intro: visit requirement not met. totalVisits=%s (minToShow=%s),  dailyVisits=%s (minToShow=%s)", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2));
                                    c7771mm43.b(c7427lm43, null);
                                } else if (!c7771mm43.a(c7427lm43)) {
                                    c7771mm43.b(c7427lm43, null);
                                } else {
                                    N.MSWj76M1(new WebFeedBridge$WebFeedPageInformation(c7427lm43.a, c7427lm43.b), 1, new C6739jm4(c7771mm43, c7427lm43));
                                }
                            }
                        };
                        N.Mtbhx3K5(gurl, new Callback() { // from class: Kl4
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                int[] iArr = (int[]) obj;
                                r3.onResult(new Ml4(iArr[0], iArr[1]));
                            }
                        });
                    }
                }
            };
            C7928nE c7928nE = UN.a;
            PostTask.b(qf3, runnable, N.M37SqSAy("WebFeed", "intro-wait-time-millis", 3000));
            return;
        }
        AbstractC4851eH1.d("WFFollowIntroCtrl", "No intro: URL scheme is not HTTP or HTTPS: " + url.j(), new Object[0]);
    }
}
