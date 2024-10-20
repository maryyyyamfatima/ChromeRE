package defpackage;

import J.N;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.components.policy.CombinedPolicyProvider;
import org.chromium.components.policy.PolicyConverter;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hx2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6117hx2 {
    public CombinedPolicyProvider a;
    public int b = -1;

    public abstract void c();

    public void d() {
    }

    public final void b(Bundle bundle) {
        List<Bundle> list;
        Object obj = ThreadUtils.a;
        CombinedPolicyProvider combinedPolicyProvider = this.a;
        int i = this.b;
        if (combinedPolicyProvider.a == 0) {
            return;
        }
        if (combinedPolicyProvider.c != null) {
            list = Arrays.asList(bundle);
        } else {
            ArrayList arrayList = combinedPolicyProvider.e;
            arrayList.set(i, bundle);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Bundle) it.next()) == null) {
                    return;
                }
            }
            list = arrayList;
        }
        for (Bundle bundle2 : list) {
            for (String str : bundle2.keySet()) {
                PolicyConverter policyConverter = combinedPolicyProvider.b;
                Object obj2 = bundle2.get(str);
                policyConverter.getClass();
                if (!(obj2 instanceof Boolean)) {
                    if (!(obj2 instanceof String)) {
                        if (!(obj2 instanceof Integer)) {
                            if (!(obj2 instanceof String[])) {
                                if (obj2 instanceof Bundle) {
                                    Bundle bundle3 = (Bundle) obj2;
                                    try {
                                        N.Mu_Zn154(policyConverter.a, policyConverter, str, PolicyConverter.b(bundle3).toString());
                                    } catch (JSONException unused) {
                                        AbstractC4851eH1.f("PolicyConverter", "Invalid bundle in app restrictions " + bundle3.toString() + " for key " + str, new Object[0]);
                                    }
                                } else if (obj2 instanceof Bundle[]) {
                                    Bundle[] bundleArr = (Bundle[]) obj2;
                                    try {
                                        N.Mu_Zn154(policyConverter.a, policyConverter, str, PolicyConverter.a(bundleArr).toString());
                                    } catch (JSONException unused2) {
                                        AbstractC4851eH1.f("PolicyConverter", AbstractC10204ts.a(new StringBuilder("Invalid bundle array in app restrictions "), Arrays.toString(bundleArr), " for key ", str), new Object[0]);
                                    }
                                }
                            } else {
                                N.MLFU3fY7(policyConverter.a, policyConverter, str, (String[]) obj2);
                            }
                        } else {
                            N.MX$FOTbg(policyConverter.a, policyConverter, str, ((Integer) obj2).intValue());
                        }
                    } else {
                        N.Mu_Zn154(policyConverter.a, policyConverter, str, (String) obj2);
                    }
                } else {
                    N.MNcVehwq(policyConverter.a, policyConverter, str, ((Boolean) obj2).booleanValue());
                }
            }
        }
        N.M81oD3lB(combinedPolicyProvider.a, CombinedPolicyProvider.a());
    }
}
