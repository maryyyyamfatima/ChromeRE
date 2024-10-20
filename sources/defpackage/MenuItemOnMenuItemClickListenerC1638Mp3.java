package defpackage;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1638Mp3 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] h = {MenuItem.class};
    public final Object a;
    public final Method g;

    public MenuItemOnMenuItemClickListenerC1638Mp3(Object obj, String str) {
        this.a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.g = cls.getMethod(str, h);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.g;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
