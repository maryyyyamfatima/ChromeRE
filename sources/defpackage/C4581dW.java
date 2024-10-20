package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dW */
/* loaded from: classes.dex */
public final class C4581dW implements InterfaceC8710pX {
    public final float a;
    public final boolean b;
    public final int c;
    public final YJ2 d;

    public C4581dW(C5612gW c5612gW, Context context, YJ2 yj2) {
        this.a = context.getResources().getDisplayMetrics().density;
        this.b = AbstractC11769yR2.a(context);
        this.c = c5612gW.k();
        this.d = yj2;
    }

    @Override // defpackage.InterfaceC8710pX
    public final C2794Vn a(C2794Vn c2794Vn) {
        int T0;
        K33 k33;
        RecyclerView a = this.d.a();
        if (a == null) {
            return c2794Vn;
        }
        C6300iW c6300iW = (C6300iW) C6642jW.m.j();
        C2842Vw2 c2842Vw2 = (C2842Vw2) C2972Ww2.m.j();
        float computeHorizontalScrollOffset = a.computeHorizontalScrollOffset();
        float f = this.a;
        float f2 = computeHorizontalScrollOffset / f;
        if (c2842Vw2.h) {
            c2842Vw2.l();
            c2842Vw2.h = false;
        }
        C2972Ww2 c2972Ww2 = (C2972Ww2) c2842Vw2.g;
        c2972Ww2.j |= 1;
        c2972Ww2.k = f2;
        float computeVerticalScrollOffset = a.computeVerticalScrollOffset() / f;
        if (c2842Vw2.h) {
            c2842Vw2.l();
            c2842Vw2.h = false;
        }
        C2972Ww2 c2972Ww22 = (C2972Ww2) c2842Vw2.g;
        c2972Ww22.j |= 2;
        c2972Ww22.l = computeVerticalScrollOffset;
        if (c6300iW.h) {
            c6300iW.l();
            c6300iW.h = false;
        }
        C6642jW c6642jW = (C6642jW) c6300iW.g;
        C2972Ww2 c2972Ww23 = (C2972Ww2) c2842Vw2.j();
        c6642jW.getClass();
        c2972Ww23.getClass();
        c6642jW.k = c2972Ww23;
        c6642jW.j |= 1;
        if (this.c == 1) {
            View B = a.B(a.getWidth() / 2, a.getHeight() / 2);
            if (B != null) {
                T0 = RecyclerView.J(B);
            }
            T0 = -1;
        } else {
            AbstractC12077zK2 abstractC12077zK2 = a.s;
            if (abstractC12077zK2 instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC12077zK2;
                T0 = (this.b && linearLayoutManager.p == 0) ? linearLayoutManager.T0() : linearLayoutManager.R0();
            }
            T0 = -1;
        }
        if (c6300iW.h) {
            c6300iW.l();
            c6300iW.h = false;
        }
        C6642jW c6642jW2 = (C6642jW) c6300iW.g;
        c6642jW2.j |= 2;
        c6642jW2.l = T0;
        C6642jW c6642jW3 = (C6642jW) c6300iW.j();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = c2794Vn.e;
        if (senderStateOuterClass$SenderState != null) {
            JX0 jx0 = (JX0) senderStateOuterClass$SenderState.l(PX0.NEW_BUILDER);
            jx0.m(senderStateOuterClass$SenderState);
            k33 = (K33) jx0;
        } else {
            k33 = (K33) SenderStateOuterClass$SenderState.l.j();
        }
        k33.p(C6642jW.o, c6642jW3);
        c2794Vn.e = (SenderStateOuterClass$SenderState) k33.j();
        return c2794Vn;
    }
}
