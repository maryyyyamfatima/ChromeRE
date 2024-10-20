package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class YR0 {
    public static final C5210fK1 a = new C5210fK1(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final C1439Lb3 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new QN2());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new C1439Lb3(0);
    }

    public static Typeface b(Context context, LR0 lr0, int i, RN2 rn2, C8963qF c8963qF) {
        Handler handler;
        String str = lr0.f + "-" + i;
        Typeface typeface = (Typeface) a.b(str);
        if (typeface != null) {
            c8963qF.b.post(new RunnableC8277oF(c8963qF.a, typeface));
            return typeface;
        }
        UR0 ur0 = new UR0(c8963qF);
        synchronized (c) {
            C1439Lb3 c1439Lb3 = d;
            ArrayList arrayList = (ArrayList) c1439Lb3.get(str);
            if (arrayList != null) {
                arrayList.add(ur0);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ur0);
            c1439Lb3.put(str, arrayList2);
            VR0 vr0 = new VR0(str, context, lr0, i);
            Executor executor = rn2;
            if (rn2 == null) {
                executor = b;
            }
            WR0 wr0 = new WR0(str);
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            executor.execute(new TN2(handler, vr0, wr0));
            return null;
        }
    }

    public static XR0 a(String str, Context context, LR0 lr0, int i) {
        int i2;
        C5210fK1 c5210fK1 = a;
        Typeface typeface = (Typeface) c5210fK1.b(str);
        if (typeface != null) {
            return new XR0(typeface);
        }
        try {
            C4905eS0 a2 = JR0.a(context, lr0);
            int i3 = 1;
            C5249fS0[] c5249fS0Arr = a2.b;
            int i4 = a2.a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                if (c5249fS0Arr != null && c5249fS0Arr.length != 0) {
                    i3 = 0;
                    for (C5249fS0 c5249fS0 : c5249fS0Arr) {
                        int i5 = c5249fS0.e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                }
                i2 = i3;
            }
            if (i2 != 0) {
                return new XR0(i2);
            }
            Typeface b2 = AbstractC10095tZ3.a.b(context, c5249fS0Arr, i);
            if (b2 != null) {
                c5210fK1.c(str, b2);
                return new XR0(b2);
            }
            return new XR0(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new XR0(-1);
        }
    }
}
