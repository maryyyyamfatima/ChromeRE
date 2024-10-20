package defpackage;

import J.N;
import org.chromium.content.browser.MediaSessionImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zR1 */
/* loaded from: classes2.dex */
public final class C12111zR1 implements InterfaceC8324oO1 {
    public final /* synthetic */ ER1 a;

    @Override // defpackage.InterfaceC8324oO1
    public final void a() {
        ER1 er1 = this.a;
        if (er1.g()) {
            return;
        }
        Integer c = ER1.c(1000);
        if (c != null) {
            EI2.h(c.intValue(), 3, "Media.Session.Stop");
        }
        MediaSessionImpl mediaSessionImpl = er1.d.a;
        if (mediaSessionImpl != null) {
            N.MW5s36cs(mediaSessionImpl.a, mediaSessionImpl);
        }
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void c(int i) {
        ER1 er1 = this.a;
        if (er1.g()) {
            return;
        }
        Integer c = ER1.c(i);
        if (c != null) {
            EI2.h(c.intValue(), 3, "Media.Session.Play");
        }
        MediaSessionImpl mediaSessionImpl = er1.d.a;
        if (mediaSessionImpl == null) {
            return;
        }
        N.MlezJYnz(mediaSessionImpl.a, mediaSessionImpl);
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void d(int i) {
        ER1 er1 = this.a;
        if (er1.g()) {
            return;
        }
        Integer c = ER1.c(i);
        if (c != null) {
            EI2.h(c.intValue(), 3, "Media.Session.Pause");
        }
        MediaSessionImpl mediaSessionImpl = er1.d.a;
        if (mediaSessionImpl == null) {
            return;
        }
        N.M5LC9gX$(mediaSessionImpl.a, mediaSessionImpl);
    }

    public C12111zR1(ER1 er1) {
        this.a = er1;
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void b(int i) {
        BR1 br1;
        if ((i >= 0 && i <= 17) && (br1 = this.a.d) != null) {
            MediaSessionImpl mediaSessionImpl = br1.a;
            N.MAqRqyJa(mediaSessionImpl.a, mediaSessionImpl, i);
        }
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void e(long j) {
        BR1 br1 = this.a.d;
        if (br1 == null) {
            return;
        }
        MediaSessionImpl mediaSessionImpl = br1.a;
        N.MK7btVfc(mediaSessionImpl.a, mediaSessionImpl, j);
    }
}
