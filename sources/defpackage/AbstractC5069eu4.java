package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5069eu4 {
    public final C9187qt4 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();
    public C4376ct4 e = null;
    public volatile boolean f = false;

    public AbstractC5069eu4(C9187qt4 c9187qt4, IntentFilter intentFilter, Context context) {
        this.a = c9187qt4;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        C4376ct4 c4376ct4;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            C4376ct4 c4376ct42 = new C4376ct4(this);
            this.e = c4376ct42;
            this.c.registerReceiver(c4376ct42, this.b);
        }
        if (this.f || !this.d.isEmpty() || (c4376ct4 = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(c4376ct4);
        this.e = null;
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((InterfaceC10160tk3) it.next()).a(obj);
        }
    }
}
