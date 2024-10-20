package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V53 implements InterfaceC2147Qn2, InterfaceC9536rv {
    public final boolean b;
    public final JJ1 c;
    public final C4107c63 d;
    public boolean e;
    public final Path a = new Path();
    public final H20 f = new H20();

    public V53(JJ1 jj1, AbstractC11937yv abstractC11937yv, C7544m63 c7544m63) {
        c7544m63.getClass();
        this.b = c7544m63.d;
        this.c = jj1;
        AbstractC11251wv a = c7544m63.c.a();
        this.d = (C4107c63) a;
        abstractC11937yv.e(a);
        a.a(this);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            Z40 z40 = (Z40) arrayList.get(i);
            if (z40 instanceof C6651jX3) {
                C6651jX3 c6651jX3 = (C6651jX3) z40;
                if (c6651jX3.c == 1) {
                    this.f.a.add(c6651jX3);
                    c6651jX3.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        boolean z = this.e;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        path.set((Path) this.d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.e = true;
        return path;
    }
}
