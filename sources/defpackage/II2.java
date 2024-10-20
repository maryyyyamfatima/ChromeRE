package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class II2 implements CA1 {
    public final InterfaceC10417uV2 a;

    public II2(InterfaceC10417uV2 interfaceC10417uV2) {
        AbstractC0087Ar1.e(interfaceC10417uV2, "owner");
        this.a = interfaceC10417uV2;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (enumC11340xA1 != EnumC11340xA1.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        ja1.Z().b(this);
        Bundle a = this.a.A().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        if (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> asSubclass = Class.forName(next, false, II2.class.getClassLoader()).asSubclass(InterfaceC9046qV2.class);
                AbstractC0087Ar1.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        AbstractC0087Ar1.d(newInstance, "{\n                constr…wInstance()\n            }");
                        HI2.a(newInstance);
                        throw null;
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC4809e90.a("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC4199cO1.a("Class ", next, " wasn't found"), e3);
            }
        }
    }
}
