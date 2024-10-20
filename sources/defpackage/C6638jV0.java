package defpackage;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jV0 */
/* loaded from: classes.dex */
public final class C6638jV0 {
    public static final C4920eV0 i = new C4920eV0();
    public final LinkedList a = new LinkedList();
    public C5608gV0 b;
    public C5264fV0 c;
    public final Activity d;
    public final C6166i6 e;
    public final ZU0 f;
    public boolean g;
    public final boolean h;

    public final WebContents f() {
        Tab tab = (Tab) this.e.g;
        if (tab == null) {
            return null;
        }
        return tab.b();
    }

    public C6638jV0(Activity activity, C6166i6 c6166i6, XU0 xu0) {
        this.d = activity;
        this.e = c6166i6;
        this.f = xu0;
        boolean z = Build.VERSION.SDK_INT >= 31;
        this.h = z;
        if (z) {
            b();
        }
    }

    public final int d(boolean z) {
        boolean isInPictureInPictureMode;
        WebContents f = f();
        if (f == null) {
            return 7;
        }
        if (!f.I0() || !f.b1()) {
            return 8;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return 1;
        }
        Activity activity = this.d;
        if (!activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return 2;
        }
        if (z) {
            isInPictureInPictureMode = activity.isInPictureInPictureMode();
            if (isInPictureInPictureMode) {
                return 4;
            }
        }
        if (activity.isChangingConfigurations()) {
            return 5;
        }
        if (activity.isFinishing()) {
            return 6;
        }
        return !AbstractC2599Ua.b(activity, i).isEmpty() ? 9 : 0;
    }

    public final void c() {
        int d = d(true);
        if (d != 8) {
            EI2.h(d, 9, "Media.VideoPersistence.AttemptResult");
        }
        if (d != 0) {
            return;
        }
        WebContents f = f();
        Activity activity = this.d;
        Rect e = e(f, activity);
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        if (e != null) {
            builder.setAspectRatio(new Rational(e.width(), e.height()));
            builder.setSourceRectHint(e);
        }
        try {
            activity.enterPictureInPictureMode(builder.build());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            AbstractC4851eH1.a("VideoPersist", "Error entering PiP with bounds (%d, %d): %s", Integer.valueOf(e.width()), Integer.valueOf(e.height()), e2);
        }
    }

    public static Rect e(WebContents webContents, Activity activity) {
        int i2;
        int i3;
        Rect r = webContents.r();
        if (r == null || r.width() == 0 || r.height() == 0) {
            return null;
        }
        float b = JM1.b(r.width() / r.height(), 0.41841003f, 2.39f);
        int width = activity.getWindow().getDecorView().getWidth();
        int height = activity.getWindow().getDecorView().getHeight();
        float f = width;
        float f2 = height;
        if (b > f / f2) {
            i3 = (int) (f / b);
            i2 = width;
        } else {
            i2 = (int) (f2 * b);
            i3 = height;
        }
        int i4 = (width - i2) / 2;
        int i5 = (height - i3) / 2;
        return new Rect(i4, i5, i2 + i4, i3 + i5);
    }

    public final void b() {
        if (this.b == null) {
            this.b = new C5608gV0(this, this.d);
        }
        if (this.c == null) {
            C5264fV0 c5264fV0 = new C5264fV0(this);
            this.c = c5264fV0;
            ((XU0) this.f).a(c5264fV0);
        }
    }

    public final void h() {
        if (this.h) {
            boolean z = d(false) == 0;
            if (z == this.g) {
                return;
            }
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            Activity activity = this.d;
            if (!z) {
                builder.setAutoEnterEnabled(false);
            } else {
                Rect e = e(f(), activity);
                if (e != null) {
                    builder.setAspectRatio(new Rational(e.width(), e.height()));
                    builder.setSourceRectHint(e);
                }
                builder.setAutoEnterEnabled(true);
            }
            this.g = z;
            try {
                activity.setPictureInPictureParams(builder.build());
            } catch (RuntimeException e2) {
                AbstractC4851eH1.a("VideoPersist", "Error setting PiP params", e2);
            }
        }
    }

    public final void g(int i2) {
        LinkedList linkedList = this.a;
        if (!linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            linkedList.clear();
            if (!this.h) {
                C5264fV0 c5264fV0 = this.c;
                if (c5264fV0 != null) {
                    ((XU0) this.f).k(c5264fV0);
                    this.c = null;
                }
                C5608gV0 c5608gV0 = this.b;
                if (c5608gV0 != null) {
                    C5952hV0 c5952hV0 = c5608gV0.h;
                    if (c5952hV0 != null) {
                        c5952hV0.V0();
                        Tab tab = c5952hV0.g;
                        if (tab != null) {
                            tab.w(c5952hV0);
                        }
                        c5608gV0.h = null;
                    }
                    c5608gV0.g = null;
                    c5608gV0.i.e.n(c5608gV0);
                    this.b = null;
                }
            }
            EI2.h(i2, 8, "Media.VideoPersistence.EndReason");
        }
    }

    public static void a(C6638jV0 c6638jV0, Activity activity, int i2) {
        c6638jV0.h();
        if (!c6638jV0.a.isEmpty()) {
            activity.moveTaskToBack(true);
            c6638jV0.g(i2);
        }
    }
}
