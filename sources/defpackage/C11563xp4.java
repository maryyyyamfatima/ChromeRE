package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xp4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11563xp4 extends Hp4 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public C2141Qm1 d;

    public C11563xp4() {
        WindowInsets windowInsets;
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        Field field = e;
        WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                windowInsets = (WindowInsets) field.get(null);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
            if (windowInsets != null) {
                windowInsets2 = new WindowInsets(windowInsets);
                this.c = windowInsets2;
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                windowInsets2 = (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        this.c = windowInsets2;
    }

    public C11563xp4(C5389fq4 c5389fq4) {
        super(c5389fq4);
        this.c = c5389fq4.f();
    }

    @Override // defpackage.Hp4
    public final void g(C2141Qm1 c2141Qm1) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            int i = c2141Qm1.d;
            this.c = windowInsets.replaceSystemWindowInsets(c2141Qm1.a, c2141Qm1.b, c2141Qm1.c, i);
        }
    }

    @Override // defpackage.Hp4
    public final void e(C2141Qm1 c2141Qm1) {
        this.d = c2141Qm1;
    }

    @Override // defpackage.Hp4
    public final C5389fq4 b() {
        a();
        C5389fq4 g2 = C5389fq4.g(null, this.c);
        C2141Qm1[] c2141Qm1Arr = this.b;
        Up4 up4 = g2.a;
        up4.o(c2141Qm1Arr);
        up4.q(this.d);
        return g2;
    }
}
