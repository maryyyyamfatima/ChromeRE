package defpackage;

import android.content.Context;
import androidx.appcompat.app.a;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fO3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5232fO3 {
    public final C4496dF a;
    public final Context b;
    public final ToggleTabStackButton c;
    public final Q44 d;
    public final InterfaceC7913nB e;
    public final InterfaceC0408Dd2 f;
    public final InterfaceC0408Dd2 g;
    public final Callback h;
    public final C10452uc0 i;
    public InterfaceC1422Ky1 j;
    public C4888eO3 k;
    public boolean l;

    public C5232fO3(a aVar, ToggleTabStackButton toggleTabStackButton, Q44 q44, C11417xP3 c11417xP3, InterfaceC0408Dd2 interfaceC0408Dd2, InterfaceC0408Dd2 interfaceC0408Dd22, InterfaceC0408Dd2 interfaceC0408Dd23, RP3 rp3, C6166i6 c6166i6) {
        C4496dF c4496dF = new C4496dF();
        this.a = c4496dF;
        this.b = aVar;
        this.c = toggleTabStackButton;
        this.d = q44;
        this.e = c11417xP3;
        this.f = interfaceC0408Dd2;
        this.g = interfaceC0408Dd22;
        this.h = rp3;
        interfaceC0408Dd23.j(c4496dF.b(new Callback() { // from class: aO3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC1422Ky1 interfaceC1422Ky1 = (InterfaceC1422Ky1) obj;
                C5232fO3 c5232fO3 = C5232fO3.this;
                c5232fO3.j = interfaceC1422Ky1;
                C4888eO3 c4888eO3 = new C4888eO3(c5232fO3);
                c5232fO3.k = c4888eO3;
                ((C9897sy1) interfaceC1422Ky1).e(c4888eO3);
            }
        }));
        this.i = new C10452uc0(c6166i6, new C4545dO3(this), null);
    }
}
