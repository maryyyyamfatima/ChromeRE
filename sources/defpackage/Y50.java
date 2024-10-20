package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Y50 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static ColorStateList b(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C12102zP2 c12102zP2;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        AP2 ap2 = new AP2(resources, theme);
        synchronized (GP2.c) {
            SparseArray sparseArray = (SparseArray) GP2.b.get(ap2);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c12102zP2 = (C12102zP2) sparseArray.get(i)) != null) {
                if (c12102zP2.b.equals(resources.getConfiguration()) && ((theme == null && c12102zP2.c == 0) || (theme != null && c12102zP2.c == theme.hashCode()))) {
                    colorStateList2 = c12102zP2.a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = GP2.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            try {
                colorStateList = XW.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            synchronized (GP2.c) {
                WeakHashMap weakHashMap = GP2.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(ap2);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(ap2, sparseArray2);
                }
                sparseArray2.append(i, new C12102zP2(colorStateList, ap2.a.getConfiguration(), theme));
            }
            return colorStateList;
        }
        return resources.getColorStateList(i, theme);
    }

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
