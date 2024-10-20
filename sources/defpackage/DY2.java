package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DY2 {
    public static void a(View view, InterfaceC9738sX interfaceC9738sX, CommandOuterClass$Command commandOuterClass$Command, C3998bo c3998bo, AbstractC5771gx0 abstractC5771gx0, C2972Ww2 c2972Ww2) {
        C2794Vn a = AbstractC9053qX.a();
        a.a = view;
        a.h = c3998bo;
        a.f = abstractC5771gx0;
        if (c2972Ww2 != null) {
            MY2 my2 = (MY2) NY2.l.j();
            if (my2.h) {
                my2.l();
                my2.h = false;
            }
            NY2 ny2 = (NY2) my2.g;
            ny2.getClass();
            ny2.k = c2972Ww2;
            ny2.j |= 1;
            NY2 ny22 = (NY2) my2.j();
            K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
            k33.p(NY2.n, ny22);
            a.e = (SenderStateOuterClass$SenderState) k33.j();
        }
        ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, a.a(), 2).c();
    }
}
