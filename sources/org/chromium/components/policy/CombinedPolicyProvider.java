package org.chromium.components.policy;

import defpackage.AbstractC6117hx2;
import defpackage.C4398cx2;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CombinedPolicyProvider {
    public static CombinedPolicyProvider g;
    public long a;
    public PolicyConverter b;
    public C4398cx2 c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public static CombinedPolicyProvider a() {
        if (g == null) {
            g = new CombinedPolicyProvider();
        }
        return g;
    }

    public static CombinedPolicyProvider linkNative(long j, PolicyConverter policyConverter) {
        Object obj = ThreadUtils.a;
        CombinedPolicyProvider a = a();
        a.a = j;
        a.b = policyConverter;
        if (j != 0) {
            if (a.d.isEmpty()) {
                C4398cx2 c4398cx2 = new C4398cx2();
                a.c = c4398cx2;
                c4398cx2.b = 0;
                c4398cx2.a = a;
            }
            a.refreshPolicies();
        }
        return a();
    }

    public final void b(AbstractC6117hx2 abstractC6117hx2) {
        if (this.c != null) {
            this.c = null;
        }
        this.d.add(abstractC6117hx2);
        this.e.add(null);
        abstractC6117hx2.b = r0.size() - 1;
        abstractC6117hx2.a = this;
        abstractC6117hx2.d();
        if (this.a != 0) {
            abstractC6117hx2.c();
        }
    }

    public void refreshPolicies() {
        C4398cx2 c4398cx2 = this.c;
        int i = 0;
        if (c4398cx2 != null) {
            c4398cx2.c();
            return;
        }
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                break;
            }
            arrayList.set(i, null);
            i++;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((AbstractC6117hx2) it.next()).c();
        }
    }
}
