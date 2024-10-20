package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lV2 */
/* loaded from: classes.dex */
public abstract class AbstractC7328lV2 {
    public static final C6298iV2 a = new C6298iV2();
    public static final C6640jV2 b = new C6640jV2();
    public static final C5954hV2 c = new C5954hV2();

    public static final void a(InterfaceC10417uV2 interfaceC10417uV2) {
        InterfaceC9388rV2 interfaceC9388rV2;
        AbstractC0087Ar1.e(interfaceC10417uV2, "<this>");
        EnumC11683yA1 enumC11683yA1 = interfaceC10417uV2.Z().b;
        AbstractC0087Ar1.d(enumC11683yA1, "lifecycle.currentState");
        if (!(enumC11683yA1 == EnumC11683yA1.INITIALIZED || enumC11683yA1 == EnumC11683yA1.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C9731sV2 A = interfaceC10417uV2.A();
        A.getClass();
        Iterator it = A.a.iterator();
        while (true) {
            GT2 gt2 = (GT2) it;
            if (!gt2.hasNext()) {
                interfaceC9388rV2 = null;
                break;
            }
            Map.Entry entry = (Map.Entry) gt2.next();
            AbstractC0087Ar1.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC9388rV2 = (InterfaceC9388rV2) entry.getValue();
            if (AbstractC0087Ar1.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC9388rV2 == null) {
            C8016nV2 c8016nV2 = new C8016nV2(interfaceC10417uV2.A(), (InterfaceC12177zd4) interfaceC10417uV2);
            interfaceC10417uV2.A().b("androidx.lifecycle.internal.SavedStateHandlesProvider", c8016nV2);
            interfaceC10417uV2.Z().a(new C5610gV2(c8016nV2));
        }
    }
}
