package defpackage;

import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Kw4 {
    public final /* synthetic */ C6781jt4 a;

    public Kw4(C6781jt4 c6781jt4) {
        this.a = c6781jt4;
    }

    public final void a() {
        C6781jt4 c6781jt4 = this.a;
        if (c6781jt4.n && c6781jt4.a.W()) {
            new AsyncTaskC5407ft4(c6781jt4).execute(new Void[0]);
        } else {
            Log.w("YouTubeAndroidPlayerAPI", String.format("Connected and then detached from activity.", new Object[0]));
            c6781jt4.l.c();
        }
    }

    public final void b() {
        FrameLayout frameLayout;
        C6781jt4 c6781jt4 = this.a;
        View view = c6781jt4.k;
        if (view != null && (frameLayout = c6781jt4.i) != null) {
            frameLayout.removeView(view);
            c6781jt4.i.addView(c6781jt4.h);
            c6781jt4.e.a(C10221tu4.a(8));
        }
        c6781jt4.k = null;
        Aw4 aw4 = c6781jt4.m;
        if (aw4 != null) {
            try {
                ww4 ww4Var = (ww4) aw4;
                ww4Var.h(3, ww4Var.a());
            } catch (RemoteException e) {
                Pu4.a(e.getMessage(), new Object[0]);
            }
        }
        c6781jt4.g.b(null);
        c6781jt4.m = null;
        c6781jt4.l = Qv4.a;
        c6781jt4.b = C6781jt4.r;
    }
}
