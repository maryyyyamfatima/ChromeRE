package defpackage;

import J.N;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.services.media_session.MediaPosition;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wv2 */
/* loaded from: classes2.dex */
public final class C2967Wv2 extends QR1 {
    public final InterfaceC0079Ap3 b;
    public C2837Vv2 c;
    public MediaPosition d;
    public boolean e;
    public boolean f;

    public C2967Wv2(MediaSessionImpl mediaSessionImpl, Da4 da4) {
        super(mediaSessionImpl);
        this.c = new C2837Vv2();
        this.b = da4;
    }

    @Override // defpackage.QR1
    public final void e(MediaPosition mediaPosition) {
        if (mediaPosition != null) {
            this.c.b = mediaPosition.a();
        }
        h(mediaPosition);
        this.c.c = g(mediaPosition == null ? this.d : mediaPosition);
        this.d = mediaPosition;
    }

    @Override // defpackage.QR1
    public final void f(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
        h(this.d);
    }

    public final void h(MediaPosition mediaPosition) {
        EnumC2707Uv2 enumC2707Uv2 = this.c.a;
        boolean z = this.e;
        EnumC2707Uv2 enumC2707Uv22 = EnumC2707Uv2.ENDED;
        EnumC2707Uv2 enumC2707Uv23 = EnumC2707Uv2.PAUSED;
        if (z) {
            enumC2707Uv2 = this.f ? enumC2707Uv23 : EnumC2707Uv2.PLAYING;
        } else if (mediaPosition == null) {
            MediaPosition mediaPosition2 = this.d;
            if (mediaPosition2 == null) {
                enumC2707Uv2 = EnumC2707Uv2.INITIAL;
            } else if (mediaPosition2.a() == g(this.d)) {
                enumC2707Uv2 = enumC2707Uv22;
            }
        }
        C2837Vv2 c2837Vv2 = this.c;
        if (enumC2707Uv2 == c2837Vv2.a) {
            return;
        }
        c2837Vv2.a = enumC2707Uv2;
        int ordinal = enumC2707Uv2.ordinal();
        if (ordinal != 0) {
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.b;
            if (ordinal == 1) {
                Ta4 ta4 = (Ta4) interfaceC0079Ap3.get();
                AbstractC9764sb4.c(ta4.f.a, 3);
                if (ta4.j != 0) {
                    EI2.k(System.currentTimeMillis() - ta4.j, "VideoTutorials.Player.LoadTimeLatency");
                    ta4.j = 0L;
                }
                ta4.c.k(Ua4.a, false);
                ta4.a();
                return;
            }
            LD2 ld2 = Ua4.h;
            LD2 ld22 = Ua4.e;
            LD2 ld23 = Ua4.d;
            PD2 pd2 = Ua4.p;
            LD2 ld24 = Ua4.c;
            LD2 ld25 = Ua4.g;
            if (ordinal == 2) {
                Ta4 ta42 = (Ta4) interfaceC0079Ap3.get();
                AbstractC9764sb4.c(ta42.f.a, 2);
                LD2 ld26 = Ua4.f;
                PropertyModel propertyModel = ta42.c;
                propertyModel.k(ld26, false);
                propertyModel.k(ld25, false);
                int i = ta42.f.a;
                propertyModel.k(ld24, i == 4 || i == 5);
                propertyModel.o(pd2, enumC2707Uv23);
                C7928nE c7928nE = UN.a;
                propertyModel.k(ld23, N.M6bsIDpc("VideoTutorials", "enable_share", true));
                propertyModel.k(ld22, true);
                propertyModel.k(ld2, false);
                return;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return;
                }
                ((Ta4) interfaceC0079Ap3.get()).getClass();
                return;
            }
            final Ta4 ta43 = (Ta4) interfaceC0079Ap3.get();
            AbstractC9764sb4.c(ta43.f.a, 1);
            int i2 = ta43.f.a;
            VideoTutorialServiceBridge videoTutorialServiceBridge = ta43.b;
            boolean z2 = videoTutorialServiceBridge.a(i2).size() > 1;
            PropertyModel propertyModel2 = ta43.c;
            propertyModel2.k(ld25, z2);
            videoTutorialServiceBridge.b(new C11479xb4(ta43.f, new Callback() { // from class: Sa4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Tutorial tutorial = (Tutorial) obj;
                    Ta4 ta44 = Ta4.this;
                    ta44.getClass();
                    ta44.c.k(Ua4.f, tutorial != null);
                }
            }));
            int i3 = ta43.f.a;
            propertyModel2.k(ld24, i3 == 4 || i3 == 5);
            propertyModel2.o(pd2, enumC2707Uv22);
            C7928nE c7928nE2 = UN.a;
            propertyModel2.k(ld23, N.M6bsIDpc("VideoTutorials", "enable_share", true));
            propertyModel2.k(ld22, true);
            propertyModel2.k(ld2, true);
        }
    }

    public static long g(MediaPosition mediaPosition) {
        if (mediaPosition == null) {
            return 0L;
        }
        long min = Math.min((mediaPosition.c.floatValue() * ((float) (SystemClock.elapsedRealtime() - mediaPosition.d.longValue()))) + ((float) mediaPosition.b.longValue()), mediaPosition.a());
        return mediaPosition.a() - min < 100 ? mediaPosition.a() : min;
    }
}
