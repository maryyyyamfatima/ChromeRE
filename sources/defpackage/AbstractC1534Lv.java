package defpackage;

import android.content.Intent;
import android.util.SparseArray;
import com.android.chrome.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import org.chromium.chrome.browser.media.router.ChromeMediaRouterClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lv */
/* loaded from: classes2.dex */
public abstract class AbstractC1534Lv implements InterfaceC8324oO1, InterfaceC5764gw {
    public C7636mO1 a;
    public final AbstractC6450iw g;

    @Override // defpackage.InterfaceC8324oO1
    public final void b(int i) {
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void e(long j) {
    }

    public abstract Intent f();

    public abstract int g();

    public AbstractC1534Lv(AbstractC6450iw abstractC6450iw) {
        this.g = abstractC6450iw;
    }

    @Override // defpackage.InterfaceC5764gw
    public final void p() {
        C7636mO1 c7636mO1 = new C7636mO1();
        c7636mO1.b = false;
        C1560Ma0 c1560Ma0 = this.g.c;
        c7636mO1.c = c1560Ma0.d;
        c7636mO1.d = c1560Ma0.e;
        c7636mO1.e = c1560Ma0.f;
        c7636mO1.j = 2;
        c7636mO1.l = f();
        c7636mO1.f = R.drawable.0_resource_name_obfuscated_res_0x7f0902ea;
        c7636mO1.h = R.drawable.0_resource_name_obfuscated_res_0x7f090117;
        c7636mO1.k = g();
        c7636mO1.m = this;
        this.a = c7636mO1;
        h();
        ChromeMediaRouterClient chromeMediaRouterClient = ChromeMediaRouterClient.a;
        C7980nO1 a = this.a.a();
        chromeMediaRouterClient.getClass();
        AbstractC11751yO.a(a);
    }

    @Override // defpackage.InterfaceC5764gw
    public final void S() {
        int g = g();
        SparseArray sparseArray = AbstractC8667pO1.a;
        C6948kO1 c6948kO1 = (C6948kO1) sparseArray.get(g);
        if (c6948kO1 != null) {
            c6948kO1.b();
            sparseArray.remove(g);
        }
        this.a = null;
    }

    @Override // defpackage.InterfaceC5764gw
    public final void G() {
        MediaStatus e;
        if (this.a == null) {
            return;
        }
        AbstractC6450iw abstractC6450iw = this.g;
        if (abstractC6450iw.g() && (e = abstractC6450iw.e().e()) != null) {
            int i = e.j;
            if (i == 3 || i == 2) {
                C7636mO1 c7636mO1 = this.a;
                c7636mO1.b = i != 2;
                c7636mO1.j = 3;
            } else {
                this.a.j = 2;
            }
            ChromeMediaRouterClient chromeMediaRouterClient = ChromeMediaRouterClient.a;
            C7980nO1 a = this.a.a();
            chromeMediaRouterClient.getClass();
            AbstractC11751yO.a(a);
        }
    }

    @Override // defpackage.InterfaceC5764gw
    public final void j() {
        if (this.a == null) {
            return;
        }
        h();
        ChromeMediaRouterClient chromeMediaRouterClient = ChromeMediaRouterClient.a;
        C7980nO1 a = this.a.a();
        chromeMediaRouterClient.getClass();
        AbstractC11751yO.a(a);
    }

    public final void h() {
        MediaMetadata mediaMetadata;
        org.chromium.services.media_session.MediaMetadata mediaMetadata2 = new org.chromium.services.media_session.MediaMetadata("", "", "");
        this.a.a = mediaMetadata2;
        AbstractC6450iw abstractC6450iw = this.g;
        if (abstractC6450iw.g()) {
            CastDevice castDevice = abstractC6450iw.a.i;
            if (castDevice != null) {
                mediaMetadata2.a = castDevice.i;
            }
            MediaInfo d = abstractC6450iw.e().d();
            if (d == null || (mediaMetadata = d.i) == null) {
                return;
            }
            String t1 = mediaMetadata.t1("com.google.android.gms.cast.metadata.TITLE");
            if (t1 != null) {
                mediaMetadata2.a = t1;
            }
            String t12 = mediaMetadata.t1("com.google.android.gms.cast.metadata.ARTIST");
            if (t12 == null) {
                t12 = mediaMetadata.t1("com.google.android.gms.cast.metadata.ALBUM_ARTIST");
            }
            if (t12 != null) {
                mediaMetadata2.b = t12;
            }
            String t13 = mediaMetadata.t1("com.google.android.gms.cast.metadata.ALBUM_TITLE");
            if (t13 != null) {
                mediaMetadata2.c = t13;
            }
        }
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void c(int i) {
        AbstractC6450iw abstractC6450iw = this.g;
        if (abstractC6450iw.g()) {
            abstractC6450iw.e().n();
            EI2.h(0, 3, "Cast.Sender.Clank.NotificationControlsAction");
        }
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void d(int i) {
        AbstractC6450iw abstractC6450iw = this.g;
        if (abstractC6450iw.g()) {
            abstractC6450iw.e().m();
            EI2.h(1, 3, "Cast.Sender.Clank.NotificationControlsAction");
        }
    }

    @Override // defpackage.InterfaceC8324oO1
    public final void a() {
        if (this.g.g()) {
            AbstractC6450iw.c();
            EI2.h(2, 3, "Cast.Sender.Clank.NotificationControlsAction");
        }
    }
}
