package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S21 {
    public final Activity a;

    public static void a(S21 s21, final Map map, int i, final Y52 y52, HandlerThread handlerThread) {
        s21.getClass();
        if (map.size() != i) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Q21
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Y52 y522 = Y52.this;
                C3419a62 c3419a62 = y522.b;
                c3419a62.getClass();
                List<Z52> list = y522.a;
                int i2 = 0;
                for (Z52 z52 : list) {
                    IZ3 iz3 = z52.b;
                    Map map2 = map;
                    if (map2 == null || !map2.containsKey(iz3) || (obj = map2.get(iz3)) == null) {
                        obj = null;
                    }
                    JZ3 jz3 = (JZ3) obj;
                    if (jz3 != null) {
                        int i3 = jz3.b;
                        Typeface typeface = jz3.a;
                        if (!(i3 != -1 || typeface == null)) {
                            boolean z = i2 == 0;
                            boolean z2 = i2 == list.size() - 1;
                            HashMap e = PropertyModel.e(AbstractC3763b62.e);
                            PD2 pd2 = AbstractC3763b62.a;
                            Boolean valueOf = Boolean.valueOf(z);
                            GD2 gd2 = new GD2();
                            gd2.a = valueOf;
                            e.put(pd2, gd2);
                            PD2 pd22 = AbstractC3763b62.b;
                            Boolean valueOf2 = Boolean.valueOf(z2);
                            GD2 gd22 = new GD2();
                            gd22.a = valueOf2;
                            e.put(pd22, gd22);
                            PD2 pd23 = AbstractC3763b62.c;
                            GD2 gd23 = new GD2();
                            gd23.a = z52.a;
                            e.put(pd23, gd23);
                            PD2 pd24 = AbstractC3763b62.d;
                            GD2 gd24 = new GD2();
                            gd24.a = typeface;
                            c3419a62.a.s(new C7272lK1(1, AbstractC5266fV2.a(e, pd24, gd24, e)));
                        }
                    }
                    i2++;
                }
            }
        });
        handlerThread.quitSafely();
    }

    public S21(Activity activity) {
        this.a = activity;
    }
}
