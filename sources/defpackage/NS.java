package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NS {
    public static final NS c = new NS();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final LS b(Class cls) {
        LS ls = (LS) this.a.get(cls);
        return ls != null ? ls : a(cls, null);
    }

    public static void c(HashMap hashMap, MS ms, EnumC11340xA1 enumC11340xA1, Class cls) {
        EnumC11340xA1 enumC11340xA12 = (EnumC11340xA1) hashMap.get(ms);
        if (enumC11340xA12 == null || enumC11340xA1 == enumC11340xA12) {
            if (enumC11340xA12 == null) {
                hashMap.put(ms, enumC11340xA1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ms.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC11340xA12 + ", new value " + enumC11340xA1);
    }

    public final LS a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                c(hashMap, (MS) entry.getKey(), (EnumC11340xA1) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC4622dd2 interfaceC4622dd2 = (InterfaceC4622dd2) method.getAnnotation(InterfaceC4622dd2.class);
            if (interfaceC4622dd2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!JA1.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC11340xA1 value = interfaceC4622dd2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC11340xA1.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC11340xA1.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new MS(i, method), value, cls);
                z = true;
            }
        }
        LS ls = new LS(hashMap);
        this.a.put(cls, ls);
        this.b.put(cls, Boolean.valueOf(z));
        return ls;
    }
}
