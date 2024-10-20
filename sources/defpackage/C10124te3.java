package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: te3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10124te3 implements InterfaceC5898hK1 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final C9781se3 a = new C9781se3();
    public final C6162i51 b = new C6162i51();
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public final void f(Bitmap bitmap) {
        int c = AbstractC10296u74.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C9438re3 c9438re3 = (C9438re3) this.a.b();
        c9438re3.b = c;
        c9438re3.c = config;
        this.b.b(c9438re3, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(c9438re3.b));
        d2.put(Integer.valueOf(c9438re3.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        char[] cArr = AbstractC10296u74.a;
        int i3 = i * i2;
        int i4 = AbstractC9610s74.a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
        int i5 = (i4 != 1 ? (i4 == 2 || i4 == 3) ? 2 : i4 != 4 ? 4 : 8 : 1) * i3;
        C9781se3 c9781se3 = this.a;
        C9438re3 c9438re3 = (C9438re3) c9781se3.b();
        c9438re3.b = i5;
        c9438re3.c = config;
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i7 = AbstractC9096qe3.a[config.ordinal()];
            if (i7 == 1) {
                configArr = d;
            } else if (i7 == 2) {
                configArr = f;
            } else if (i7 == 3) {
                configArr = g;
            } else {
                configArr = i7 != 4 ? new Bitmap.Config[]{config} : h;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i6];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(i5));
            if (num == null || num.intValue() > i5 * 8) {
                i6++;
            } else if (num.intValue() != i5 || (config2 != null ? !config2.equals(config) : config != null)) {
                c9781se3.c(c9438re3);
                int intValue = num.intValue();
                c9438re3 = (C9438re3) c9781se3.b();
                c9438re3.b = intValue;
                c9438re3.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.a(c9438re3);
        if (bitmap != null) {
            a(Integer.valueOf(c9438re3.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + String.valueOf(this));
        }
        if (num2.intValue() == 1) {
            d2.remove(num);
        } else {
            d2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(AbstractC10296u74.c(bitmap), bitmap.getConfig());
    }

    public final String toString() {
        StringBuilder a = AbstractC10761vV3.a("SizeConfigStrategy{groupedMap=");
        a.append(this.b);
        a.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            a.append(entry.getKey());
            a.append('[');
            a.append(entry.getValue());
            a.append("], ");
        }
        if (!hashMap.isEmpty()) {
            a.replace(a.length() - 2, a.length(), "");
        }
        a.append(")}");
        return a.toString();
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + String.valueOf(config) + ")";
    }
}
