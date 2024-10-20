package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ur3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2688Ur3 extends ClickableSpan {
    public final /* synthetic */ InterfaceC3078Xr3 a;

    public C2688Ur3(InterfaceC3078Xr3 interfaceC3078Xr3) {
        this.a = interfaceC3078Xr3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
