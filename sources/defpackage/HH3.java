package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HH3 implements Runnable {
    public final C7259lH3 a;
    public final View g;
    public final /* synthetic */ IH3 h;

    public HH3(IH3 ih3, C7259lH3 c7259lH3, View view) {
        this.h = ih3;
        this.a = c7259lH3;
        this.g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        IH3 ih3 = this.h;
        ih3.getClass();
        C7259lH3 c7259lH3 = this.a;
        QP0 qp0 = c7259lH3.i;
        if (qp0 != null) {
            CommandOuterClass$Command a = qp0.a();
            C2794Vn a2 = AbstractC9053qX.a();
            a2.a = this.g;
            a2.h = c7259lH3.g;
            ((C10081tX) c7259lH3.a).a(a, a2.a(), 2).c();
            z = true;
        } else {
            z = false;
        }
        ih3.w = z;
    }
}
