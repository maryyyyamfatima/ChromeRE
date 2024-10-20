package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rQ3 */
/* loaded from: classes2.dex */
public abstract class AbstractC9364rQ3 implements InterfaceC11299x32 {
    public C10613v32 b;
    public final /* synthetic */ C9707sQ3 c;

    public abstract boolean k();

    @Override // defpackage.InterfaceC11299x32
    public final void a(float f) {
        C10613v32 f2 = this.c.f();
        if (f2 != null) {
            NewTabPageLayout newTabPageLayout = f2.v;
            newTabPageLayout.B = f;
            newTabPageLayout.k();
        }
    }

    @Override // defpackage.InterfaceC11299x32
    public final void b(Rect rect, Point point) {
        C10613v32 f = this.c.f();
        NewTabPageLayout newTabPageLayout = f.v;
        View a = f.a();
        int x = (int) newTabPageLayout.j.b.getX();
        int y = (int) newTabPageLayout.j.b.getY();
        rect.set(x, y, newTabPageLayout.j.b.getWidth() + x, newTabPageLayout.j.b.getHeight() + y);
        point.set(0, 0);
        if (newTabPageLayout.g()) {
            point.y = Integer.MIN_VALUE;
        } else {
            View view = newTabPageLayout.j.b;
            while (true) {
                view = (View) view.getParent();
                if (view == null) {
                    point.y = Integer.MIN_VALUE;
                    break;
                }
                point.offset(-view.getScrollX(), -view.getScrollY());
                if (view == a) {
                    break;
                } else {
                    point.offset((int) view.getX(), (int) view.getY());
                }
            }
        }
        rect.offset(point.x, point.y);
        if (point.y != Integer.MIN_VALUE) {
            rect.inset(0, newTabPageLayout.H);
        }
    }

    @Override // defpackage.InterfaceC11299x32
    public final void d(float f) {
        this.c.f().v.i.setAlpha(f);
    }

    @Override // defpackage.InterfaceC11299x32
    public final void f(KQ3 kq3) {
        this.c.f().v.j.a.o(BZ2.b, kq3);
    }

    @Override // defpackage.InterfaceC11299x32
    public void g(Callback callback) {
        C10613v32 f = this.c.f();
        C10613v32 c10613v32 = this.b;
        if (c10613v32 != null) {
            c10613v32.v.p = null;
        }
        this.b = f;
        if (f == null || !k()) {
            return;
        }
        C10613v32 c10613v322 = this.b;
        C9022qQ3 c9022qQ3 = new C9022qQ3(callback);
        NewTabPageLayout newTabPageLayout = c10613v322.v;
        newTabPageLayout.p = c9022qQ3;
        newTabPageLayout.n();
    }

    @Override // defpackage.InterfaceC11299x32
    public final boolean h() {
        return this.c.f() != null;
    }

    @Override // defpackage.InterfaceC11299x32
    public final boolean i() {
        C10613v32 f;
        C9707sQ3 c9707sQ3 = this.c;
        return ((AbstractC5241fQ2.d(c9707sQ3.R) && c9707sQ3.I == 1) || (f = c9707sQ3.f()) == null || !f.v()) ? false : true;
    }

    @Override // defpackage.InterfaceC11299x32
    public final void j(float f) {
        this.c.f().v.j.a.l(BZ2.a, f);
    }

    public AbstractC9364rQ3(C9707sQ3 c9707sQ3) {
        this.c = c9707sQ3;
    }

    @Override // defpackage.InterfaceC11299x32
    public final boolean e() {
        return this.b != null;
    }

    @Override // defpackage.InterfaceC11299x32
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.b.a().dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.InterfaceC11299x32
    public final boolean c() {
        C10613v32 c10613v32 = this.b;
        return (c10613v32 == null || !c10613v32.v() || i()) ? false : true;
    }
}
