package org.chromium.chrome.browser.browserservices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.android.chrome.R;
import defpackage.AN3;
import defpackage.C10176tn1;
import defpackage.C10712vM;
import defpackage.C1193Je2;
import defpackage.C12009z72;
import defpackage.C12237zn4;
import defpackage.C2037Pr2;
import defpackage.C72;
import defpackage.C9148qn1;
import defpackage.LX3;
import defpackage.O83;
import defpackage.On4;
import defpackage.Q83;
import defpackage.QC;
import defpackage.V60;
import defpackage.VX3;
import defpackage.Wn4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstalledWebappBroadcastReceiver extends BroadcastReceiver {
    public static final HashSet e = new HashSet(Arrays.asList("android.intent.action.PACKAGE_DATA_CLEARED", "android.intent.action.PACKAGE_FULLY_REMOVED"));
    public final C9148qn1 a;
    public final C10176tn1 b;
    public final QC c;
    public final C2037Pr2 d;

    public InstalledWebappBroadcastReceiver() {
        C9148qn1 c9148qn1 = new C9148qn1();
        C10176tn1 c10176tn1 = new C10176tn1();
        QC qc = new QC((Q83) C10712vM.e().e.get());
        C2037Pr2 c2037Pr2 = (C2037Pr2) C10712vM.e().n.get();
        this.a = c9148qn1;
        this.b = c10176tn1;
        this.c = qc;
        this.d = c2037Pr2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        String schemeSpecificPart;
        C10176tn1 c10176tn1 = this.b;
        if (intent == null || !e.contains(intent.getAction()) || (intExtra = intent.getIntExtra("android.intent.extra.UID", -1)) == -1) {
            return;
        }
        boolean equals = "android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction());
        if (equals && intent.getData() != null && (schemeSpecificPart = intent.getData().getSchemeSpecificPart()) != null && schemeSpecificPart.startsWith("org.chromium.webapk")) {
            O83.a.b("webapk_uninstalled_packages", schemeSpecificPart);
            String b = On4.b(schemeSpecificPart);
            WebappRegistry webappRegistry = Wn4.a;
            webappRegistry.d(b);
            C12237zn4 c = webappRegistry.c(b);
            if (c != null) {
                c.b.edit().putLong("webapk_uninstall_timestamp", System.currentTimeMillis()).apply();
            }
        }
        AN3 an3 = new AN3("BrowserServices.ClientAppDataLoad", 1);
        an3.h = SystemClock.uptimeMillis();
        try {
            if (c10176tn1.e().contains(String.valueOf(intExtra))) {
                an3.close();
                this.a.getClass();
                String b2 = C10176tn1.b(intExtra);
                Set<String> emptySet = Collections.emptySet();
                SharedPreferences sharedPreferences = c10176tn1.a;
                Set<String> stringSet = sharedPreferences.getStringSet(b2, emptySet);
                Set<String> stringSet2 = sharedPreferences.getStringSet(C10176tn1.c(intExtra), Collections.emptySet());
                Iterator<String> it = stringSet2.iterator();
                while (it.hasNext()) {
                    C1193Je2 b3 = C1193Je2.b(it.next());
                    if (b3 != null) {
                        C2037Pr2 c2037Pr2 = this.d;
                        C72 c72 = c2037Pr2.b;
                        c72.getClass();
                        C12009z72 c12009z72 = new C12009z72(c72, b3);
                        VX3 vx3 = c72.b;
                        vx3.getClass();
                        vx3.b(b3.a, new LX3(vx3, V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406df), c12009z72));
                        c2037Pr2.c.a.e(4, b3);
                    }
                }
                String string = sharedPreferences.getString(C10176tn1.a(intExtra), null);
                int i = ClearDataDialogActivity.y;
                Intent intent2 = new Intent(context, (Class<?>) ClearDataDialogActivity.class);
                intent2.putExtra("org.chromium.chrome.extra.app_name", string);
                intent2.putExtra("org.chromium.chrome.extra.domains", new ArrayList(stringSet));
                intent2.putExtra("org.chromium.chrome.extra.origins", new ArrayList(stringSet2));
                intent2.putExtra("org.chromium.chrome.extra.app_uninstalled", equals);
                intent2.addFlags(268959744);
                context.startActivity(intent2);
                String string2 = sharedPreferences.getString(C10176tn1.d(intExtra), null);
                Q83 q83 = this.c.a;
                q83.l("trusted_web_activity_disclosure_accepted_packages", string2);
                q83.l("Chrome.TrustedWebActivities.DisclosureAcceptedPackages", string2);
                if (equals) {
                    HashSet e2 = c10176tn1.e();
                    e2.remove(String.valueOf(intExtra));
                    sharedPreferences.edit().putStringSet("trusted_web_activity_uids", e2).apply();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(C10176tn1.a(intExtra), null);
                    edit.putString(C10176tn1.d(intExtra), null);
                    edit.putStringSet(C10176tn1.b(intExtra), null);
                    edit.putStringSet(C10176tn1.c(intExtra), null);
                    edit.apply();
                }
            }
        } finally {
            try {
                an3.close();
            } catch (Throwable unused) {
            }
        }
    }
}
