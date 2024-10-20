package org.chromium.chrome.browser.browserservices;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.browser.customtabs.CustomTabsSessionToken;
import defpackage.AbstractC3641al4;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9062qY3;
import defpackage.C10176tn1;
import defpackage.C10712vM;
import defpackage.C7629mN;
import defpackage.RR;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManageTrustedWebActivityDataActivity extends a {
    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String e;
        super.onCreate(bundle);
        String uri = getIntent().getData().toString();
        boolean booleanExtra = getIntent().getBooleanExtra("org.chromium.webapk.is_webapk", false);
        Integer num = null;
        if (booleanExtra) {
            e = getCallingPackage();
        } else {
            CustomTabsSessionToken b = CustomTabsSessionToken.b(getIntent());
            e = b == null ? null : ((CustomTabsConnection) C10712vM.e().d.get()).e(b);
        }
        if (e != null) {
            C7629mN a = C7629mN.a();
            Objects.requireNonNull(a);
            a.f(new Runnable() { // from class: rY3
                @Override // java.lang.Runnable
                public final void run() {
                    FI2.a("TrustedWebActivity.OpenedSettingsViaManageSpace");
                }
            });
            if (booleanExtra) {
                RR.c();
                if (AbstractC3641al4.a(this, e, uri)) {
                    try {
                        num = Integer.valueOf(getPackageManager().getApplicationInfo(e, 0).uid);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (num != null) {
                        AbstractC9062qY3.b(this, uri);
                    }
                }
            } else {
                try {
                    num = Integer.valueOf(getPackageManager().getApplicationInfo(e, 0).uid);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (num != null) {
                    C10176tn1 c10176tn1 = new C10176tn1();
                    String b2 = C10176tn1.b(num.intValue());
                    Set<String> emptySet = Collections.emptySet();
                    SharedPreferences sharedPreferences = c10176tn1.a;
                    Set<String> stringSet = sharedPreferences.getStringSet(b2, emptySet);
                    Set<String> stringSet2 = sharedPreferences.getStringSet(C10176tn1.c(num.intValue()), Collections.emptySet());
                    if (!stringSet.isEmpty() && !stringSet2.isEmpty()) {
                        AbstractC9062qY3.a(this, stringSet2, stringSet);
                    }
                }
            }
        } else {
            AbstractC4851eH1.a("TwaDataActivity", "Package name for incoming intent couldn't be resolved. Was a CustomTabSession created and added to the intent?", new Object[0]);
            finish();
        }
        finish();
    }
}
