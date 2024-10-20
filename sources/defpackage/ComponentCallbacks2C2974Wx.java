package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import org.chromium.content.browser.LauncherThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C2974Wx implements ComponentCallbacks2 {
    public final C5348fk a = new C5348fk(0);
    public final Iterable g;
    public final RunnableC2844Vx h;
    public VJ i;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        LauncherThread.a(new RunnableC2584Tx(this, i));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        LauncherThread.a(new RunnableC2714Ux(this));
    }

    public static void a(ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx, float f) {
        C5348fk c5348fk = componentCallbacks2C2974Wx.a;
        c5348fk.getClass();
        int i = c5348fk.h;
        int i2 = (int) ((1.0f - f) * i);
        AbstractC4851eH1.d("BindingManager", "Reduce connections from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        componentCallbacks2C2974Wx.c(i - i2);
        componentCallbacks2C2974Wx.b();
    }

    public final void c(int i) {
        int i2 = 0;
        for (VJ vj : this.g) {
            C5348fk c5348fk = this.a;
            if (c5348fk.contains(vj)) {
                if (vj == this.i) {
                    this.i = null;
                } else {
                    vj.j();
                }
                c5348fk.remove(vj);
                i2++;
                if (i2 == i) {
                    return;
                }
            }
        }
    }

    public final void b() {
        VJ vj;
        VJ vj2;
        Iterator it = this.g.iterator();
        if (it.hasNext() && (vj = (VJ) it.next()) != (vj2 = this.i)) {
            if (vj2 != null) {
                vj2.a();
                this.i = null;
            }
            if (this.a.contains(vj)) {
                vj.j();
                this.i = vj;
            }
        }
    }

    public ComponentCallbacks2C2974Wx(int i, C11045wK c11045wK, Context context) {
        AbstractC4851eH1.d("BindingManager", "Moderate binding enabled: maxSize=%d", Integer.valueOf(i));
        this.g = c11045wK;
        this.h = new RunnableC2844Vx(this);
        context.registerComponentCallbacks(this);
    }
}
