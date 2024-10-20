package org.chromium.components.policy;

import J.N;
import android.content.SharedPreferences;
import android.util.Pair;
import defpackage.C4055bx2;
import defpackage.C7432ln3;
import defpackage.EnumC3711ax2;
import defpackage.V60;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PolicyCacheUpdater {
    public static final List a;

    static {
        EnumC3711ax2 enumC3711ax2 = EnumC3711ax2.List;
        a = Arrays.asList(Pair.create("BrowserSignin", EnumC3711ax2.Integer), Pair.create("CloudManagementEnrollmentToken", EnumC3711ax2.String), Pair.create("URLAllowlist", enumC3711ax2), Pair.create("URLBlocklist", enumC3711ax2));
    }

    public static void cachePolicies(PolicyMap policyMap) {
        String MKY_klU2;
        C4055bx2 a2 = C4055bx2.a();
        a2.c.getClass();
        C7432ln3 c = C7432ln3.c();
        try {
            SharedPreferences.Editor edit = V60.a.getSharedPreferences("Components.Policy", 0).edit();
            c.close();
            edit.clear();
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    edit.apply();
                    a2.b = null;
                    a2.a = false;
                    return;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.first;
                int ordinal = ((EnumC3711ax2) pair.second).ordinal();
                if (ordinal == 0) {
                    long j = policyMap.a;
                    Integer valueOf = N.MImr1kgV(j, policyMap, str) ? Integer.valueOf(N.MNIDvfzY(j, policyMap, str)) : null;
                    if (valueOf != null) {
                        edit.putInt(str, valueOf.intValue());
                    }
                } else if (ordinal == 1) {
                    long j2 = policyMap.a;
                    Boolean valueOf2 = N.MImr1kgV(j2, policyMap, str) ? Boolean.valueOf(N.MG3FgY5r(j2, policyMap, str)) : null;
                    if (valueOf2 != null) {
                        edit.putBoolean(str, valueOf2.booleanValue());
                    }
                } else if (ordinal == 2) {
                    String MEWWQoKk = N.MEWWQoKk(policyMap.a, policyMap, str);
                    if (MEWWQoKk != null) {
                        edit.putString(str, MEWWQoKk);
                    }
                } else if (ordinal == 3) {
                    String MQRev50_ = N.MQRev50_(policyMap.a, policyMap, str);
                    if (MQRev50_ != null) {
                        edit.putString(str, MQRev50_);
                    }
                } else if (ordinal == 4 && (MKY_klU2 = N.MKY_klU2(policyMap.a, policyMap, str)) != null) {
                    edit.putString(str, MKY_klU2);
                }
            }
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
