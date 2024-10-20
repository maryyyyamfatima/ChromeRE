package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0247Bx1 implements InterfaceC11522xj, InterfaceC11179wj {
    public static boolean i;
    public static Activity j;
    public static C11950yx1 k;
    public C0117Ax1 a = new C0117Ax1();
    public C12293zx1 g = new C12293zx1();
    public final Activity h;

    public abstract int a();

    public int b() {
        return 0;
    }

    public AbstractC0247Bx1(Activity activity) {
        this.h = activity;
        if (k == null) {
            C11950yx1 c11950yx1 = new C11950yx1();
            k = c11950yx1;
            ApplicationStatus.f(c11950yx1);
            if (ApplicationStatus.getStateForApplication() == 1) {
                j = ApplicationStatus.c;
            }
        }
        ApplicationStatus.d(this);
        ApplicationStatus.e(this, activity);
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i2) {
        if (i2 == 6) {
            ApplicationStatus.i(this);
            ApplicationStatus.h(this);
        }
        if (i2 == 4) {
            this.g.b = DisplayAndroidManager.a(this.h).getState() != 2;
        }
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i2) {
        if (i2 == 3) {
            i = false;
            this.a = new C0117Ax1();
        }
    }
}
