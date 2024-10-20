package defpackage;

import android.content.Context;
import androidx.appcompat.app.a;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tj1 */
/* loaded from: classes.dex */
public final class C2516Tj1 {
    public final Context a;
    public final InterfaceC10590uz3 b;
    public final ZX1 c;
    public final C3166Yj1 d;
    public final SettingsLauncher e;
    public final boolean f;
    public final C8619pE3 g;
    public C8266oC3 h;
    public final InterfaceC10240ty1 i;

    public C2516Tj1(a aVar, InterfaceC10590uz3 interfaceC10590uz3, ZX1 zx1, C3166Yj1 c3166Yj1, I53 i53, C0538Ed2 c0538Ed2, C8619pE3 c8619pE3, C9897sy1 c9897sy1, boolean z) {
        C4496dF c4496dF = new C4496dF();
        this.a = aVar;
        this.b = interfaceC10590uz3;
        this.c = zx1;
        this.d = c3166Yj1;
        this.e = i53;
        this.g = c8619pE3;
        this.i = c9897sy1;
        this.f = z;
        if (z) {
            c0538Ed2.j(c4496dF.b(new Callback() { // from class: Rj1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C2516Tj1.this.h = (C8266oC3) obj;
                }
            }));
        }
    }
}
