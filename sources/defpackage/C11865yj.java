package defpackage;

import android.app.Activity;
import android.view.Window;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11865yj implements InvocationHandler {
    public final Window.Callback a;
    public final Activity b;

    public C11865yj(Activity activity, Window.Callback callback) {
        this.a = callback;
        this.b = activity;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean equals = method.getName().equals("onWindowFocusChanged");
        Window.Callback callback = this.a;
        if (equals && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                callback.onWindowFocusChanged(booleanValue);
                C12157za2 c12157za2 = ApplicationStatus.g;
                if (c12157za2 == null) {
                    return null;
                }
                Iterator it = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return null;
                    }
                    ((InterfaceC12208zj) c11814ya2.next()).d(this.b, booleanValue);
                }
            }
        }
        try {
            return method.invoke(callback, objArr);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof AbstractMethodError) {
                throw e.getCause();
            }
            throw e;
        }
    }
}
