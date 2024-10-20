package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GR0 implements InvocationHandler {
    public final Object a;

    public GR0(Object obj) {
        this.a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Bundle bundle;
        try {
            Object invoke = method.invoke(this.a, objArr);
            if (method.getReturnType() == ApplicationInfo.class && (bundle = ((ApplicationInfo) invoke).metaData) != null) {
                bundle.remove("preloaded_fonts");
            }
            return invoke;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Reflection failed when proxying IPackageManager", e);
        } catch (InvocationTargetException e2) {
            throw e2.getTargetException();
        }
    }
}
