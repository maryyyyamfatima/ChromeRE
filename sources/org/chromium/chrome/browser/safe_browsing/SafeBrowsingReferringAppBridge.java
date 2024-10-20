package org.chromium.chrome.browser.safe_browsing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2281Ro1;
import defpackage.C1761No1;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafeBrowsingReferringAppBridge {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class ReferringAppInfo {
        public final int a;
        public final String b;

        public ReferringAppInfo(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public int getSource() {
            return this.a;
        }

        public String getName() {
            return this.b;
        }
    }

    public static ReferringAppInfo getReferringAppInfo(WindowAndroid windowAndroid) {
        Intent intent;
        Activity activity = (Activity) windowAndroid.k().get();
        String str = "";
        if (activity != null && (intent = activity.getIntent()) != null) {
            int c = C1761No1.c(intent);
            if (c != 0) {
                switch (c) {
                    case 0:
                        str = "other";
                        break;
                    case 1:
                        str = "gmail";
                        break;
                    case 2:
                        str = "facebook";
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        str = "plus";
                        break;
                    case 4:
                        str = "twitter";
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        str = "chrome";
                        break;
                    case 6:
                        str = "google.hangouts";
                        break;
                    case 7:
                        str = "android.messages";
                        break;
                    case 8:
                        str = "google.news";
                        break;
                    case 9:
                        str = "line";
                        break;
                    case 10:
                        str = "whatsapp";
                        break;
                    case 11:
                        str = "google.search.app";
                        break;
                    case 12:
                        str = "webapk";
                        break;
                    case 13:
                        str = "yahoo.mail";
                        break;
                    case 14:
                        str = "viber";
                        break;
                    case 15:
                        str = "youtube";
                        break;
                }
                return new ReferringAppInfo(1, str);
            }
            String w = AbstractC2281Ro1.w(intent, "com.android.browser.application_id");
            if (w != null) {
                return new ReferringAppInfo(2, w);
            }
            String w2 = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.activity_referrer");
            if (w2 != null) {
                return new ReferringAppInfo(3, w2);
            }
            Uri referrer = activity.getReferrer();
            if (referrer != null) {
                return new ReferringAppInfo(3, referrer.toString());
            }
            return new ReferringAppInfo(0, "");
        }
        return new ReferringAppInfo(0, "");
    }
}
