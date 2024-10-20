package org.chromium.base;

import J.N;
import defpackage.C12157za2;
import defpackage.InterfaceC8000nS1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MemoryPressureListener {
    public static C12157za2 a;

    public static void addNativeCallback() {
        Object obj = ThreadUtils.a;
        a(new InterfaceC8000nS1() { // from class: oS1
            @Override // defpackage.InterfaceC8000nS1
            public final void a(int i) {
                N.MZJzyjAa(i);
            }
        });
    }

    public static void a(InterfaceC8000nS1 interfaceC8000nS1) {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = new C12157za2();
        }
        a.a(interfaceC8000nS1);
    }
}
