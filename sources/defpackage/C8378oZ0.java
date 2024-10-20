package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oZ0 */
/* loaded from: classes.dex */
public final class C8378oZ0 {
    public final InterfaceC4597dZ0 a;
    public final Handler b;
    public final ArrayList c;
    public final ComponentCallbacks2C5575gO2 d;
    public final InterfaceC11610xy e;
    public boolean f;
    public boolean g;
    public IN2 h;
    public C7346lZ0 i;
    public boolean j;
    public C7346lZ0 k;
    public Bitmap l;
    public C7346lZ0 m;
    public int n;
    public int o;
    public int p;

    public final void c(InterfaceC9389rV3 interfaceC9389rV3, Bitmap bitmap) {
        AbstractC6464iy2.b(interfaceC9389rV3);
        AbstractC6464iy2.b(bitmap);
        this.l = bitmap;
        this.h = this.h.a(new C7981nO2().A(interfaceC9389rV3, true));
        this.n = AbstractC10296u74.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        C7346lZ0 c7346lZ0 = this.m;
        if (c7346lZ0 != null) {
            this.m = null;
            b(c7346lZ0);
            return;
        }
        this.g = true;
        InterfaceC4597dZ0 interfaceC4597dZ0 = this.a;
        C1993Pi3 c1993Pi3 = (C1993Pi3) interfaceC4597dZ0;
        C9064qZ0 c9064qZ0 = c1993Pi3.l;
        int i3 = c9064qZ0.c;
        if (i3 <= 0 || (i2 = c1993Pi3.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((C7002kZ0) c9064qZ0.e.get(i2)).i;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + i;
        int i4 = (c1993Pi3.k + 1) % c1993Pi3.l.c;
        c1993Pi3.k = i4;
        this.k = new C7346lZ0(this.b, i4, uptimeMillis);
        IN2 I = this.h.a((C7981nO2) new C7981nO2().w(new R82(Double.valueOf(Math.random())))).I(interfaceC4597dZ0);
        I.H(this.k, null, I, DE0.a);
    }

    public final void b(C7346lZ0 c7346lZ0) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, c7346lZ0).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = c7346lZ0;
            return;
        }
        if (c7346lZ0.l != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.b(bitmap);
                this.l = null;
            }
            C7346lZ0 c7346lZ02 = this.i;
            this.i = c7346lZ0;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C5284fZ0 c5284fZ0 = (C5284fZ0) ((InterfaceC7690mZ0) arrayList.get(size));
                Object callback = c5284fZ0.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c5284fZ0.stop();
                    c5284fZ0.invalidateSelf();
                } else {
                    c5284fZ0.invalidateSelf();
                    C7346lZ0 c7346lZ03 = c5284fZ0.a.a.i;
                    if ((c7346lZ03 != null ? c7346lZ03.j : -1) == ((C1993Pi3) r7.a).l.c - 1) {
                        c5284fZ0.k++;
                    }
                    int i = c5284fZ0.l;
                    if (i != -1 && c5284fZ0.k >= i) {
                        ArrayList arrayList2 = c5284fZ0.p;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((AbstractC4607db) c5284fZ0.p.get(i2)).b(c5284fZ0);
                            }
                        }
                        c5284fZ0.stop();
                    }
                }
            }
            if (c7346lZ02 != null) {
                handler.obtainMessage(2, c7346lZ02).sendToTarget();
            }
        }
        a();
    }

    public C8378oZ0(a aVar, C1993Pi3 c1993Pi3, int i, int i2, C11289x14 c11289x14, Bitmap bitmap) {
        InterfaceC11610xy interfaceC11610xy = aVar.a;
        BZ0 bz0 = aVar.h;
        ComponentCallbacks2C5575gO2 d = a.d(bz0.getBaseContext());
        IN2 a = a.d(bz0.getBaseContext()).g().a(((C7981nO2) ((C7981nO2) ((C7981nO2) new C7981nO2().e(AbstractC6410ip0.a)).C()).x(true)).p(i, i2));
        this.c = new ArrayList();
        this.d = d;
        Handler handler = new Handler(Looper.getMainLooper(), new C8034nZ0(this));
        this.e = interfaceC11610xy;
        this.b = handler;
        this.h = a;
        this.a = c1993Pi3;
        c(c11289x14, bitmap);
    }
}
