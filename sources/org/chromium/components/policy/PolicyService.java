package org.chromium.components.policy;

import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC6459ix2;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PolicyService {
    public final long a;
    public final C12157za2 b = new C12157za2();

    public final void onPolicyServiceInitialized() {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6459ix2) c11814ya2.next()).b();
            }
        }
    }

    public final void onPolicyUpdated(PolicyMap policyMap, PolicyMap policyMap2) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6459ix2) c11814ya2.next()).a();
            }
        }
    }

    public PolicyService(long j) {
        this.a = j;
    }
}
