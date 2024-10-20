package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QZ3 {
    public final Context c;
    public final ArrayList b = new ArrayList();
    public PZ3 a = b();

    public QZ3(View view) {
        this.c = view.getContext();
        view.addOnAttachStateChangeListener(new OZ3(this));
    }

    public final void a(InterfaceC5041eq0 interfaceC5041eq0) {
        this.b.add(interfaceC5041eq0);
        interfaceC5041eq0.a(this.a);
    }

    public final void c() {
        PZ3 b = b();
        this.a = b;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5041eq0) it.next()).a(b);
        }
    }

    public final PZ3 b() {
        Context context = this.c;
        int i = context.getResources().getConfiguration().screenWidthDp;
        return new PZ3(i <= 320 ? 0 : i >= 600 ? 2 : 1, context.getResources().getConfiguration().screenHeightDp <= 320 ? 0 : 1);
    }
}
