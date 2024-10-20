package org.chromium.components.search_engines;

import J.N;
import defpackage.AbstractC5103f04;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.FG3;
import defpackage.GG3;
import defpackage.HG3;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TemplateUrlService {
    public final C12157za2 a = new C12157za2();
    public final C12157za2 b = new C12157za2();
    public long c;

    public TemplateUrlService(long j) {
        this.c = j;
    }

    public static TemplateUrlService create(long j) {
        return new TemplateUrlService(j);
    }

    public final void clearNativePtr() {
        this.c = 0L;
    }

    public final boolean f() {
        Object obj = ThreadUtils.a;
        return N.M4Z0aoFH(this.c, this);
    }

    public final void i(Runnable runnable) {
        if (f()) {
            runnable.run();
            return;
        }
        g(new FG3(this, runnable));
        Object obj = ThreadUtils.a;
        N.MVKcMDBb(this.c, this);
    }

    public static void addTemplateUrlToList(List list, TemplateUrl templateUrl) {
        list.add(templateUrl);
    }

    public final void templateUrlServiceLoaded() {
        Object obj = ThreadUtils.a;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((GG3) c11814ya2.next()).d();
            }
        }
    }

    public final void onTemplateURLServiceChanged() {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((HG3) c11814ya2.next()).x();
            }
        }
    }

    public final TemplateUrl c() {
        if (f()) {
            return (TemplateUrl) N.MxujzkW4(this.c, this);
        }
        return null;
    }

    public final boolean b() {
        return N.MsoVJOXN(this.c, this);
    }

    public final boolean e() {
        return N.MWMFuBEz(this.c, this);
    }

    public final void g(final GG3 gg3) {
        Object obj = ThreadUtils.a;
        this.a.a(gg3);
        if (f()) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: EG3
                @Override // java.lang.Runnable
                public final void run() {
                    C12157za2 c12157za2 = TemplateUrlService.this.a;
                    GG3 gg32 = gg3;
                    if (c12157za2.b(gg32)) {
                        gg32.d();
                    }
                }
            });
        }
    }

    public final void a(HG3 hg3) {
        this.b.a(hg3);
    }

    public final void h(HG3 hg3) {
        this.b.d(hg3);
    }

    public final String d(String str, List list) {
        return N.Mweksmrf(this.c, this, str, list == null ? null : (String[]) list.toArray(new String[0]));
    }
}
