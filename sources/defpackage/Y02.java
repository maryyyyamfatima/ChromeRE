package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y02 {
    public final InterfaceC7968nM a;
    public boolean b;
    public boolean c;
    public ArrayList d;
    public ArrayList e;
    public Boolean f;
    public boolean g;
    public boolean h;

    public Y02(InterfaceC7968nM interfaceC7968nM) {
        this.a = interfaceC7968nM;
    }

    public final void b(boolean z) {
        Object obj = ThreadUtils.a;
        if (AX.e().g("disable-native-initialization")) {
            AbstractC4851eH1.d("NIController", "Exit early and start Chrome without loading native library!", new Object[0]);
            return;
        }
        boolean a = AbstractC6952kP0.a(((AbstractActivityC7416ll) this.a).getIntent(), false);
        this.f = Boolean.FALSE;
        new W02(this).c(z, a);
    }

    public final void a() {
        Boolean bool;
        Object obj = ThreadUtils.a;
        if (this.g && (bool = this.f) != null && bool.booleanValue()) {
            AbstractActivityC7416ll abstractActivityC7416ll = (AbstractActivityC7416ll) this.a;
            if (abstractActivityC7416ll.m()) {
                return;
            }
            abstractActivityC7416ll.D.l = 1;
            C7629mN.a().b(true, abstractActivityC7416ll);
        }
    }

    public final void c() {
        InterfaceC7968nM interfaceC7968nM = this.a;
        TraceEvent i = TraceEvent.i("startNowAndProcessPendingItems", null);
        try {
            interfaceC7968nM.f();
            ArrayList arrayList = this.d;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    interfaceC7968nM.y((Intent) it.next());
                }
                this.d = null;
            }
            if (this.e != null) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    X02 x02 = (X02) this.e.get(i2);
                    interfaceC7968nM.C(x02.a, x02.b, x02.c);
                }
                this.e = null;
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
