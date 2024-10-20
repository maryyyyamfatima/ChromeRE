package defpackage;

import android.util.LogPrinter;
import androidx.gridlayout.widget.GridLayout;
import java.lang.reflect.Array;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T41 {
    public final int[] a;
    public final Object[] b;
    public final Object[] c;

    public T41(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i] = num.intValue();
        }
        this.a = iArr;
        this.b = a(objArr, iArr);
        this.c = a(objArr2, iArr);
    }

    public static Object[] a(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.n;
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
        for (int i3 = 0; i3 < length; i3++) {
            objArr2[iArr[i3]] = objArr[i3];
        }
        return objArr2;
    }
}
