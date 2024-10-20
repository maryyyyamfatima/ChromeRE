package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MX implements InterfaceC7833mx0 {
    public final /* synthetic */ GX a;
    public final /* synthetic */ QP0 b;
    public final /* synthetic */ InterfaceC8177nx0 c;
    public final /* synthetic */ InterfaceC8710pX d;
    public final /* synthetic */ U80 e;
    public final /* synthetic */ SX f;

    @Override // defpackage.InterfaceC7833mx0
    public final void b(View view, View view2) {
        a(view);
    }

    public MX(SX sx, GX gx, QP0 qp0, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX, U80 u80) {
        this.f = sx;
        this.a = gx;
        this.b = qp0;
        this.c = interfaceC8177nx0;
        this.d = c8367oX;
        this.e = u80;
    }

    public final void a(View view) {
        WeakHashMap weakHashMap = SX.d;
        GX gx = this.a;
        if (weakHashMap.containsKey(gx.b)) {
            return;
        }
        weakHashMap.put(gx.b, Boolean.TRUE);
        SX sx = this.f;
        InterfaceC9738sX interfaceC9738sX = sx.a;
        CommandOuterClass$Command a = this.b.a();
        InterfaceC8177nx0 interfaceC8177nx0 = this.c;
        InterfaceC8710pX interfaceC8710pX = this.d;
        U80 u80 = this.e;
        SX.f(sx, ((C10081tX) interfaceC9738sX).a(a, SX.h(view, null, interfaceC8177nx0, interfaceC8710pX, u80), 2).c(), u80);
    }
}
