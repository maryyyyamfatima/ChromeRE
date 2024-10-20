package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.DeadObjectException;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9153qo0 {
    public InterfaceC1047Ib1 a;
    public boolean b;
    public String c;
    public final ServiceConnectionC8810po0 d = new ServiceConnectionC8810po0(this);
    public C0071Ao0 e;
    public Context f;

    public final void d(Context context) {
        if (a()) {
            e();
            try {
                context.unbindService(this.d);
            } catch (IllegalArgumentException e) {
                AbstractC4851eH1.a("DWServiceBinder", "unbindService failed : " + e, new Object[0]);
            }
            c();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        BinderC9838so0 binderC9838so0 = this.e.a.i;
        if (a()) {
            try {
                ((C0787Gb1) this.a).j1(binderC9838so0, this.c + "|webview");
                this.b = true;
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "registerCallback failed due to DeadObjectException.", e);
                c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "registerCallback failed.", e2);
            }
        }
    }

    public final void e() {
        if (this.b) {
            BinderC9838so0 binderC9838so0 = this.e.a.i;
            if (a()) {
                try {
                    ((C0787Gb1) this.a).k1(binderC9838so0);
                    this.b = false;
                } catch (DeadObjectException e) {
                    AbstractC4851eH1.a("DWServiceBinder", "unregisterCallback failed due to DeadObjectException.", e);
                    c();
                } catch (Exception e2) {
                    AbstractC4851eH1.a("DWServiceBinder", "unregisterCallback failed.", e2);
                }
            }
        }
    }

    public final void c() {
        this.a = null;
        this.b = false;
        this.c = "";
    }

    public final boolean a() {
        return this.a != null;
    }

    public final void f(Rect rect, View view) {
        if (a()) {
            try {
                ((C0787Gb1) this.a).e(AbstractC8467oo0.b(rect, view));
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "updateEditableBounds failed due to DeadObjectException.", e);
                c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "updateEditableBounds failed.", e2);
            }
        }
    }
}
