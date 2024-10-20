package org.chromium.components.webauthn;

import J.N;
import defpackage.AbstractC7902n9;
import defpackage.C1063Ie2;
import defpackage.C1100Im;
import defpackage.C1730Ni0;
import defpackage.C8131np2;
import defpackage.C8697pU1;
import defpackage.C9497ro2;
import defpackage.C9840so2;
import defpackage.InterfaceC11197wm;
import defpackage.InterfaceC11540xm;
import defpackage.InterfaceC11883ym;
import defpackage.JE2;
import defpackage.ME2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.components.webauthn.InternalAuthenticator;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InternalAuthenticator {
    public long a;
    public final C1100Im b;

    public InternalAuthenticator(long j, RenderFrameHost renderFrameHost) {
        this.a = j;
        this.b = new C1100Im(null, renderFrameHost, 2);
    }

    public void setPaymentOptions(ByteBuffer byteBuffer) {
        C1730Ni0 a = AbstractC7902n9.a(new C8697pU1(byteBuffer, new ArrayList()));
        try {
            C8131np2 c8131np2 = new C8131np2(a.c(C8131np2.f).b);
            c8131np2.b = C9840so2.d(a.s(8, false));
            c8131np2.c = C9497ro2.d(a.s(16, false));
            c8131np2.d = a.v(24, true);
            c8131np2.e = C1063Ie2.d(a.s(32, true));
            a.a();
            this.b.k = c8131np2;
        } catch (Throwable th) {
            a.a();
            throw th;
        }
    }

    public static InternalAuthenticator create(long j, RenderFrameHost renderFrameHost) {
        return new InternalAuthenticator(j, renderFrameHost);
    }

    public void clearNativePtr() {
        this.a = 0L;
    }

    public void getAssertion(ByteBuffer byteBuffer) {
        this.b.o1(ME2.d(new C1730Ni0(new C8697pU1(byteBuffer, new ArrayList()))), new InterfaceC11197wm() { // from class: Np1
            @Override // defpackage.InterfaceC9648sF
            public final void a(Object obj, Object obj2, Object obj3) {
                Integer num = (Integer) obj;
                CY0 cy0 = (CY0) obj2;
                long j = InternalAuthenticator.this.a;
                if (j != 0) {
                    N.MHORk0l8(j, num.intValue(), cy0 == null ? null : cy0.b());
                }
            }
        });
    }

    public void makeCredential(ByteBuffer byteBuffer) {
        this.b.t(JE2.d(new C1730Ni0(new C8697pU1(byteBuffer, new ArrayList()))), new InterfaceC11883ym() { // from class: Op1
            @Override // defpackage.InterfaceC9648sF
            public final void a(Object obj, Object obj2, Object obj3) {
                Integer num = (Integer) obj;
                FK1 fk1 = (FK1) obj2;
                long j = InternalAuthenticator.this.a;
                if (j != 0) {
                    N.MpeuI$e6(j, num.intValue(), fk1 == null ? null : fk1.b());
                }
            }
        });
    }

    public void setEffectiveOrigin(Origin origin) {
        this.b.j = origin;
    }

    public void isUserVerifyingPlatformAuthenticatorAvailable() {
        this.b.y0(new InterfaceC11540xm() { // from class: Mp1
            @Override // defpackage.InterfaceC9305rF
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                long j = InternalAuthenticator.this.a;
                if (j != 0) {
                    N.MdPQq0XF(j, bool.booleanValue());
                }
            }
        });
    }

    public void cancel() {
        this.b.getClass();
    }
}
