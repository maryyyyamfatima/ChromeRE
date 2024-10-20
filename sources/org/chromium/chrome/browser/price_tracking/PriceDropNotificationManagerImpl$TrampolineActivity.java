package org.chromium.chrome.browser.price_tracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C6861k72;
import defpackage.C7629mN;
import defpackage.V60;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.price_tracking.PriceDropNotificationManagerImpl$TrampolineActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PriceDropNotificationManagerImpl$TrampolineActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.price_tracking.DESTINATION_URL");
        String w2 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.price_tracking.ACTION_ID");
        String w3 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.price_tracking.OFFER_ID");
        String w4 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.price_tracking.PRODUCT_CLUSTER_ID");
        new C6861k72(V60.a).b(AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.price_tracking.NOTIFICATION_ID"), "price_drop");
        if (TextUtils.isEmpty(w3)) {
            AbstractC4851eH1.a("PriceDropNotif", "No offer id is provided when handling turn off alert action.", new Object[0]);
            finish();
        } else {
            C7629mN.a().f(new Runnable(w2, w, w3, w4) { // from class: oz2
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ String i;

                {
                    this.h = w3;
                    this.i = w4;
                }

                /* JADX WARN: Type inference failed for: r4v0, types: [lz2] */
                /* JADX WARN: Type inference failed for: r6v1, types: [mz2] */
                @Override // java.lang.Runnable
                public final void run() {
                    int i = PriceDropNotificationManagerImpl$TrampolineActivity.a;
                    PriceDropNotificationManagerImpl$TrampolineActivity priceDropNotificationManagerImpl$TrampolineActivity = PriceDropNotificationManagerImpl$TrampolineActivity.this;
                    priceDropNotificationManagerImpl$TrampolineActivity.getClass();
                    AbstractC7157kz2.a();
                    String str = this.g;
                    str.equals("visit_site");
                    if (str.equals("turn_off_alert")) {
                        final String str2 = this.h;
                        final String str3 = this.i;
                        if (str2 != null || str3 != null) {
                            new C8372oY();
                            C7340lY a2 = C8372oY.a();
                            final C7501lz2 r4 = new Callback() { // from class: lz2
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    AbstractC4851eH1.a("PriceDropNotif", String.format(Locale.US, "Failed to remove subscriptions. Status: %d", (Integer) obj), new Object[0]);
                                }
                            };
                            BookmarkBridge bookmarkBridge = new BookmarkBridge(Profile.d());
                            final C3063Xo3 c3063Xo3 = a2.a;
                            ?? r6 = new Runnable() { // from class: mz2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str4 = str2;
                                    C3063Xo3 c3063Xo32 = c3063Xo3;
                                    Callback callback = r4;
                                    if (str4 != null) {
                                        c3063Xo32.g(new CommerceSubscription(str4, "CHROME_MANAGED", "OFFER_ID"), callback);
                                    }
                                    String str5 = str3;
                                    if (str5 != null) {
                                        c3063Xo32.g(new CommerceSubscription(str5, "USER_MANAGED", "PRODUCT_CLUSTER_ID"), callback);
                                    }
                                }
                            };
                            if (bookmarkBridge.d) {
                                r6.run();
                            } else {
                                bookmarkBridge.b(new C8189nz2(r6, bookmarkBridge));
                            }
                        }
                    }
                    priceDropNotificationManagerImpl$TrampolineActivity.finish();
                }
            });
        }
    }
}
