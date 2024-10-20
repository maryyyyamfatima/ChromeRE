package defpackage;

import J.N;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.components.page_info.ConnectionInfoView;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12193zg2 implements InterfaceC0558Eh2, L30 {
    public final InterfaceC10141th2 a;
    public final WebContents g;
    public final PageInfoRowView h;
    public final AbstractC2242Rg2 i;
    public final InterfaceC11521xi4 j;
    public final String k;
    public final boolean l;
    public String m;
    public ConnectionInfoView n;
    public FrameLayout o;

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
    }

    public C12193zg2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, WebContents webContents, WO wo, String str, boolean z) {
        this.a = interfaceC10141th2;
        this.h = pageInfoRowView;
        this.g = webContents;
        this.i = wo;
        this.j = wo.b;
        this.k = str;
        this.l = z;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.m;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        PageInfoRowView pageInfoRowView = this.h;
        this.o = new FrameLayout(pageInfoRowView.getContext());
        this.n = new ConnectionInfoView(pageInfoRowView.getContext(), this.g, this, this.j);
        return this.o;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
        this.o = null;
        ConnectionInfoView connectionInfoView = this.n;
        N.MISU_God(connectionInfoView.l, connectionInfoView);
    }
}
