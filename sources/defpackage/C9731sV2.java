package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sV2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9731sV2 {
    public final IT2 a = new IT2();
    public boolean b;
    public Bundle c;
    public boolean d;

    public final Bundle a(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
            this.c = null;
        }
        return bundle2;
    }

    public final void b(String str, InterfaceC9388rV2 interfaceC9388rV2) {
        Object obj;
        IT2 it2 = this.a;
        ET2 a = it2.a(str);
        if (a != null) {
            obj = a.g;
        } else {
            ET2 et2 = new ET2(str, interfaceC9388rV2);
            it2.i++;
            ET2 et22 = it2.g;
            if (et22 == null) {
                it2.a = et2;
                it2.g = et2;
            } else {
                et22.h = et2;
                et2.i = et22;
                it2.g = et2;
            }
            obj = null;
        }
        if (!(((InterfaceC9388rV2) obj) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }
}
