package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lH3 */
/* loaded from: classes.dex */
public final class C7259lH3 extends ClickableSpan {
    public final InterfaceC9738sX a;
    public final C3998bo g;
    public final QP0 h;
    public final QP0 i;

    public C7259lH3(C3904bY c3904bY, InterfaceC9738sX interfaceC9738sX, RP0 rp0, C3998bo c3998bo, U80 u80) {
        this.a = interfaceC9738sX;
        this.g = c3998bo;
        this.h = rp0.o(c3904bY.j(), u80);
        this.i = rp0.o(c3904bY.i(), u80);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        QP0 qp0 = this.h;
        if (qp0 != null) {
            CommandOuterClass$Command a = qp0.a();
            C2794Vn a2 = AbstractC9053qX.a();
            a2.a = view;
            a2.h = this.g;
            ((C10081tX) this.a).a(a, a2.a(), 2).c();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
