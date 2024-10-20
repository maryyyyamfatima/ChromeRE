package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tV2 */
/* loaded from: classes.dex */
public final class C10074tV2 {
    public final InterfaceC10417uV2 a;
    public final C9731sV2 b = new C9731sV2();
    public boolean c;

    public C10074tV2(InterfaceC10417uV2 interfaceC10417uV2) {
        this.a = interfaceC10417uV2;
    }

    public final void a() {
        InterfaceC10417uV2 interfaceC10417uV2 = this.a;
        LA1 Z = interfaceC10417uV2.Z();
        AbstractC0087Ar1.d(Z, "owner.lifecycle");
        if (!(Z.b == EnumC11683yA1.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        Z.a(new II2(interfaceC10417uV2));
        final C9731sV2 c9731sV2 = this.b;
        c9731sV2.getClass();
        if (!(!c9731sV2.b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        Z.a(new CA1() { // from class: pV2
            @Override // defpackage.CA1
            public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
                AbstractC0087Ar1.e(C9731sV2.this, "this$0");
            }
        });
        c9731sV2.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        LA1 Z = this.a.Z();
        AbstractC0087Ar1.d(Z, "owner.lifecycle");
        if (!(!Z.b.a(EnumC11683yA1.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + Z.b).toString());
        }
        C9731sV2 c9731sV2 = this.b;
        if (!c9731sV2.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c9731sV2.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c9731sV2.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c9731sV2.d = true;
    }

    public final void c(Bundle bundle) {
        AbstractC0087Ar1.e(bundle, "outBundle");
        C9731sV2 c9731sV2 = this.b;
        c9731sV2.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c9731sV2.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        IT2 it2 = c9731sV2.a;
        it2.getClass();
        FT2 ft2 = new FT2(it2);
        it2.h.put(ft2, Boolean.FALSE);
        while (ft2.hasNext()) {
            Map.Entry entry = (Map.Entry) ft2.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC9388rV2) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
