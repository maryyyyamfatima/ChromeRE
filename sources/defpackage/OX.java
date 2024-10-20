package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OX implements InterfaceC6457ix0 {
    public final /* synthetic */ QP0 a;
    public final /* synthetic */ InterfaceC8177nx0 b;
    public final /* synthetic */ InterfaceC8710pX c;
    public final /* synthetic */ U80 d;
    public final /* synthetic */ SX e;

    public OX(SX sx, QP0 qp0, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX, U80 u80) {
        this.e = sx;
        this.a = qp0;
        this.b = interfaceC8177nx0;
        this.c = c8367oX;
        this.d = u80;
    }

    @Override // defpackage.InterfaceC6457ix0
    public final void a(View view) {
        SX sx = this.e;
        InterfaceC9738sX interfaceC9738sX = sx.a;
        CommandOuterClass$Command a = this.a.a();
        InterfaceC8177nx0 interfaceC8177nx0 = this.b;
        InterfaceC8710pX interfaceC8710pX = this.c;
        U80 u80 = this.d;
        SX.f(sx, ((C10081tX) interfaceC9738sX).a(a, SX.h(view, null, interfaceC8177nx0, interfaceC8710pX, u80), 2).c(), u80);
    }
}
