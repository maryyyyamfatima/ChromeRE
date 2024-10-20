package defpackage;

import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JQ3 extends HF {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ToolbarPhone i;

    public JQ3(ToolbarPhone toolbarPhone, boolean z, boolean z2) {
        this.i = toolbarPhone;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.HF
    public final void c() {
        boolean z = this.g;
        ToolbarPhone toolbarPhone = this.i;
        if (!z) {
            toolbarPhone.V = true;
        } else {
            toolbarPhone.W = true;
            toolbarPhone.requestLayout();
        }
    }

    @Override // defpackage.HF
    public final void a() {
        boolean z = this.g;
        ToolbarPhone toolbarPhone = this.i;
        if (!z) {
            toolbarPhone.V = false;
        }
        toolbarPhone.R = false;
    }

    @Override // defpackage.HF
    public final void b() {
        ToolbarPhone toolbarPhone = this.i;
        boolean z = this.g;
        if (!z) {
            toolbarPhone.V = false;
            toolbarPhone.W = false;
            toolbarPhone.requestLayout();
        }
        a aVar = toolbarPhone.w;
        boolean c = toolbarPhone.j.c();
        aVar.o.D(z, this.h);
        if (c) {
            aVar.k.a();
        }
        toolbarPhone.R = false;
    }
}
