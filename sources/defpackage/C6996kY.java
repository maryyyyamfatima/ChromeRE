package defpackage;

import J.N;
import android.app.NotificationChannel;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kY */
/* loaded from: classes.dex */
public final class C6996kY implements InterfaceC3657ao2 {
    public final /* synthetic */ C7340lY a;

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        int i;
        int i2;
        NotificationChannel notificationChannel;
        int importance;
        C7340lY c7340lY = this.a;
        c7340lY.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Q83 q83 = c7340lY.d;
        long g = currentTimeMillis - q83.g(-1L, "Chrome.CommerceSubscriptions.ChromeManagedTimestamp");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int seconds = (int) TimeUnit.DAYS.toSeconds(1L);
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            seconds = N.M37SqSAy("CommercePriceTracking", "price_tracking_stale_tab_lower_bound_seconds", seconds);
        }
        if (g < timeUnit.toMillis(seconds)) {
            return;
        }
        q83.s(System.currentTimeMillis(), "Chrome.CommerceSubscriptions.ChromeManagedTimestamp");
        final C5966hY c5966hY = c7340lY.f;
        c5966hY.getClass();
        if (US.a(C1202Jg1.a(), 1)) {
            PrefService a = R44.a(Profile.d());
            i = a != null && a.a("web_and_app_activity_enabled_for_shopping") ? 2 : 1;
        } else {
            i = 0;
        }
        EI2.h(i, 3, "Commerce.SignIn.AccountWaaStatus");
        if (AbstractC1947Oz2.c()) {
            C8875pz2 c8875pz2 = (C8875pz2) c7340lY.e;
            c8875pz2.getClass();
            if (AbstractC1947Oz2.c()) {
                boolean a2 = c8875pz2.a();
                EI2.b("Commerce.PriceDrop.SystemNotificationEnabled", a2);
                if (a2 && (i2 = Build.VERSION.SDK_INT) >= 26) {
                    C6861k72 c6861k72 = ((C7549m72) c8875pz2.b).a;
                    if (i2 < 26) {
                        c6861k72.getClass();
                        notificationChannel = null;
                    } else {
                        notificationChannel = c6861k72.b.getNotificationChannel("shopping_price_drop_alerts");
                    }
                    boolean z = notificationChannel != null;
                    EI2.b("Commerce.PriceDrop.NotificationChannelCreated", z);
                    if (z) {
                        importance = notificationChannel.getImportance();
                        EI2.b("Commerce.PriceDrop.NotificationChannelBlocked", importance == 0);
                    }
                }
            }
            EI2.d(c8875pz2.e(32, false), "Commerce.PriceDrops.ChromeManaged.NotificationCount");
            EI2.d(c8875pz2.e(33, false), "Commerce.PriceDrops.UserManaged.NotificationCount");
            c7340lY.a.a("PRICE_TRACK", false, new Callback() { // from class: iY
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C5966hY.this.getClass();
                    Iterator it = ((List) obj).iterator();
                    int i3 = 0;
                    int i4 = 0;
                    while (it.hasNext()) {
                        String str = ((CommerceSubscription) it.next()).d;
                        if ("CHROME_MANAGED".equals(str)) {
                            i3++;
                        } else if ("USER_MANAGED".equals(str)) {
                            i4++;
                        }
                    }
                    EI2.c(i3, "Commerce.Subscriptions.ChromeManaged.Count");
                    EI2.c(i4, "Commerce.Subscriptions.UserManaged.Count");
                }
            });
            final C2511Ti1 c2511Ti1 = c7340lY.g;
            if (c2511Ti1 != null) {
                final HashSet hashSet = new HashSet();
                TabModel j = ((AbstractC11276wz3) c2511Ti1.a).j(false);
                for (int i3 = 0; i3 < j.getCount(); i3++) {
                    final Tab tabAt = j.getTabAt(i3);
                    C10307u93.o(new C2251Ri1(new Callback() { // from class: Pi1
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException
                            */
                        @Override // org.chromium.base.Callback
                        public final void onResult(java.lang.Object r12) {
                            /*
                                r11 = this;
                                java.lang.String r12 = (java.lang.String) r12
                                Ti1 r0 = defpackage.C2511Ti1.this
                                r0.getClass()
                                org.chromium.chrome.browser.tab.Tab r1 = r2
                                r2 = 0
                                if (r12 == 0) goto L5d
                                long r3 = java.lang.System.currentTimeMillis()
                                Nb0 r5 = defpackage.C1695Nb0.m(r1)
                                long r5 = r5.s
                                long r3 = r3 - r5
                                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                                int r6 = defpackage.C10307u93.u
                                boolean r6 = defpackage.AbstractC8293oI0.a()
                                int r7 = defpackage.C10307u93.w
                                java.lang.String r8 = "CommercePriceTracking"
                                if (r6 == 0) goto L2d
                                nE r6 = defpackage.UN.a
                                java.lang.String r6 = "price_tracking_stale_tab_threshold_seconds"
                                int r7 = J.N.M37SqSAy(r8, r6, r7)
                            L2d:
                                long r6 = (long) r7
                                long r6 = r5.toMillis(r6)
                                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                                r7 = 1
                                if (r6 > 0) goto L59
                                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
                                r9 = 1
                                long r9 = r6.toSeconds(r9)
                                int r6 = (int) r9
                                boolean r9 = defpackage.AbstractC8293oI0.a()
                                if (r9 == 0) goto L4e
                                nE r9 = defpackage.UN.a
                                java.lang.String r9 = "price_tracking_stale_tab_lower_bound_seconds"
                                int r6 = J.N.M37SqSAy(r8, r9, r6)
                            L4e:
                                long r8 = (long) r6
                                long r5 = r5.toMillis(r8)
                                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                                if (r3 < 0) goto L59
                                r3 = r7
                                goto L5a
                            L59:
                                r3 = r2
                            L5a:
                                if (r3 == 0) goto L5d
                                r2 = r7
                            L5d:
                                java.lang.String r3 = "Commerce.Subscriptions.TabEligible"
                                defpackage.EI2.b(r3, r2)
                                if (r2 != 0) goto L65
                                goto L8c
                            L65:
                                org.chromium.url.GURL r1 = r1.z()
                                java.lang.String r1 = r1.i()
                                java.util.Set r2 = r3
                                boolean r3 = r2.contains(r1)
                                if (r3 == 0) goto L76
                                goto L8c
                            L76:
                                r2.add(r1)
                                org.chromium.chrome.browser.subscriptions.CommerceSubscription r1 = new org.chromium.chrome.browser.subscriptions.CommerceSubscription
                                java.lang.String r2 = "CHROME_MANAGED"
                                java.lang.String r3 = "OFFER_ID"
                                r1.<init>(r12, r2, r3)
                                Rx2 r12 = new Rx2
                                r12.<init>()
                                Xo3 r0 = r0.c
                                r0.e(r1, r12)
                            L8c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1991Pi1.onResult(java.lang.Object):void");
                        }
                    }), tabAt);
                }
            }
        }
    }

    public C6996kY(C7340lY c7340lY) {
        this.a = c7340lY;
    }
}
