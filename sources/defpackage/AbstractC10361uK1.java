package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10361uK1 {
    public static final AbstractC10018tK1 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [t40] */
    static {
        String str;
        Object next;
        int i = AbstractC1144Iu3.a;
        AbstractC10018tK1 abstractC10018tK1 = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator it = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
        AbstractC0087Ar1.e(it, "<this>");
        R33 r33 = new R33(it);
        if (!(r33 instanceof C9931t40)) {
            r33 = new C9931t40(r33);
        }
        List a2 = P33.a(r33);
        Iterator it2 = a2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it2.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                abstractC10018tK1 = mainDispatcherFactory.createDispatcher(a2);
            } catch (Throwable unused2) {
                mainDispatcherFactory.hintOnError();
            }
        }
        if (abstractC10018tK1 != null) {
            a = abstractC10018tK1;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
