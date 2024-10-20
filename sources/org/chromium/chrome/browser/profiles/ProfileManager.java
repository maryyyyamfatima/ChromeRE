package org.chromium.chrome.browser.profiles;

import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC10665vC2;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ProfileManager {
    public static final C12157za2 a = new C12157za2();
    public static boolean b;

    public static void a(InterfaceC10665vC2 interfaceC10665vC2) {
        a.a(interfaceC10665vC2);
    }

    public static void onProfileAdded(Profile profile) {
        b = true;
        Iterator it = a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC10665vC2) c11814ya2.next()).b(profile);
            }
        }
    }
}
