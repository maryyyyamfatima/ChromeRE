package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import com.bumptech.glide.a;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacks2C5575gO2 implements ComponentCallbacks2, GA1 {
    public static final C7981nO2 p = (C7981nO2) ((C7981nO2) new C7981nO2().d(Bitmap.class)).k();
    public static final C7981nO2 q;
    public final a a;
    public final Context g;
    public final InterfaceC12026zA1 h;
    public final C9696sO2 i;
    public final InterfaceC7637mO2 j;
    public final C4156cF3 k;
    public final RunnableC4544dO2 l;
    public final InterfaceC5811h40 m;
    public final CopyOnWriteArrayList n;
    public C7981nO2 o;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public ComponentCallbacks2C5575gO2(a aVar, InterfaceC12026zA1 interfaceC12026zA1, InterfaceC7637mO2 interfaceC7637mO2, Context context) {
        InterfaceC5811h40 c7899n82;
        C7981nO2 c7981nO2;
        C9696sO2 c9696sO2 = new C9696sO2();
        C10494uj0 c10494uj0 = aVar.k;
        this.k = new C4156cF3();
        RunnableC4544dO2 runnableC4544dO2 = new RunnableC4544dO2(this);
        this.l = runnableC4544dO2;
        this.a = aVar;
        this.h = interfaceC12026zA1;
        this.j = interfaceC7637mO2;
        this.i = c9696sO2;
        this.g = context;
        Context applicationContext = context.getApplicationContext();
        C5231fO2 c5231fO2 = new C5231fO2(this, c9696sO2);
        c10494uj0.getClass();
        if (Y50.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            c7899n82 = new C10151tj0(applicationContext, c5231fO2);
        } else {
            c7899n82 = new C7899n82();
        }
        this.m = c7899n82;
        char[] cArr = AbstractC10296u74.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            AbstractC10296u74.h(runnableC4544dO2);
        } else {
            interfaceC12026zA1.b(this);
        }
        interfaceC12026zA1.b(c7899n82);
        this.n = new CopyOnWriteArrayList(aVar.h.e);
        BZ0 bz0 = aVar.h;
        synchronized (bz0) {
            if (bz0.j == null) {
                bz0.d.getClass();
                C7981nO2 c7981nO22 = new C7981nO2();
                c7981nO22.y = true;
                bz0.j = c7981nO22;
            }
            c7981nO2 = bz0.j;
        }
        w(c7981nO2);
        synchronized (aVar.l) {
            if (aVar.l.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.l.add(this);
        }
    }

    public synchronized void w(C7981nO2 c7981nO2) {
        this.o = (C7981nO2) ((C7981nO2) c7981nO2.clone()).b();
    }

    static {
        q = (C7981nO2) ((C7981nO2) ((C7981nO2) new C7981nO2().e(AbstractC6410ip0.b)).s()).x(true);
    }

    public final synchronized void u() {
        C9696sO2 c9696sO2 = this.i;
        c9696sO2.c = true;
        Iterator it = AbstractC10296u74.d(c9696sO2.a).iterator();
        while (it.hasNext()) {
            GN2 gn2 = (GN2) it.next();
            if (gn2.isRunning()) {
                gn2.pause();
                c9696sO2.b.add(gn2);
            }
        }
    }

    public final synchronized void v() {
        C9696sO2 c9696sO2 = this.i;
        c9696sO2.c = false;
        Iterator it = AbstractC10296u74.d(c9696sO2.a).iterator();
        while (it.hasNext()) {
            GN2 gn2 = (GN2) it.next();
            if (!gn2.j() && !gn2.isRunning()) {
                gn2.c();
            }
        }
        c9696sO2.b.clear();
    }

    @Override // defpackage.GA1
    public final synchronized void b() {
        v();
        this.k.b();
    }

    @Override // defpackage.GA1
    public final synchronized void a() {
        u();
        this.k.a();
    }

    @Override // defpackage.GA1
    public final synchronized void onDestroy() {
        this.k.onDestroy();
        Iterator it = AbstractC10296u74.d(this.k.a).iterator();
        while (it.hasNext()) {
            n((TE3) it.next());
        }
        this.k.a.clear();
        C9696sO2 c9696sO2 = this.i;
        Iterator it2 = AbstractC10296u74.d(c9696sO2.a).iterator();
        while (it2.hasNext()) {
            c9696sO2.a((GN2) it2.next());
        }
        c9696sO2.b.clear();
        this.h.a(this);
        this.h.a(this.m);
        AbstractC10296u74.e().removeCallbacks(this.l);
        this.a.c(this);
    }

    public IN2 g() {
        return f(Bitmap.class).a(p);
    }

    public IN2 j() {
        return f(Drawable.class);
    }

    public IN2 q(BitmapDrawable bitmapDrawable) {
        return j().J(bitmapDrawable);
    }

    public IN2 r(Uri uri) {
        return j().K(uri);
    }

    public IN2 s(Integer num) {
        return j().L(num);
    }

    public IN2 t(byte[] bArr) {
        return j().N(bArr);
    }

    public IN2 p() {
        return j().I(null);
    }

    public IN2 o() {
        return f(File.class).a(q);
    }

    public IN2 f(Class cls) {
        return new IN2(this.a, this, cls, this.g);
    }

    public final void n(TE3 te3) {
        boolean z;
        if (te3 == null) {
            return;
        }
        boolean x = x(te3);
        GN2 l = te3.l();
        if (x) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.l) {
            Iterator it = aVar.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((ComponentCallbacks2C5575gO2) it.next()).x(te3)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || l == null) {
            return;
        }
        te3.e(null);
        l.clear();
    }

    public final synchronized boolean x(TE3 te3) {
        GN2 l = te3.l();
        if (l == null) {
            return true;
        }
        if (!this.i.a(l)) {
            return false;
        }
        this.k.a.remove(te3);
        te3.e(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + String.valueOf(this.i) + ", treeNode=" + String.valueOf(this.j) + "}";
    }
}
